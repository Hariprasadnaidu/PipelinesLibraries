package org.Mcard

class BuildUtil implements Serializable
{
def steps

public BuildUtil(steps)  {this.steps=steps}

public void buildProject(script)
{

steps.sh "/work/jenkins/apache-maven-3.5.0/bin/mvn package"
steps.echo "Build completed successfully"


}
}
