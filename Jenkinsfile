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
      post {
        always {
          junit '**/target/surefire-reports/*.xml'
        }
      }
    }
    stage('Build container') {
      steps {
        sh 'docker build -t ticket:latest .'
        sh 'docker images | grep "none" | awk "{print $3}" | xargs docker rmi'
        sh 'docker stop ticket || true'
        sh 'docker rm -fv ticket || true'
        sh 'docker run -dti -p 8081:8081 --name ticket ticket:latest'
      }
    }
  }
}
