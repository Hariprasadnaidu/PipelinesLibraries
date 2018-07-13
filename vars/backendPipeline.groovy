 def call()
{
def addutil = new org.Mcard.AddUtil(this)
pipeline {
    agent any
    stages {
        stage('Example') {
            steps {
                 script {
                  addutil.Display(this, "Hari")
                steps.echo " This is ${env.Name}"
                steps.echo "This is ${env.BRANCH_NAME}"
                steps.echo "This is ${env.JOB_NAME}"
                steps.echo "This is ${env.CHANGE_TITLE}"
                 addutil.sum(this, 2, 3)
                 steps.echo "This is SUM Value : ${env.c}"
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
