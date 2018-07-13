package org.Mcard

class AddUtil implements Serializable
{
def steps

public AddUtil(steps)  {this.steps=steps}

public void sum(script, int a, int b)
{
 static String c = "Hari"
steps.echo "This is c value : ${script.env.c}"

}
}
