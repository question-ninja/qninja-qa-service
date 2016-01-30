package com.qninja.qa.model.question;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.qninja.qa.model.GeoLocation;
import com.qninja.qa.model.User;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
public class Question {

	public enum Status {OPEN,CLOSED,ANSWERED,FLAGGED}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	private User asker;

	@Column(length = 100)
	private String title;

	@Column(length = 500)
	private String text;

	private String type;

	@ElementCollection
	private Collection<String> labels;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "question")
	private Collection<Choice> choices;

	@Embedded
	private GeoLocation geoLocation;

	private Status questionStatus;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getAsker() {
		return asker;
	}

	public void setAsker(User asker) {
		this.asker = asker;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Collection<String> getLabels() {
		return labels;
	}

	public void setLabels(Collection<String> labels) {
		this.labels = labels;
	}

	public GeoLocation getGeoLocation() {
		return geoLocation;
	}

	public void setGeoLocation(GeoLocation geoLocation) {
		this.geoLocation = geoLocation;
	}

	public Status getQuestionStatus() {
		return questionStatus;
	}

	public void setQuestionStatus(Status questionStatus) {
		this.questionStatus = questionStatus;
	}

	public Collection<Choice> getChoices() {
		return choices;
	}

	public void setChoices(Collection<Choice> choices) {
		this.choices = choices;
	}
}
