package ch.flughafen.flugapi295.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
public class Startflughafen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer flughafenId;

    private String name;
    private String land;
    private String stadt;
    private Date eroeffnet;
    private Integer landebahnen;
    private Boolean international;

    @OneToMany(mappedBy = "startflughafen", cascade = CascadeType.ALL)
    private List<Flug> fluege;
}
