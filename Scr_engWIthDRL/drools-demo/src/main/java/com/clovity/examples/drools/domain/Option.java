package com.clovity.examples.drools.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Option {
	public String Title;
	public Integer AssignedScore;
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public Integer getAssignedScore() {
		return AssignedScore;
	}
	public void setAssignedScore(Integer assignedScore) {
		AssignedScore = assignedScore;
	}
	@Override
	public int hashCode() {
		return Objects.hash(AssignedScore, Title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Option other = (Option) obj;
		return Objects.equals(AssignedScore, other.AssignedScore) && Objects.equals(Title, other.Title);
	}
	@Override
	public String toString() {
		return "Option [Title=" + Title + ", AssignedScore=" + AssignedScore + "]";
	}
	
}
