pipeline {
    agent any
    stages {
        stage('build') {
            steps{
                sh ' cd ResetServices'
                sh 'mvn clean install'
            }
        }
    }
}