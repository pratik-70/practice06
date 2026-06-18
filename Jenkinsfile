pipeline {

    agent any

    tools {
            maven 'Maven3'
        }

    stages {

        stage('Checkout') {

            steps {
                checkout scm
            }

        }

        stage('Build') {

            steps {
                sh 'mvn clean compile'
            }

        }

        stage('Cross Browser Testing') {

            steps {
                sh 'mvn test'
            }

        }

    }

    post {

        success {
            echo 'Cross Browser Testing Successful'
        }

        failure {
            echo 'Cross Browser Testing Failed'
        }

    }

}