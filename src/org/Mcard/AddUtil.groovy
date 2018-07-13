package org.Mcard

class AddUtil implements Serializable
{
def steps

public AddUtil(steps)  {this.steps=steps}

public void sum(script, int a, int b)
{
 def c= a + b
steps.echo "This ia A value : ${script.env.a}"
steps.echo "${script.env.c}"
}
}
