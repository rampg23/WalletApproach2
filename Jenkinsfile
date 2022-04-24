pipeline {
    agent any

    stages {
        stage('Pull') {
            steps {
                git url: 'https://github.com/rampg23/WalletApproach2.git', branch: 'main'
            }
        }
        stage('Test & Build'){
            steps{
            sh './gradlew clean test'
            sh './gradlew clean Build'
            }
        }
    }
}
