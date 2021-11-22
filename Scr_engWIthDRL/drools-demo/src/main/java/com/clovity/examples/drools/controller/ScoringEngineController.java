package com.clovity.examples.drools.controller;

import java.util.HashMap;
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
import com.clovity.examples.drools.validation.Validation;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

@RestController
@RequestMapping("/scoringEngine")
public class ScoringEngineController {

	private final KieContainer kieContainer;
	Candidate cd = new Candidate();
	Option op = new Option();
	Questionnaire qstn = new Questionnaire();
	AddQuestionAns aq = new AddQuestionAns();

	public ScoringEngineController(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}

	@RequestMapping(value = "/getResult", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public HashMap<String, String> getQuestions(@RequestBody Map<Object, Object> obj) {
		KieSession kieSession = kieContainer.newKieSession();
		HashMap<String, String> map = new HashMap<>();
		System.out.println(obj.toString());
		obj.entrySet().stream().forEach(x -> {
			if (x.getKey().equals("Candidate")) {
				JsonObject convertedObject = new Gson().fromJson(x.getValue().toString(), JsonObject.class);
				cd.setCategory(convertedObject.get("category").toString());
				cd.setDescription(convertedObject.get("description").toString());
				cd.setTitle(convertedObject.get("title").toString());
				cd.setChoiceQ1(convertedObject.get("ChoiceQ1").getAsInt());
				cd.setChoiceQ2(convertedObject.get("ChoiceQ2").getAsInt());
				cd.setChoiceQ3(convertedObject.get("ChoiceQ3").getAsInt());
				cd.setChoiceQ4(convertedObject.get("ChoiceQ4").getAsInt());
				cd.setChoiceQ5(convertedObject.get("ChoiceQ5").getAsInt());
				cd.setChoiceQ6(convertedObject.get("ChoiceQ6").getAsInt());
				cd.setChoiceQ7(convertedObject.get("ChoiceQ7").getAsInt());
				cd.setChoiceQ8(convertedObject.get("ChoiceQ8").getAsInt());
				cd.setChoiceQ9(convertedObject.get("ChoiceQ9").getAsInt());
				cd.setChoiceQ10(convertedObject.get("ChoiceQ10").getAsInt());
			} else if (x.getKey().equals("Option")) {
				JsonObject convertedObject = new Gson().fromJson(x.getValue().toString(), JsonObject.class);
				op.setTitle(convertedObject.get("title").toString());
				op.setAssignedScore((convertedObject.get("assignedScore").getAsInt()));

			}
			if (x.getKey().equals("Questionnaire")) {
				JsonObject convertedObject = new Gson().fromJson(x.getValue().toString(), JsonObject.class);
				qstn.setVendor(convertedObject.get("vendor").toString());

			}
		});
		Validation JDatavaldi = new Validation();
		cd.setPoints();
		String chk = JDatavaldi.dataCheck(cd,op,qstn);
		//aq.getQA(cd, op, qstn);
		if (!chk.contains("invalid")) {
		kieSession.insert(cd);
		kieSession.insert(op);
		kieSession.fireAllRules();
		kieSession.dispose();
		System.out.println(cd.toString());
		}
		cd.setScore(getScore());
		 map.put("Candidate", cd.toString());
		 map.put("Option", op.toString());
		 map.put("Questionnaire",qstn.toString());
		 map.put("Result","Total Score :"+cd.Score );
		 map.put("Error",chk );
		 return map;

	}

	public Integer getScore() {
		return (cd.getPointQ1() + cd.getPointQ2() + cd.getPointQ3() + cd.getPointQ4() + cd.getPointQ5()
				+ cd.getPointQ6() + cd.getPointQ7() + cd.getPointQ8() + cd.getPointQ9() + cd.getPointQ10());
	}

}
