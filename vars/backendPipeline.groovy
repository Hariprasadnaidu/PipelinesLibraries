def call()
{
pipeline{
agent{
 stages
{
stage ('test') {
                   sh "echo 'this is sample library'" 
                }
  }
}
}
}
