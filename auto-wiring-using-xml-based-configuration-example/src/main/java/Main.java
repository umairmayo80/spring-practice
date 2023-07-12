import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Create the application context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Customer constructorCustomer = context.getBean("constructorCustomer", Customer.class);
        Customer byTypeCustomer = context.getBean("byTypeCustomer", Customer.class);



        // Retrieve the auto-wired customer bean
        Customer customer = context.getBean("customer", Customer.class);

        // Access the auto-wired properties
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Address: " + customer.getAddress().getCity() + ", " + customer.getAddress().getState());

        // Access the auto-wired properties
        System.out.println("Customer Name (byType): " + byTypeCustomer.getName());
        System.out.println("Customer Address (byType): " + byTypeCustomer.getAddress().getCity() + ", " + byTypeCustomer.getAddress().getState());

        System.out.println("Customer Name (constructor): " + constructorCustomer.getName());
        System.out.println("Customer Address (constructor): " + constructorCustomer.getAddress().getCity() + ", " + constructorCustomer.getAddress().getState());

    }
}
