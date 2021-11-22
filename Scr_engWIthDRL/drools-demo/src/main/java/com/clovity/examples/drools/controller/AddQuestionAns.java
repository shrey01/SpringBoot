package com.clovity.examples.drools.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.clovity.examples.drools.domain.Candidate;
import com.clovity.examples.drools.domain.Option;
import com.clovity.examples.drools.domain.Questionnaire;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

@RestController
public class AddQuestionAns {
	
	public void getQA(Candidate cd, Option op, Questionnaire qstn) {
		List<String> li = new ArrayList<>();
		li.add("Q1.What is the name of the method used to start a thread execution?");
		li.add("Q2.Which two are valid constructors for Thread?");
		li.add("Q3.Which three are methods of the Object class?");
		qstn.setQuestList(li);
		List<String> o = new ArrayList<>();
		o.add("1");
		o.add("2");
		o.add("3");
		o.add("4");
		cd.setListo(o);
	}
}
