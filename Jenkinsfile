pipeline {
    agent any
    tools {
        maven 'Apache Maven 3.8.7'
        jdk 'java-21'
    }
    environment {
        MVN_COMMAND = "mvn clean install -D maven.test.skip=true"
        GIT_CREDENTIALS_ID = "k6knfTUMF11/9eWqqJpYQ0R/cRUF+aDRjybD6voZAfE"
        ARTIFACT = "test-1.0.0-SNAPSHOT"
    }
    stages {
        stage('Build') {
            steps {
                checkout([
                        $class: 'GitSCM',
                        branches: [[name: "master"]],
                        doGenerateSubmoduleConfigurations: false,
                        extensions: [],
                        submoduleCfg: [],
                        userRemoteConfigs: [
                            [credentialsId: "$GIT_CREDENTIALS_ID",
                            url: 'https://github.com/misho-999/testServer'
                            ]]])
                sh '$MVN_COMMAND'
            }
        }
        stage('Deploy') {
            steps {
                script {
 			def remote = [:]
                  	remote.name = "185.228.26.15"
                    	remote.host = "185.228.26.15"
                    	remote.port = 8080
	                remote.user = 'root'
                  	remote.password = ''
                  	remote.logLevel = "INFO"

                   	sh 'sudo systemctl stop test'
                   	sh 'sudo systemctl start test'
                }
            }
        }
    }
}
