package com.clovity.examples.drools.validation;

import com.clovity.examples.drools.domain.Candidate;
import com.clovity.examples.drools.domain.Option;
import com.clovity.examples.drools.domain.Questionnaire;

public class Validation {

	public String dataCheck(Candidate cd, Option op, Questionnaire qu) {
		String errormsg = "";
		if (cd.ChoiceQ1 > 4 || cd.ChoiceQ1 < 0) {
			errormsg = "ChoiceQ1 Tag is invalid,";
		} else if (cd.ChoiceQ2 > 4 || cd.ChoiceQ2 < 0) {
			errormsg = "ChoiceQ2 Tag is invalid ";
		} else if (cd.ChoiceQ3 > 4 || cd.ChoiceQ3 < 0) {
			errormsg = "ChoiceQ3 Tag is invalid ";
		} else if (cd.ChoiceQ4 > 4 || cd.ChoiceQ4 < 0) {
			errormsg = "ChoiceQ4 Tag is invalid ";
		} else if (cd.ChoiceQ5 > 4 || cd.ChoiceQ5 < 0) {
			errormsg = "ChoiceQ5 Tag is invalid ";
		} else if (cd.ChoiceQ6 > 4 || cd.ChoiceQ6 < 0) {
			errormsg = "ChoiceQ6 Tag is invalid ";
		} else if (cd.ChoiceQ7 > 4 || cd.ChoiceQ7 < 0) {
			errormsg = "ChoiceQ7 Tag is invalid ";
		} else if (cd.ChoiceQ8 > 4 || cd.ChoiceQ8 < 0) {
			errormsg = "ChoiceQ8 Tag is invalid ";
		} else if (cd.ChoiceQ9 > 4 || cd.ChoiceQ9 < 0) {
			errormsg = "ChoiceQ9 Tag is invalid ";
		} else if (cd.ChoiceQ10 > 4 || cd.ChoiceQ10 < 0) {
			errormsg = "ChoiceQ10 Tag is invalid ";
		} else {
		}
		return errormsg;
	}
}
