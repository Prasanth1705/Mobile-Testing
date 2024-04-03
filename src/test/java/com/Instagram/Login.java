package com.Instagram;

import org.setup.Launch_setup;
import org.testng.annotations.Test;

import com.pagobj.InstagramLoginPageobj;

public class Login extends Launch_setup{
	@Test
	public void Add() throws InstantiationException{

		InstagramLoginPageobj Insta = new InstagramLoginPageobj();

		Insta.LoginDetails();

	}
}
