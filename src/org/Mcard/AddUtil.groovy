package org.Mcard

class AddUtil implements Serializable
{
def steps

public AddUtil(steps)  {this.steps=steps}

public void sum(script, String str)
{

script.env.Name = str
steps.echo "This is : ${steps.env.Name}"

script.env.BranchName = env.BRANCH_NAME
script.env.ChangeTitle = env.CHANGE_TITLE
script.env.JobName = env.JOB_NAME


}
}
