pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/Afrinriswana12/StudentManagementSystem.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }
    }
}