def call()
{
def buildUtil = new org.Mcard.BuildUtil(this)
pipeline {
    agent any
    stages {

        stage('Checkout') {
            steps {
                 script {
            checkout scm
            script.env.currentGitbranch=env.BRANCH_NAME
            steps.echo "This is ${env.currentGitbranch} branch"                 
                
}
            }
        }
        stage('Build the Repository') {
            steps {
                 script {
                
                        buildUtil.buildProject(this)
                  
                
}
            }
        }
    }
    post { 
        always { 
            echo 'I will always say Hello again!'
        }
    }
}
}
