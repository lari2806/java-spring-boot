package dio.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringPrimeirosPassosApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SpringPrimeirosPassosApplication.class, args);
	}
}

/* Conceitos da terminologia
 * ORM:
 * Object-Relational Mapping, Em português, mapeamento objeto-relacional,
 * é um recurso para aproximar o paradigma da orientação a objetos ao contexto de banco de dados relacional.
 * O uso de ORM é realizado através do mapeamento de objeto para uma tabela por uma biblioteca ou framework.
 * 
 * JPA
 * JPA é uma especificação baseada em interfaces, que através de um
 *  framework realiza operações de persistência de objetos em Java.
 */