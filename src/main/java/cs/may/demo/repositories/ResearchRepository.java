package cs.may.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cs.may.demo.entities.Research;

@Repository
public interface ResearchRepository extends JpaRepository<Research, Long> {
	List<Research> findByGrade(String grade);

	List<Research> findByEtablisement(String etablisement);
}