package com.qninja.qa.model.answer;

import com.qninja.qa.model.GeoLocation;
import com.qninja.qa.model.User;
import com.qninja.qa.model.question.Question;

import javax.persistence.*;

@Entity
public class Answer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToOne
	private Question question;

	@ManyToOne
	private User answerer;

	private String answer;

	@Embedded
	private GeoLocation geoLocation;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public User getAnswerer() {
		return answerer;
	}

	public void setAnswerer(User answerer) {
		this.answerer = answerer;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public GeoLocation getGeoLocation() {
		return geoLocation;
	}

	public void setGeoLocation(GeoLocation geoLocation) {
		this.geoLocation = geoLocation;
	}
}
