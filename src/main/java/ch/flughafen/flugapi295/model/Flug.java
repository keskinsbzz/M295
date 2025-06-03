package ch.flughafen.flugapi295.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Flug {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer flugId;

    @Pattern(regexp = "[A-Z]{2}\\d{3,4}", message = "Flugnummer muss im Format AB1234 sein.")
    private String flugnummer;

    @Past(message = "Abflugdatum muss in der Vergangenheit liegen.")
    private Date abflugdatum;

    @DecimalMin(value = "0.1", message = "Dauer muss positiv sein.")
    private Double dauer;

    private String zielort;

    private Boolean puenktlich;

    @ManyToOne
    @JoinColumn(name = "flughafenId")
    private Startflughafen startflughafen;
}

