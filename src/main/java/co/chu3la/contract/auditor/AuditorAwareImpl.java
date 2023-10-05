package co.chu3la.contract.auditor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;

import java.util.Arrays;
import java.util.Optional;
import java.util.Random;


public class AuditorAwareImpl implements AuditorAware<String> {

    Authentication authentication;

    /**
     * Returns the current auditor of the application.
     *
     * @return the current auditor.
     */
    @Override
    public Optional<String> getCurrentAuditor() {
        String currentUser = authentication.getName();
        return Optional.of(currentUser).stream().findAny();
    }
}
