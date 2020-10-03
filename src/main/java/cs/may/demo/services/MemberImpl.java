package cs.may.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cs.may.demo.entities.Member;
import cs.may.demo.entities.Research;
import cs.may.demo.entities.Student;
import cs.may.demo.repositories.MemberRepository;
import cs.may.demo.repositories.ResearchRepository;
import cs.may.demo.repositories.StudentRepository;

@Service
public class MemberImpl implements  IMemberService {

	@Autowired
	MemberRepository memberRepository;
	@Autowired
	ResearchRepository researchRepository;
	@Autowired
	StudentRepository studentRepository;

	@Override
	public Member addMember(Member m) {
		memberRepository.save(m);
		return m;
	}

	@Override
	public void deleteMemeber(Long id) {
		memberRepository.deleteById(id);		
	}

	@Override
	public Member updateMember(Member m) {
		return memberRepository.saveAndFlush(m);
	}

	@Override
	public Member findMember(Long id) {
		return (Member)memberRepository.findById(id).get();
	}

	@Override
	public List<Member> findAll() {
		return memberRepository.findAll();
	}

	@Override
	public Member findByCin(String cin) {
		return memberRepository.findByCin(cin);
	}

	@Override
	public Member findByEmail(String email) {
		return memberRepository.findByEmail(email);
	}

	@Override
	public List<Member> findByFname(String fname) {
		return memberRepository.findByFnameStartingWith(fname);
	}

	@Override
	public List<Research> findByGrade(String grade) {
		return researchRepository.findByGrade(grade);
	}

	@Override
	public List<Student> findByDiploma(String diploma) {

		return studentRepository.findByDiploma(diploma);
	}

	
	@Override
	public Member affectRes2Stu(Long stuId, Long resId) {
		/*
		Student e = (Student) findMember(stuId);
		Research u = (Research) findMember(resId);
		*/
		Student s = (Student)studentRepository.findById(stuId).get();
		Research r = (Research)researchRepository.findById(resId).get();
		
		s.setResearch(r);
		return updateMember(s);
	}

	@Override
	public List<Research> findByEtablisement(String etablisement) {
		return researchRepository.findByEtablisement(etablisement);
	}

}
