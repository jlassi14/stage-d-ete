package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.models.Demission;
@Repository
public interface DemissionRepository  extends JpaRepository<Demission, Long> {

	

}
