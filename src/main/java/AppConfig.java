import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
 
    @Bean(name= "helloWorld")
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }

    @Bean(name = "cat")
    @Scope("prototype")
    public Cat cat() {
        return new Cat();
    }
}