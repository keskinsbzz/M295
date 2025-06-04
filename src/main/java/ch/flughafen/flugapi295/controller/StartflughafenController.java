package ch.flughafen.flugapi295.controller;

import ch.flughafen.flugapi295.model.Startflughafen;
import ch.flughafen.flugapi295.repository.StartflughafenRepository;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/startflughafen")
public class StartflughafenController {

    private final StartflughafenRepository repository;

    public StartflughafenController(StartflughafenRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<Startflughafen> create(@Valid @RequestBody Startflughafen startflughafen) {
        Startflughafen saved = repository.save(startflughafen);
        return ResponseEntity.ok(saved);
    }


    @GetMapping
    public List<Startflughafen> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Startflughafen> getById(@PathVariable Integer id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!repository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        repository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
