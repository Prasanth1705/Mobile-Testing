package com.Instagram;

import org.generics.ExtentTestManager;
import org.setup.Launch_setup;
import org.testng.annotations.Test;

import com.pagobj.InstagramChatPageobj;

public class Chat extends Launch_setup{
	@Test
	public void Add() throws InstantiationException{

		ExtentTestManager.startTest("Testing", "Test");
		InstagramChatPageobj Insta = new InstagramChatPageobj();

		Insta.Chatbox();
		Insta.MsgtoPinky();

	}
}
