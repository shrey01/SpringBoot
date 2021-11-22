package com.clovity.examples.drools.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Questionnaire {
	public String Vendor;
	List<String> questList = new ArrayList<>();

	public String getVendor() {
		return Vendor;
	}

	public void setVendor(String vendor) {
		Vendor = vendor;
	}

	public List<String> getQuestList() {
		return questList;
	}

	public void setQuestList(List<String> questList) {
		this.questList = questList;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Vendor, questList);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Questionnaire other = (Questionnaire) obj;
		return Objects.equals(Vendor, other.Vendor) && Objects.equals(questList, other.questList);
	}

	@Override
	public String toString() {
		return "Questionnaire [Vendor=" + Vendor + ", questList=" + questList + "]";
	}

}
