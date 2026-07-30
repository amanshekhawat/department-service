pipeline {
    agent any
    stages {
        stage('Build JAR') {
            steps { sh './mvnw clean package -DskipTests' }
        }
        stage('Build Docker Image') {
            steps { sh 'docker build -t department-service:1.0 .' }
        }
        stage('Run Container') {
            steps {
                sh 'docker stop department || true'
                sh 'docker rm department || true'
                sh 'docker run -d -p 8082:8082 --network app-network --name department department-service:1.0'
            }
        }
    }
}