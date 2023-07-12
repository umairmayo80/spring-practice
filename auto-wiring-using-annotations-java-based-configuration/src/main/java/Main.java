import com.umair.spring.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Create the application context
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the auto-wired customer bean
        Customer customer = context.getBean(Customer.class);
        System.out.println(customer);

        ((AnnotationConfigApplicationContext) context).close(); // it will call the destroy method


    }
}
