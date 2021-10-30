pipeline {
    agent any

    stages {
        stage('Clone Repo') {
            steps {
                git 'git@github.com:RuMurf/student-registration-system.git'
            }
        }
        stage("Set Up") {
            steps {
                sh "chmod +x gradlew"
            }
        }
        stage("Compile Code") {
            steps {
                echo "Compiling code"
                sh "./gradlew compileJava"
            }
        }
        stage("Compile Tests") {
            steps {
                echo "Compiling tests"
                sh "./gradlew compileTestJava"
            }
        }
        stage("Test") {
            steps{
                echo "Running tests"
                sh "./gradlew clean test"
            }
        }
        stage("Build") {
            steps {
                echo "Tests ran successfullly, building project"
                sh "./gradlew build"
            }
        }
    }
    post {
        success {
            build job: 'student-driver'
        }
    }
}
