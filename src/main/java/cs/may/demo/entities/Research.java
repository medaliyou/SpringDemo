package cs.may.demo.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("res")

public class Research extends Member {
	private String grade;
	private String etablisement;
	public Research() {}
	
	public Research(String cin, String fname, String lname, Date date, byte[] photo, String cv, String email,
			String password, String grade, String etablisement) {
		super(cin, fname, lname, date, photo, cv, email, password);
		this.grade = grade;
		this.etablisement = etablisement;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getEtablisement() {
		return etablisement;
	}
	public void setEtablisement(String etablisement) {
		this.etablisement = etablisement;
	}
	
	
}
