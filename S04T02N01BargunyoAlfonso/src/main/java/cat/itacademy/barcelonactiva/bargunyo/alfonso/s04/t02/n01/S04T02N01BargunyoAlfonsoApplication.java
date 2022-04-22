package cat.itacademy.barcelonactiva.bargunyo.alfonso.s04.t02.n01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"cat.itacademy.barcelonactiva.bargunyo.alfonso.s04.t02.n01.model.service"})
@EntityScan("cat.itacademy.barcelonactiva.bargunyo.alfonso.s04.t02.n01.model.domain")
@EnableJpaRepositories("cat.itacademy.barcelonactiva.bargunyo.alfonso.s04.t02.n01.model.repository")
public class S04T02N01BargunyoAlfonsoApplication {

	public static void main(String[] args) {
		SpringApplication.run(S04T02N01BargunyoAlfonsoApplication.class, args);
	}

}
