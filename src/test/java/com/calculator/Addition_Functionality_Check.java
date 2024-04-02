package com.calculator;

import org.setup.Launch_setup;
import org.testng.annotations.Test;

import com.pagobj.Calculator_PageObj;

public class Addition_Functionality_Check extends Launch_setup{
	@Test
	public void Add() throws InstantiationException{

		Calculator_PageObj calculator = new Calculator_PageObj();

		calculator.AddingNums();

	}
}
