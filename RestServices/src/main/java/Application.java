import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author T.Menad
 */
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