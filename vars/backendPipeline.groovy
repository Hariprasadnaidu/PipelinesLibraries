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
                steps.echo " ${env.Name}"
                steps.echo "This is ${env.BranchName}"
                steps.echo "This is ${env.JobName}"
                steps.echo "This is ${env.ChangeTitle}"
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
