package tn.esprit.ProjetSpring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ProjetSpring.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
