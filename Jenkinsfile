pipeline{
    agent any
    tools {
        maven 'maven' 
    }
    stages{
        stage ('build') {
        steps
        {
            sh 'mvn --version'
            git 'https://github.com/shaiknadeem95/springBootJenkins.git'
            sh 'mvn clean install'
        }
            
        }
      stage('Static Code Analysis') {
      environment {
        SONAR_URL = "http://localhost:9000"
      }
      steps {
        withCredentials([string(credentialsId: 'jenkinsSonar', variable: 'SONAR_AUTH_TOKEN')]) {
          sh 'mvn sonar:sonar -Dsonar.login=$SONAR_AUTH_TOKEN -Dsonar.host.url=${SONAR_URL}'
        }
      }
    }
        stage('building the docker image')
        {
        	steps{
        		script{
        		sh 'docker build -t 7674836842/spring-boot-jenkins-nadeem-pro1:latest .'
        		withCredentials([string(credentialsId: 'dockerpwd', variable: 'dockerpassword')]) {
    			sh 'docker login -u 7674836842 -p ${dockerpassword}'
    			sh 'docker push 7674836842/spring-boot-jenkins-nadeem-pro1:latest'
				}
        		}
        	}
        }
    }
}