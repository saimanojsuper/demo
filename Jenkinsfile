pipeline {
  agent any
  stages {	
	
	
	stage('Unit Test') {
	   steps {
			echo 'Project Testing stage'
			bat label: 'Test running', script: '''mvn test'''
	       
       }
   	}
	
	stage('Maven Package'){
		steps{
			echo 'Project packaging stage'
			bat label: 'Project packaging', script: '''mvn package'''
		}
	} 		
    
  }
}