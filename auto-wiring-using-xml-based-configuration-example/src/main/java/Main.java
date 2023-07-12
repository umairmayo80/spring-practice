import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Create the application context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the auto-wired customer bean
        Customer customer = context.getBean("customer", Customer.class);

        // Access the auto-wired properties
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Address: " + customer.getAddress().getCity() + ", " + customer.getAddress().getState());
    }
}
