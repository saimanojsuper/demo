pipeline {
  agent any
  stages {	
	stage('Maven Compile'){
		steps{
			echo 'Project compile stage'
			bat label: 'Compilation running', script: '''mvn compile'''
	       	}
	}
	
	stage('Unit Test') {
	   steps {
			echo 'Project Testing stage'
			bat label: 'Test running', script: '''mvn test'''
	       
       		}
   	}
	  
	/*stage('Publish Test Coverage Report') {
         steps {
           step([$class: 'JacocoPublisher', 
     		 execPattern: 'target/*.exec',
     		 classPattern: 'target/classes',
     		 sourcePattern: 'src/main/java',
     		 exclusionPattern: 'src/test*'
		])
            }
        }*/
	  
	stage('Jacoco Coverage Report') {
        steps{
            jacoco()
		}
	}
	  
	stage('SonarQube'){
         steps{
            bat label: '', script: '''mvn sonar:sonar \
		 -Dsonar.host.url=http://localhost:9000 \
 		-Dsonar.login=f7124b0b0d82301ab15bd87e3987da453beb0f05'''
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
