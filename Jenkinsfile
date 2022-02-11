pipeline {
  agent any
  stage('Clean') {
	   steps {
			echo 'Project Cleaning stage'
			bat label: 'Cleaning', script: '''mvn clean'''
	       
       		}
   	}
   	
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
   	
   	
   	stage('Build') {
	   steps {
			echo 'Project Testing stage'
			bat label: 'Test Building', script: '''mvn build'''
	       
       		}
   	}

	 
   

			
    
  }
}
