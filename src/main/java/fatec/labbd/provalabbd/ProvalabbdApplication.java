package fatec.labbd.provalabbd;

import java.util.Locale;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.FixedLocaleResolver;

@SpringBootApplication
@ComponentScan(basePackages = "fatec.labbd.provalabbd.*")
@EntityScan("fatec.labbd.provalabbd.*")
@EnableJpaRepositories(basePackages = "fatec.labbd.provalabbd.repository")

public class ProvalabbdApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvalabbdApplication.class, args);
	}
	
	@Bean
	public LocaleResolver localeResolver() {
		return new FixedLocaleResolver(new Locale("pt","BR"));
		
	}
 
}
