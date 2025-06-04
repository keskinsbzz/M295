package ch.flughafen.flugapi295;

import ch.flughafen.flugapi295.model.Startflughafen;
import ch.flughafen.flugapi295.repository.StartflughafenRepository;
import ch.flughafen.flugapi295.service.StartflughafenService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class StartflughafenServiceTest {

    private StartflughafenRepository repository;
    private StartflughafenService service;

    @BeforeEach
    void setup() {
        repository = mock(StartflughafenRepository.class);
        service = new StartflughafenService(repository);
    }

    @Test
    void testGetAll() {
        Startflughafen s = new Startflughafen();
        when(repository.findAll()).thenReturn(List.of(s));

        List<Startflughafen> result = service.getAll();

        assertThat(result).hasSize(1);
        verify(repository).findAll();
    }

    @Test
    void testGetById() {
        Startflughafen s = new Startflughafen();
        when(repository.findById(1)).thenReturn(Optional.of(s));

        Optional<Startflughafen> result = service.getById(1);

        assertThat(result).contains(s);
        verify(repository).findById(1);
    }

    @Test
    void testSave() {
        Startflughafen s = createExample();
        when(repository.save(s)).thenReturn(s);

        Startflughafen result = service.save(s);

        assertThat(result).isEqualTo(s);
        verify(repository).save(s);
    }

    @Test
    void testUpdate() {
        Startflughafen s = createExample();
        when(repository.save(s)).thenReturn(s);

        Startflughafen result = service.update(s);

        assertThat(result).isEqualTo(s);
        verify(repository).save(s);
    }

    @Test
    void testDeleteById() {
        service.deleteById(1);
        verify(repository).deleteById(1);
    }

    private Startflughafen createExample() {
        Startflughafen s = new Startflughafen();
        s.setName("Airport");
        s.setLand("Deutschland");
        s.setStadt("Berlin");
        s.setLandebahnen(2);
        s.setEroeffnet(LocalDate.now());
        s.setInternational(true);
        return s;
    }
}
