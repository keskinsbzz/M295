package ch.flughafen.flugapi295.service;

import ch.flughafen.flugapi295.model.Flug;
import ch.flughafen.flugapi295.repository.FlugRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlugService {

    private final FlugRepository repository;

    public FlugService(FlugRepository repository) {
        this.repository = repository;
    }

    public List<Flug> getAll() {
        return repository.findAll();
    }

    public Optional<Flug> getById(Integer id) {
        return repository.findById(id);
    }

    public Flug save(Flug flug) {
        return repository.save(flug);
    }

    public Flug update(Flug flug) {
        return repository.save(flug);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}

