#!/usr/bin/env groovy

@Library('nynja-common') _

pipeline {
  environment {
    SLACK_CHANNEL = "#nynja-devops-feed"
  }
  agent {
    kubernetes(builders.simple("jdk", "openjdk:8-jdk"))
  }
  options {
    skipDefaultCheckout()
    buildDiscarder(logRotator(numToKeepStr: '15'))
  }
  stages {
    stage('Checkout') {
      steps {
        container('jdk') {
          script {
            def vars = checkout scm
            vars.each { k,v -> env.setProperty(k, v) }
          }
        }
      }
    }
    stage('Build') {
      when { not { changeRequest() } }
      steps {
        container('jdk') {
          withCredentials([usernamePassword(credentialsId: 'artifactory-global-publisher', usernameVariable: 'USER', passwordVariable: 'PASS')]) {
	    sh 'echo "" >> gradle.properties'
	    sh 'echo "nynjagroup_jfrog_io_user = $USER" >> gradle.properties'
	    sh 'echo "nynjagroup_jfrog_io_password = $PASS" >> gradle.properties'
            sh 'sed -i s/1\\.0\\.nynja\\.1\\.4-SNAPSHOT/1\\.0\\.nynja\\.1\\.4-SNAPSHOT1/ build.gradle'
	    sh './gradlew --no-daemon -Dplatforms.JDK_1.6.home=$JAVA_HOME ant-default publish'
          }
        }
      }
    }
  }
  //post {
    //success {
    // slackSend channel: SLACK_CHANNEL, message: "Published new calling libraries from $BRANCH_NAME", color: 'good'
    //}
    //failure {
    //  slackSend channel: SLACK_CHANNEL, message: slackEndMsg(), color: 'danger'
    //}
  //}
}
