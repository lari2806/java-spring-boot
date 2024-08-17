package dio.aula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import dio.aula.model.Users;
import dio.aula.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {
       @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        Users user = new Users();
        user.setName("Larissa");
        user.setPassword("lari123");
        user.setUsername("lari");
        Users user2 = new Users();
        user2.setName("Savio");
        user2.setPassword("saviolindo123");
        user2.setUsername("kkksaviuu");
        repository.save(user);
        repository.save(user2);
        

        for(Users u: repository.findAll()){
            System.out.println(u);
    }
}
}