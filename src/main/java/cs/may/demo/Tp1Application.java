package cs.may.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cs.may.demo.entities.Member;
import cs.may.demo.entities.Research;
import cs.may.demo.entities.Student;
import cs.may.demo.services.IMemberService;

@SpringBootApplication
public class Tp1Application implements CommandLineRunner {

	@Autowired
	IMemberService service;

	public static void main(String[] args) {
		SpringApplication.run(Tp1Application.class, args);
	}

	public void run(String... args) throws Exception {

		String pattern = "YYYY-MM-DD";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		Date date1 = simpleDateFormat.parse("1987-02-01");
		Date date2 = simpleDateFormat.parse("1985-12-31");
		Date date3 = simpleDateFormat.parse("1997-06-28");
		Date date4 = simpleDateFormat.parse("1997-04-12");
		/*
		 * public Research(String cin, String fname, String lname, Date date, byte[]
		 * photo, String cv, String email, String password, String grade, String
		 * etablisement)
		 * 
		 * public Student(String cin, String fname, String lname, Date date, byte[]
		 * photo, String cv, String email, String password, Date subscriptionDate,
		 * String diploma, Research research)
		 */

		Member r0 = new Research("10846001", "Amin", "Kalthoum", date1, null, null, "amin.kalthoum@enis.tn",
				"aminos8989", "res", "enis");
		Member r1 = new Research("1800424", "Khaled", "Mahboul", date2, null, null, "khaled.mahboul@enis.tn",
				"kokolaviER", "res", "enis");
		Member s0 = new Student("11084600", "Nessrine", "Sanei", date3, null, "cv07.pdf", "nessrine.Sanei@stud.enis.tn",
				"nessOPPaXXXXXE::", date3, "ing", (Research) r0);
		Member s1 = new Student("123654980", "Ala", "Zouari", date4, null, "cv02.pdf", "ala.zouari@stud.enis.tn",
				"Passw0rd!MagIK@l", date4, "ing", (Research) r1);

		service.addMember(r0);
		service.addMember(r1);
		service.addMember(s0);
		service.addMember(s1);

		/*
		 * MemberImpl service = new MemberImpl(); service.affectRes2Stu(s.getId(),
		 * r1.getId());
		 */

	}

}
