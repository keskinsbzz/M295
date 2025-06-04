package ch.flughafen.flugapi295;

import ch.flughafen.flugapi295.model.Flug;
import ch.flughafen.flugapi295.repository.FlugRepository;
import ch.flughafen.flugapi295.service.FlugService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class FlugServiceTest {

    FlugRepository repository = Mockito.mock(FlugRepository.class);
    FlugService service = new FlugService(repository);

    @Test
    void testGetAll() {
        List<Flug> fluege = List.of(new Flug());
        when(repository.findAll()).thenReturn(fluege);

        assertThat(service.getAll()).isEqualTo(fluege);
    }

    @Test
    void testGetById() {
        Flug flug = new Flug();
        when(repository.findById(1)).thenReturn(Optional.of(flug));

        assertThat(service.getById(1)).contains(flug);
    }

    @Test
    void testSave() {
        Flug flug = new Flug();
        when(repository.save(flug)).thenReturn(flug);

        assertThat(service.save(flug)).isEqualTo(flug);
    }

    @Test
    void testUpdate() {
        Flug flug = new Flug();
        when(repository.save(flug)).thenReturn(flug);

        assertThat(service.update(flug)).isEqualTo(flug);
    }

    @Test
    void testDeleteById() {
        service.deleteById(1);
        verify(repository, times(1)).deleteById(1);
    }
}
