package ch.flughafen.flugapi295;

import ch.flughafen.flugapi295.security.SecurityConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SecurityConfigTest {

    @Autowired
    private SecurityConfig securityConfig;

    @Test
    void filterChainConfiguration() throws Exception {
        // Erstelle ein Dummy-HttpSecurity-Objekt
        HttpSecurity http = new HttpSecurity(null, null, null);

        SecurityFilterChain chain = securityConfig.filterChain(http);

        assertThat(chain).isNotNull();
    }

    @Test
    void usersConfiguration() {
        assertThat(securityConfig.users()).isNotNull();
    }
}
