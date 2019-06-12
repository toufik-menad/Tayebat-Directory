/**
 * 
 */
package core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author MENAD
 *
 */
//@ComponentScan({"com.*" })
@SpringBootApplication(scanBasePackages = {"com.*" })
//@EnableAutoConfiguration
//@EnableWebMvc
//@EnableJpaRepositories({"com.*" })
//@EntityScan({"com.*" })
public class Application  {

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }
}