package ch.flughafen.flugapi295.controller;

import ch.flughafen.flugapi295.model.Flug;
import ch.flughafen.flugapi295.service.FlugService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flug")
public class FlugController {

    private final FlugService service;

    public FlugController(FlugService service) {
        this.service = service;
    }

    @GetMapping
    public List<Flug> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Flug getById(@PathVariable Integer id) {
        return service.getById(id).orElse(null);
    }

    @PostMapping
    public Flug create(@RequestBody Flug flug) {
        return service.save(flug);
    }

    @PutMapping
    public Flug update(@RequestBody Flug flug) {
        return service.update(flug);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteById(id);
    }
}
