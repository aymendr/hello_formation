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
        
    }
}
