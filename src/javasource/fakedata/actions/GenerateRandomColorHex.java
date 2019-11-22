// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package fakedata.actions;

import com.github.javafaker.Faker;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

public class GenerateRandomColorHex extends CustomJavaAction<java.lang.String>
{
	private java.lang.Boolean HashSign;

	public GenerateRandomColorHex(IContext context, java.lang.Boolean HashSign)
	{
		super(context);
		this.HashSign = HashSign;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		Faker faker = new Faker();
		return faker.color().hex(this.HashSign).toString();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "GenerateRandomColorHex";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
