pipeline {
    agent any

    stages {

        stage('Build Maven') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t rohithnemanidev/student-portal:v1 .'
            }
        }

        stage('Push Docker Image') {
            steps {
                sh 'docker push rohithnemanidev/student-portal:v1'
            }
        }

    }
}
