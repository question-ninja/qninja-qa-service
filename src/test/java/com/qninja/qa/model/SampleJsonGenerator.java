package com.qninja.qa.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.qninja.qa.model.question.Question;
import com.qninja.qa.model.question.Choice;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;

public class SampleJsonGenerator {

	private static ObjectMapper om = new ObjectMapper();

	static {
		om.setDateFormat(new SimpleDateFormat("MM/dd/yyy"));
		om.enable(SerializationFeature.INDENT_OUTPUT);
	}

	@Test
	public void userToJson() throws JsonProcessingException {

		User user = new User();
		user.setUsername("aglassman");
		user.setAge(30);

		Calendar bday = Calendar.getInstance();
		bday.set(1985,10,8);

		user.setBirthday(bday.getTime());

		user.setEmailAddress("andrew.glassman@gmail.com");

		user.setSex("M");

		System.out.println(om.writeValueAsString(user));

	}

	@Test
	public void questionToJson() throws JsonProcessingException {

		Question question = new Question();

		question.setQuestionStatus(Question.Status.OPEN);

		question.setLabels(Arrays.asList("first","science"));

		question.setType("Multiple Choice");

		question.setTitle("I'm hungry! Where to eat!?");

		question.setText("Where to go? So many good choice. Where my peeps at with the votes?");

		Choice c1 = new Choice();
		c1.setOrder(1);
		c1.setText("MC Donald's");

		Choice c2 = new Choice();
		c2.setOrder(2);
		c2.setText("Arby's");

		Choice c3 = new Choice();
		c3.setOrder(3);
		c3.setText("Pizza Man");

		question.setQuestionChoices(Arrays.asList(c1,c2,c3));

		GeoLocation geoLocation = new GeoLocation();
		geoLocation.setLatitude(43.0373580d);
		geoLocation.setLongitude(-88.1013240d);
		geoLocation.setAltitude(258.91d);

		question.setGeoLocation(geoLocation);

		System.out.println(om.writeValueAsString(question));


	}

}
