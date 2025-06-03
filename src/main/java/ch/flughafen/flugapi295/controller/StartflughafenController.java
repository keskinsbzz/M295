package ch.flughafen.flugapi295.controller;

import ch.flughafen.flugapi295.model.Startflughafen;
import ch.flughafen.flugapi295.service.StartflughafenService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/startflughafen")
public class StartflughafenController {

    private final StartflughafenService service;

    public StartflughafenController(StartflughafenService service) {
        this.service = service;
    }

    @GetMapping
    public List<Startflughafen> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Startflughafen getById(@PathVariable Integer id) {
        return service.getById(id).orElse(null);
    }

    @PostMapping
    public Startflughafen create(@RequestBody Startflughafen startflughafen) {
        return service.save(startflughafen);
    }

    @PutMapping
    public Startflughafen update(@RequestBody Startflughafen startflughafen) {
        return service.update(startflughafen);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteById(id);
    }
}

