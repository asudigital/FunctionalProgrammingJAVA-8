package FunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        //Function takes one argument and produces one result
      int increment = incrementByOneFunction(0);
        System.out.println(increment);

       int increment2 = incrementByOneFunction.apply(0);
        System.out.println(increment2);

        int multiply = multipleBy10Function.apply(2);
        System.out.println(multiply);

       Function<Integer , Integer> addBy1AndThenMultiplyBy10=
               incrementByOneFunction.andThen(multipleBy10Function);

        System.out.println( addBy1AndThenMultiplyBy10.apply(1));

        //BiFunction : takes 2 arguments and produces 1 result
        System.out.println( incrementByOneAndMultiply(4 , 100)
        );

        System.out.println(
                incrementByOneAndMultiplyBiFunction.apply(4 , 100)
        );


    }

   static Function<Integer , Integer> incrementByOneFunction =
            number -> number + 1;

    static Function<Integer , Integer>multipleBy10Function =
            number -> number * 10;
    static int incrementByOneFunction(int number) {
        return number+1;
    }


    static int incrementByOneAndMultiply(int number , int numToMultiplyBy){
        return (number+1) * numToMultiplyBy;
    }
    //BiFunction takes 2 inputs and result one output

    static BiFunction<Integer , Integer , Integer> incrementByOneAndMultiplyBiFunction=
            (numberToIncrementByOne ,numberToMultiplyBy )
                    -> (numberToIncrementByOne +1) * numberToMultiplyBy ;

}
