package org.Mcard

class AddUtil implements Serializable
{
def steps

public AddUtil(steps)  {this.steps=steps}

public void Display(script, String str)
{

steps.env.Name = str


}

public void sum(script, int a, int b)
{
 script.env.c = a + b


}
}
