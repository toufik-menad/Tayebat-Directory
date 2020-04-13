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
                sh 'java -jar RestServices/target/RestServices-1.0.0-SNAPSHOT-spring-boot.jar --spring.config.file=RestServices/src/main/resources/application-prod.properties'
                 }
                         }



            }
}
