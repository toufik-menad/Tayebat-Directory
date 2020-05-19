pipeline {
    agent any
    stages {
        stage('build') {
            steps{
                sh 'cd RestServices'
                sh 'mvn clean install'
                sh 'mvn package'
                sh 'echo "####### Build is done ##########"'
                }
                       }

            stage('run') {
            steps{
                sh 'sudo systemctl start tayebat'
                 }
                     }



            }
}
