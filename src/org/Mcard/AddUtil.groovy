package org.Mcard

class AddUtil implements Serializable
{
def steps

public AddUtil(steps)  {this.steps=steps}

public void sum(script, String str)
{

script.env.Name = str
steps.echo "This is : ${steps.env.Name}"

}
}
