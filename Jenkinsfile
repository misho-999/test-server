pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('Deploy') {
            steps {
                sh 'sudo systemctl stop test-server'
				sh 'sudo systemctl start test-server'
            }
        }
    //     tools {
    //         maven 'Apache Maven 3.8.7'
    //         jdk 'java-21'
    //     }
    //     environment {
    //         MVN_COMMAND = "mvn clean install -D maven.test.skip=true"
    //         GIT_CREDENTIALS_ID = "k6knfTUMF11/9eWqqJpYQ0R/cRUF+aDRjybD6voZAfE"
    //         ARTIFACT = "test-1.0.0-SNAPSHOT"
    //     }
    // stages {
    //     stage('Build') {
    //         steps {
    //             sh 'mvn -B -DskipTests clean package'
    //         }
    //     }
    //     stage('Test') {
    //         steps {
    //             sh 'mvn test'
    //         }
    //         post {
    //             always {
    //                 junit 'target/surefire-reports/*.xml'
    //             }
    //         }
    //     }
    //     stage('Deploy') {
    //         steps {
    //             script {
    //                 def remote = [: ]
    //                 remote.name = "185.228.26.15"
    //                     remote.host = "185.228.26.15"
    //                     remote.port = 8080
    //                     remote.user = 'root'
    //                     remote.password = ''
    //                     remote.logLevel = "INFO"

    //                     sh 'sudo su systemctl stop test'
    //                     sh 'sudo systemctl start test'
    //             }
    //         }
    //     }
    // }
}
