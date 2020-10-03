package cs.may.demo.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("stu")
public class Student extends Member{
	private Date subscriptionDate;
	private String diploma;
	
	@ManyToOne
	private Research research;
	
	public Student() {}


	public Student(String cin, String fname, String lname, Date date, byte[] photo, String cv, String email,
			String password, Date subscriptionDate, String diploma, Research research) {
		super(cin, fname, lname, date, photo, cv, email, password);
		this.subscriptionDate = subscriptionDate;
		this.diploma = diploma;
		this.research = research;
	}


	public Date getSubscriptionDate() {
		return subscriptionDate;
	}


	public void setSubscriptionDate(Date subscriptionDate) {
		this.subscriptionDate = subscriptionDate;
	}


	public String getDiploma() {
		return diploma;
	}


	public void setDiploma(String diploma) {
		this.diploma = diploma;
	}


	public Research getResearch() {
		return research;
	}


	public void setResearch(Research research) {
		this.research = research;
	}
	
	
	
	

}
