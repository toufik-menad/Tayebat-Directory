pipeline {
    agent any
    stages {
        stage('build') {
            steps{
                sh ' cd RestServices'
                sh 'mvn clean install'
            }
        }
    }
}