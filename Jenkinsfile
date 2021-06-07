pipeline {
  agent any

  tools {
  maven mvnLocal
  }

  stages {
    stage('Build') {
      steps {
        sh 'mvn clean install test'
      }
    }
  }
}
