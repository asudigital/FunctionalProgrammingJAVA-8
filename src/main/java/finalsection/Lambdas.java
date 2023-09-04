package finalsection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {

    public static void main(String[] args) {

//        int num = null;  This is incorrect
        Integer num2 = null;
        // 1. IN FUNCTIONAL INTERFACE WE USE OBJECT TYPE DATATYPE , NOT PRIMITIVE DATA TYPE
        //2. AVOID STATIC KEYWORD , HERE IT IS USED AS WE ARE USING MAIN METHOD
        //3. USING STATIC KEYWORD IS NOT PRACTICAL

        //if there is one return statement
        // Below 2 lines are same
        Function<String , String>  upperCaseName = String::toUpperCase;
//        Function<String , String>  upperCaseName = name -> name.toUpperCase();

        BiFunction<String ,Integer, String> upperCaseName2 =  (name, age) -> {
            //logic
            if(name.isBlank()) throw new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase();
        };
        System.out.println(upperCaseName2.apply("Alex", 56));
    }
}
