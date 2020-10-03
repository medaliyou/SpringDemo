package cs.may.demo.services;

import java.util.List; 

import org.springframework.stereotype.Service;

import cs.may.demo.entities.Member;
import cs.may.demo.entities.Research;
import cs.may.demo.entities.Student;

@Service
public interface IMemberService {

	// CRUD on Member
	public Member addMember(Member m);

	public void deleteMemeber(Long id);

	public Member updateMember(Member m);

	public Member findMember(Long id);

	public List<Member> findAll();

	// Filtering by properties

	public Member findByCin(String cin);

	public Member findByEmail(String email);

	public List<Member> findByFname(String fname);

	// Advanced Specific searching
	public List<Research> findByGrade(String grade);

	// Advanced Specific searching
	public List<Student> findByDiploma(String diploma);

	public List<Research> findByEtablisement(String etablisement);
	
	public Member affectRes2Stu(Long stuId, Long resId);
}
