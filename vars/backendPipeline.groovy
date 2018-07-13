 def call()
{
def addutil = new  org.Mcard.AddUtil(this)
pipeline {
    agent any
    stages {
        stage('Example') {
            steps {
                 script {
                  addutil.sum(this, "Hari")
                steps.echo "${script.env.str}"
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
