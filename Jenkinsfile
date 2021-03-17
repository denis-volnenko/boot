pipeline {
    agent any
    stages {
        stage('CLEAN') {
            steps {
				sh 'mvn clean'
            }
        }
        stage('BUILD') {
            steps {
                sh 'mvn install'
            }
        }
    }
	post {
	    always {
	        archiveArtifacts artifacts: '**/*.jar',
		    onlyIfSuccessful: true
	    }
	}
}
