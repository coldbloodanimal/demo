pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
                sh 'mvn package'
            }
        }
        stage('Deploy') {
            steps {
                sh 'ps -ef | grep 'java -jar demo-web-0.0.1-SNAPSHOT.jar' | grep -v grep | awk '{print $2}' | xargs kill -9'
                sh 'nohup java -jar demo-web-0.0.1-SNAPSHOT.jar --server.port=18080 &'
                sh 'nohup java -jar demo-web-0.0.1-SNAPSHOT.jar --server.port=28080 &'
            }
        }
    }
}