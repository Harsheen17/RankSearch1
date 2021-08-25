package com.coupa.wordaddin;

import org.openqa.selenium.support.FindBy;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

public class InstallAddinPageObjects {

	@FindBy(name="")
	public Element user_initials;
	
	@FindBy(name="Blank document")
	public Element clickblankdoc;
}