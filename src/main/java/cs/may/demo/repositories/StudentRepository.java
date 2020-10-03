package cs.may.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cs.may.demo.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	public List<Student> findByDiploma(String diploma);

	public List<Student> findByDiplomaOrderBySubscriptionDateDesc(String diploma);
}
