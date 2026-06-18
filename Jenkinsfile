pipeline {

    agent any

    stages {

        stage('Checkout') {

            steps {
                git 'YOUR_GITHUB_REPO'
            }

        }

        stage('Cross Browser Test') {

            steps {

                sh 'mvn clean test'

            }

        }

    }

}