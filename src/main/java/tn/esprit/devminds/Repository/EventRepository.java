package tn.esprit.devminds.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.devminds.Entities.Evenement;

public interface EventRepository extends JpaRepository<Evenement,Long> {
}
