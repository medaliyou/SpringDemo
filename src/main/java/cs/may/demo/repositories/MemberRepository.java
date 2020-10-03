package cs.may.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cs.may.demo.entities.Member;

@Repository
/*
 * @Repository This annotation is used on Java classes which directly access the
 * database. The @Repository annotation works as marker for any class that
 * fulfills the role of repository or Data Access Object.
 */
public interface MemberRepository extends JpaRepository<Member, Long> {

	Member findByCin(String cin);

	Member findByFname(String fname);

	List<Member> findByFnameStartingWith(String character);

	Member findByEmail(String email);

}