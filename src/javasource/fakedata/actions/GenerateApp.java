// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package fakedata.actions;

import java.util.Random;
import com.github.javafaker.Faker;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import fakedata.proxies.App;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class GenerateApp extends CustomJavaAction<IMendixObject>
{
	public GenerateApp(IContext context)
	{
		super(context);
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		// BEGIN USER CODE
		Random random = new Random();
		Faker faker = new Faker(random);
		com.github.javafaker.App app = faker.app();
		
		IMendixObject object = Core.instantiate(getContext(), App.getType());
		
		object.setValue(getContext(), App.MemberNames.Name.toString(), app.name());
		object.setValue(getContext(), App.MemberNames.Author.toString(), app.author());
		object.setValue(getContext(), App.MemberNames.Version.toString(), app.version());
		
		return object;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "GenerateApp";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
