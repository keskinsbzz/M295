package ch.flughafen.flugapi295.repository;

import ch.flughafen.flugapi295.model.Flug;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlugRepository extends JpaRepository<Flug, Integer> {
}


