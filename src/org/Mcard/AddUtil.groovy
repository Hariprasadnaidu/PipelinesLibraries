package org.Mcard

class AddUtil implements Serializable
{
def steps

public AddUtil(steps)  {this.steps=steps}

public void sum(script, int a, int b)
{
 def c= a + b
def d = 10
steps.echo "This ia d value : ${script.env.d}".toInteger()
steps.echo "${script.env.c}".toInteger()
}
}
