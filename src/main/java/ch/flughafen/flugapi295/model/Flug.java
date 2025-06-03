package ch.flughafen.flugapi295.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Flug {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer flugId;

    private String flugnummer;
    private Date abflugdatum;
    private Double dauer;
    private String zielort;
    private Boolean puenktlich;

    @ManyToOne
    @JoinColumn(name = "flughafenId")
    private Startflughafen startflughafen;
}
