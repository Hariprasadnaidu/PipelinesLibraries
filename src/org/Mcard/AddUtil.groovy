package org.Mcard

class AddUtil implements Serializable
{
def steps

public AddUtil(steps)  {this.steps=steps}

public void sum(script, String str)
{
steps.echo "This is : ${script.env.str}"

}
}
