pipeline {
    agent { docker 'maven:3.3.3' }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
                sh 'mvn package'
            }
        }
        stage('Deploy') {
            steps {
                sh 'nohup java -jar demo-web-0.0.1-SNAPSHOT.jar --server.port=18080 &'
                sh 'nohup java -jar demo-web-0.0.1-SNAPSHOT.jar --server.port=28080 &'
            }
        }
    }
}