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
        stage('building the docker image')
        {
        	steps{
        		script{
        		sh 'docker build -t springBootJenkins:latest .'
        		}
        	}
        }
    }
}