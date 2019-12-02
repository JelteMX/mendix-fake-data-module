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
import fakedata.proxies.Country;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class GenerateCountry extends CustomJavaAction<IMendixObject>
{
	public GenerateCountry(IContext context)
	{
		super(context);
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		// BEGIN USER CODE
		Random random = new Random();
		Faker faker = new Faker(random);
		com.github.javafaker.Country country = faker.country();
		
		IMendixObject object = Core.instantiate(getContext(), Country.getType());
		
		object.setValue(getContext(), Country.MemberNames.Name.toString(), country.name());
		object.setValue(getContext(), Country.MemberNames.Flag.toString(), country.flag());
		object.setValue(getContext(), Country.MemberNames.Currency.toString(), country.currency());
		object.setValue(getContext(), Country.MemberNames.CurrencyCode.toString(), country.currencyCode());
		object.setValue(getContext(), Country.MemberNames.CountryCode2.toString(), country.countryCode2());
		object.setValue(getContext(), Country.MemberNames.CountryCode3.toString(), country.countryCode3());
		object.setValue(getContext(), Country.MemberNames.Capital.toString(), country.capital());
		
		return object;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "GenerateCountry";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
