package ch.flughafen.flugapi295.service;

import ch.flughafen.flugapi295.model.Startflughafen;
import ch.flughafen.flugapi295.repository.StartflughafenRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StartflughafenService {

    private final StartflughafenRepository repository;

    public StartflughafenService(StartflughafenRepository repository) {
        this.repository = repository;
    }

    public List<Startflughafen> getAll() {
        return repository.findAll();
    }

    public Optional<Startflughafen> getById(Integer id) {
        return repository.findById(id);
    }

    public Startflughafen save(Startflughafen flughafen) {
        return repository.save(flughafen);
    }

    public Startflughafen update(Startflughafen flughafen) {
        return repository.save(flughafen);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}


