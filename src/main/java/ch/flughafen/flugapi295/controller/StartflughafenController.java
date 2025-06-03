package ch.flughafen.flugapi295.controller;

import ch.flughafen.flugapi295.model.Startflughafen;
import ch.flughafen.flugapi295.service.StartflughafenService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
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
    public Startflughafen create(@RequestBody @Valid Startflughafen startflughafen) {
        return service.save(startflughafen);
    }

    @PutMapping
    public Startflughafen update(@RequestBody @Valid Startflughafen startflughafen) {
        return service.update(startflughafen);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteById(id);
    }
}
