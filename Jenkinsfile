pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "maven3"
    }

    stages {
        stage('Clone Repo') {
            steps {
                // Get some code from a GitHub repository
                git branch: 'dev', url: 'https://github.com/aymendr/hello_formation.git'

            }

        }
		
		stage('Build') {
            steps {
                echo 'Hello ici la modif'
                // Run Maven on a Windows agent.
                bat 'mvn clean package'

            }
		
        }

        stage('Deploy to Nexus'){
            steps{
                nexusArtifactUploader(
                    nexusVersion: 'nexus3',
                    protocol: 'http',
                    nexusUrl: 'localhost:8081',
                    groupId: 'com.mycompany',
                    version: 'hello-${env.BUILD_ID}',
                    repository: 'maven-jenkins-repo',
                    credentialsId: 'nexus_credentials',
                    artifacts: [
                        [artifactId: 'hello',
                        classifier: '',
                        file: 'target/hello-1.1-SNAPSHOT.jar',
                        type: 'jar']
                    ]
                )                
            }
        }
        
    }
}
