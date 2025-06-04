package ch.flughafen.flugapi295.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Startflughafen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer flughafenId;

    @Size(min = 3, max = 100, message = "Der Name muss zwischen 3 und 100 Zeichen lang sein.")
    private String name;

    @Pattern(regexp = "[A-Z][a-zA-Z]+", message = "Land muss mit einem Großbuchstaben beginnen.")
    private String land;

    private String stadt;

    @PastOrPresent(message = "Das Eröffnungsdatum darf nicht in der Zukunft liegen.")
    private LocalDate eroeffnet;

    @Min(value = 1, message = "Es muss mindestens eine Landebahn geben.")
    private Integer landebahnen;

    private Boolean international;

    @OneToMany(mappedBy = "startflughafen", cascade = CascadeType.ALL)
    private List<Flug> fluege;
}
