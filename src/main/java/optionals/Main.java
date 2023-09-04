package optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        Supplier<IllegalStateException> exception = () ->
                new IllegalStateException("exception");

        Optional.ofNullable("asu@gmail.com")
                .ifPresentOrElse( email -> System.out.println("sending email to" + email),
                        () -> {
                            System.out.println("can not set email");
                        });


    }
}
