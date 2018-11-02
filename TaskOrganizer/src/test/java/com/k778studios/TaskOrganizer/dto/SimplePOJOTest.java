package com.k778studios.TaskOrganizer.dto;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SimplePOJOTest {
	
	private SimpleDTO simpleDto;
	
	@Before
	public void beforeTest()
	{
		simpleDto = new SimpleDTO();
	}
	
	@Test
	public void shouldSetAndGetAllFields()
	{
		String name = "Test";
		int age = 20;
		int yearsOfExperience = 3;
		
		simpleDto.setName(name);
		simpleDto.setAge(age);
		simpleDto.setYearsOfExperience(yearsOfExperience);
		
		Assert.assertEquals(name, simpleDto.getName());
		Assert.assertEquals(age, simpleDto.getAge());
		Assert.assertEquals(yearsOfExperience, simpleDto.getYearsOfExperience());
	}

}
