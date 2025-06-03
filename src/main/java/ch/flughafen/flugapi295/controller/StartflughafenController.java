package ch.flughafen.flugapi295.controller;

import ch.flughafen.flugapi295.model.Startflughafen;
import ch.flughafen.flugapi295.repository.StartflughafenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/startflughafen")
public class StartflughafenController {

    @Autowired
    private StartflughafenRepository repository;

    @PostMapping
    public Startflughafen create(@RequestBody Startflughafen startflughafen) {
        return repository.save(startflughafen);
    }

    @GetMapping
    public List<Startflughafen> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Startflughafen getById(@PathVariable Integer id) {
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Startflughafen update(@PathVariable Integer id, @RequestBody Startflughafen updated) {
        Startflughafen existing = repository.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(updated.getName());
            existing.setLand(updated.getLand());
            existing.setStadt(updated.getStadt());
            existing.setEroeffnet(updated.getEroeffnet());
            existing.setLandebahnen(updated.getLandebahnen());
            existing.setInternational(updated.getInternational());
            return repository.save(existing);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}
