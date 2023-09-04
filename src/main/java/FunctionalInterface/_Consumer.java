package FunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

        //Normal Java function
        Customer maria = new Customer("MAria" , "90909090");
 greetCustomer(maria);


 //Consumer Functional interface
 greetCustomerConsumer.accept(maria);
 greetCustomerConsumerv2.accept(maria , false);

 greetCustomerv2( maria , false);
    }

    //Consumer takes an argument and returns nothing
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello" + customer.customerName +
                    "thanks for registering phone number" +
                    customer.customerPhoneNumber);
    //BiConsumer
    static BiConsumer<Customer , Boolean> greetCustomerConsumerv2 =
            (customer , showPhoneNumber) ->
             System.out.println("Hello" + customer.customerName +
                     ", thanks for registering phone number" +
                     (showPhoneNumber ? customer.customerPhoneNumber : "********"));

    static void greetCustomer(Customer customer ) {
        System.out.println("Hello" + customer.customerName +
                "thanks for registering phone number" +
                customer.customerPhoneNumber);
    }

    static void greetCustomerv2(Customer customer , boolean showPhoneNumber ) {
        System.out.println("Hello" + customer.customerName +
                ", thanks for registering phone number" +
                (showPhoneNumber ? customer.customerPhoneNumber : "********"));
    }

    static class Customer {
      private final String customerName;
      private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
