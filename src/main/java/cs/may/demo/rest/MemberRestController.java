package cs.may.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cs.may.demo.entities.Member;
import cs.may.demo.entities.Research;
import cs.may.demo.entities.Student;
import cs.may.demo.services.IMemberService;

@RestController
@CrossOrigin
public class MemberRestController {

	@Autowired
	IMemberService memberService;

	@RequestMapping(value = "/members", method = RequestMethod.GET)
	public List<Member> findMembers() {
		return memberService.findAll();

	}

	@GetMapping(value = "/member/{id}")
	public Member findOneMemberById(@PathVariable Long id) {
		return memberService.findMember(id);

	}

	@GetMapping(value = "/member/search/cin")

	public Member findOneMemberByCin(@RequestParam String cin) {
		return memberService.findByCin(cin);
	}

	@GetMapping(value = "/member/search/email")

	public Member findOneMemberByEmail(@RequestParam String email) {
		return memberService.findByEmail(email);

	}

	@PostMapping(value = "/members/research")
	public Member addMember(@RequestBody Research r) {
		return memberService.addMember(r);
	}

	@PostMapping(value = "/members/student")
	public Member addMember(@RequestBody Student s) {
		return memberService.addMember(s);
	}

	@DeleteMapping(value = "/members/{id}")
	public void deleteMember(@PathVariable Long id) {
		memberService.deleteMemeber(id);
	}

	@PutMapping(value = "/members/student/{id}")

	public Member updatemembre(@PathVariable Long id, @RequestBody Student p)

	{

		p.setId(id);
		return memberService.updateMember(p);

	}

	@PutMapping(value = "/members/research/{id}")

	public Member updateMembre(@PathVariable Long id, @RequestBody Research p)

	{

		p.setId(id);
		return memberService.updateMember(p);

	}
}
