package com.clovity.examples.drools.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Candidate {
	public String Title;
	public Integer ChoiceQ1;
	public Integer ChoiceQ2;
	public Integer ChoiceQ3;
	public Integer ChoiceQ4;
	public Integer ChoiceQ5;
	public Integer ChoiceQ6;
	public Integer ChoiceQ7;
	public Integer ChoiceQ8;
	public Integer ChoiceQ9;
	public Integer ChoiceQ10;
	public Integer PointQ1;
	public Integer PointQ2;
	public Integer PointQ3;
	public Integer PointQ4;
	public Integer PointQ5;
	public Integer PointQ6;
	public Integer PointQ7;
	public Integer PointQ8;
	public Integer PointQ9;
	public Integer PointQ10;
	public String Description;
	public String Category;
	public Integer Score;
	List<String> listo = new ArrayList<>();

	public Integer getChoiceQ1() {
		return ChoiceQ1;
	}

	public void setChoiceQ1(Integer choiceQ1) {
		ChoiceQ1 = choiceQ1;
	}

	public Integer getChoiceQ2() {
		return ChoiceQ2;
	}

	public void setChoiceQ2(Integer choiceQ2) {
		ChoiceQ2 = choiceQ2;
	}

	public Integer getChoiceQ3() {
		return ChoiceQ3;
	}

	public void setChoiceQ3(Integer choiceQ3) {
		ChoiceQ3 = choiceQ3;
	}

	public Integer getChoiceQ4() {
		return ChoiceQ4;
	}

	public void setChoiceQ4(Integer choiceQ4) {
		ChoiceQ4 = choiceQ4;
	}

	public Integer getChoiceQ5() {
		return ChoiceQ5;
	}

	public void setChoiceQ5(Integer choiceQ5) {
		ChoiceQ5 = choiceQ5;
	}

	public Integer getChoiceQ6() {
		return ChoiceQ6;
	}

	public void setChoiceQ6(Integer choiceQ6) {
		ChoiceQ6 = choiceQ6;
	}

	public Integer getChoiceQ7() {
		return ChoiceQ7;
	}

	public void setChoiceQ7(Integer choiceQ7) {
		ChoiceQ7 = choiceQ7;
	}

	public Integer getChoiceQ8() {
		return ChoiceQ8;
	}

	public void setChoiceQ8(Integer choiceQ8) {
		ChoiceQ8 = choiceQ8;
	}

	public Integer getChoiceQ9() {
		return ChoiceQ9;
	}

	public void setChoiceQ9(Integer choiceQ9) {
		ChoiceQ9 = choiceQ9;
	}

	public Integer getChoiceQ10() {
		return ChoiceQ10;
	}

	public void setChoiceQ10(Integer choiceQ10) {
		ChoiceQ10 = choiceQ10;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public Integer getPointQ1() {
		return PointQ1;
	}

	public void setPointQ1(Integer pointQ1) {
		PointQ1 = pointQ1;
	}

	public Integer getPointQ2() {
		return PointQ2;
	}

	public void setPointQ2(Integer pointQ2) {
		PointQ2 = pointQ2;
	}

	public Integer getPointQ3() {
		return PointQ3;
	}

	public void setPointQ3(Integer pointQ3) {
		PointQ3 = pointQ3;
	}

	public Integer getPointQ4() {
		return PointQ4;
	}

	public void setPointQ4(Integer pointQ4) {
		PointQ4 = pointQ4;
	}

	public Integer getPointQ5() {
		return PointQ5;
	}

	public void setPointQ5(Integer pointQ5) {
		PointQ5 = pointQ5;
	}

	public Integer getPointQ6() {
		return PointQ6;
	}

	public void setPointQ6(Integer pointQ6) {
		PointQ6 = pointQ6;
	}

	public Integer getPointQ7() {
		return PointQ7;
	}

	public void setPointQ7(Integer pointQ7) {
		PointQ7 = pointQ7;
	}

	public Integer getPointQ8() {
		return PointQ8;
	}

	public void setPointQ8(Integer pointQ8) {
		PointQ8 = pointQ8;
	}

	public Integer getPointQ9() {
		return PointQ9;
	}

	public void setPointQ9(Integer pointQ9) {
		PointQ9 = pointQ9;
	}

	public Integer getPointQ10() {
		return PointQ10;
	}

	public void setPointQ10(Integer pointQ10) {
		PointQ10 = pointQ10;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public Integer getScore() {
		return Score;
	}

	public void setScore(Integer score) {
		Score = score;
	}

	public List<String> getListo() {
		return listo;
	}

	public void setListo(List<String> listo) {
		this.listo = listo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Category, ChoiceQ1, ChoiceQ10, ChoiceQ2, ChoiceQ3, ChoiceQ4, ChoiceQ5, ChoiceQ6, ChoiceQ7,
				ChoiceQ8, ChoiceQ9, Description, PointQ1, PointQ10, PointQ2, PointQ3, PointQ4, PointQ5, PointQ6,
				PointQ7, PointQ8, PointQ9, Score, Title, listo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidate other = (Candidate) obj;
		return Objects.equals(Category, other.Category) && Objects.equals(ChoiceQ1, other.ChoiceQ1)
				&& Objects.equals(ChoiceQ10, other.ChoiceQ10) && Objects.equals(ChoiceQ2, other.ChoiceQ2)
				&& Objects.equals(ChoiceQ3, other.ChoiceQ3) && Objects.equals(ChoiceQ4, other.ChoiceQ4)
				&& Objects.equals(ChoiceQ5, other.ChoiceQ5) && Objects.equals(ChoiceQ6, other.ChoiceQ6)
				&& Objects.equals(ChoiceQ7, other.ChoiceQ7) && Objects.equals(ChoiceQ8, other.ChoiceQ8)
				&& Objects.equals(ChoiceQ9, other.ChoiceQ9) && Objects.equals(Description, other.Description)
				&& Objects.equals(PointQ1, other.PointQ1) && Objects.equals(PointQ10, other.PointQ10)
				&& Objects.equals(PointQ2, other.PointQ2) && Objects.equals(PointQ3, other.PointQ3)
				&& Objects.equals(PointQ4, other.PointQ4) && Objects.equals(PointQ5, other.PointQ5)
				&& Objects.equals(PointQ6, other.PointQ6) && Objects.equals(PointQ7, other.PointQ7)
				&& Objects.equals(PointQ8, other.PointQ8) && Objects.equals(PointQ9, other.PointQ9)
				&& Objects.equals(Score, other.Score) && Objects.equals(Title, other.Title)
				&& Objects.equals(listo, other.listo);
	}

	public void setPoints() {
		this.PointQ1 = 0;
		this.PointQ2 = 0;
		this.PointQ3 = 0;
		this.PointQ4 = 0;
		this.PointQ5 = 0;
		this.PointQ6 = 0;
		this.PointQ7 = 0;
		this.PointQ8 = 0;
		this.PointQ9 = 0;
		this.PointQ10 = 0;

	}

	@Override
	public String toString() {
		return "Candidate [Title=" + Title + ", ChoiceQ1=" + ChoiceQ1 + ", ChoiceQ2=" + ChoiceQ2 + ", ChoiceQ3="
				+ ChoiceQ3 + ", ChoiceQ4=" + ChoiceQ4 + ", ChoiceQ5=" + ChoiceQ5 + ", ChoiceQ6=" + ChoiceQ6
				+ ", ChoiceQ7=" + ChoiceQ7 + ", ChoiceQ8=" + ChoiceQ8 + ", ChoiceQ9=" + ChoiceQ9 + ", ChoiceQ10="
				+ ChoiceQ10 + ", PointQ1=" + PointQ1 + ", PointQ2=" + PointQ2 + ", PointQ3=" + PointQ3 + ", PointQ4="
				+ PointQ4 + ", PointQ5=" + PointQ5 + ", PointQ6=" + PointQ6 + ", PointQ7=" + PointQ7 + ", PointQ8="
				+ PointQ8 + ", PointQ9=" + PointQ9 + ", PointQ10=" + PointQ10 + ", Description=" + Description
				+ ", Category=" + Category + ", Score=" + Score + ", listo=" + listo + "]";
	}

}
