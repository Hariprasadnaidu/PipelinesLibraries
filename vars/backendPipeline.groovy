def call()
{
pipeline{
 agent{"master"}
 stages
{
stage ('test') {
                   sh "echo 'this is sample library'" 
                }
  }
}
}

