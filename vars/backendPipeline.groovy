 def call()
{
def addutil = new org.Mcard.AddUtil(this)
pipeline {
    agent any
    stages {
        stage('Example') {
            steps {
                 script {
                  addutil.sum(this, "Hari")
                steps.echo "This is ${env.Name}"
                steps.echo "This is ${env.BRANCH_NAME}"
                steps.echo "This is ${env.JOB_NAME}"
                steps.echo "This is ${env.CHANGE_TITLE}"
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
