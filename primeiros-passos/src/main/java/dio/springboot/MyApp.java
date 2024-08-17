package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component //Se usa o @Component quando há acesso ao código fonte

/*Usamos @Components porque vão ser componentes que serão escaneados na aplicação
 *  Ao indica-lo como componente posso injeta-lo em qualquer ecossistema de um 
 * container do Spring Boot 
*/

public class MyApp implements CommandLineRunner{

    @Autowired // injeta uma dependencia de um componente a outro
    private Calculadora calculadora;
    @Override
    public void run(String... args) throws Exception {
     System.out.println("A soma entre estes números é " + calculadora.somar(5, 3));
    }
    
}

/* CONCEITOS:
 * @Bean:
 * Utiliza-se o @Bean quando não temos acesso ao 
 * código fonte.
 * 
 *@Autowired:
 * Parecido com @Component a diferença é que o @Autowired É utilizado em objetos, enquanto o
 * @Component é ultilizado nas classes. 
 * Não é usado o new para indicar objetos.
 * 
 * @Scope:
 * Indica que terá resstrição em certa parte da classe.
 * Por exemplo: Tenho um bolo com cobertura de chocolate e cenoura, se o scope for chocolate.
 * terei acesso somente ao chocolate que tem no bolo.
 * 
 * @Value
 * Atribuir um valor sem o uso do =, de forma interativa com o container.
 * A estrutura de Value é @Value("${nome_da_variável}"). Um exemplo de como usar o value:
 * @Value("${email}")
	private String email; 
    o valor do email será dado na package resources no arquivo apllication.properties.
    Se por exemplo atribuir o valor dentro da estrutura @Value("${email:larissa@gmail.com}")
	e ter colocado no arquivo aplpication, o valor printado será o que está dentro da estrutura
    @Value
 * 
 * @Configuration
 * Usado quando se refere a uma configuração que é associado a todo ecossistema do
 * application.properties.
 * 
 * @ConfigurationProperties()
 * Serve para dar uma limitação que tenha por exemplo determinado prefixo. Um exemplo:
 * @ConfigurationProperties(prefix = "remetente")
 * essa estrutura indica que todo objeto que tiver o prefixo remetente (exemplo: remetente.nome)
 * irá fazer parte deo código.
 * 
*/
