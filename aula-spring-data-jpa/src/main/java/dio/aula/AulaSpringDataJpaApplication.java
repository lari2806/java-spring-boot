package dio.aula;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AulaSpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AulaSpringDataJpaApplication.class, args);
	}

}
/* O spring data JPA facilita o padrão Repository através de AOP
 * pesquisar sobre: Query Method, Query Override */