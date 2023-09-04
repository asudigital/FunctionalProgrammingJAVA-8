package cobinatorPattern;

import java.time.LocalDate;

import static cobinatorPattern.CustomerRegistrationValidator.*;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer(
                "Alice",
                 "asu@gmail.com",
                "+9190000000",
                LocalDate.of(2000, 9,26)
        );


//        CustomerValidatorService validatorService = new CustomerValidatorService();
//        validatorService.isValid((customer));

//        System.out.println(new CustomerValidatorService().isValid(customer));

//      if valid  We can store customer in db

//        using Combinator pattern
       ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer);

        System.out.println(result);
        if ( result != ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }
    }
}
