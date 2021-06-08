pipeline {
  agent any

  tools {
  maven 'mvnLocal'
  }

  stages {
    stage('Compile') {
      steps {
        sh 'mvn clean install test'
      }
    }
    stage('Build container') {
      steps {
        sh 'docker build -t ticket:latest .'
        sh 'docker stop ticket:latest || true'
        sh 'docker rm -fv ticket:latest || true'
        sh 'docker run -dti -p 8081:8081 --name ticket ticket:latest'
      }
    }
  }
}
