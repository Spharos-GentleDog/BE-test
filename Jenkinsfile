pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh '''
                    chmod +x gradlew
                    ./gradlew build -x test
                '''
            }
        }
        stage('DockerSize') {
            steps {
                sh '''
                    docker stop test-server || true
                    docker rm test-server || true
                    docker rmi test-server || true
                    docker build -t test-server .
                '''
            }
        }
        stage('Deploy') {
            steps {
                sh 'docker run -d --name test-server -p 8000:8000 test-server'
            }
        }
    }
}