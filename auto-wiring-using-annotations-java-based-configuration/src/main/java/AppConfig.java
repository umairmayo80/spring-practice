import com.umair.spring.Address;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.umair.spring"})
public class AppConfig {

    @Bean
    public Address address(){
        return new Address("NY","New York");
    }
}
