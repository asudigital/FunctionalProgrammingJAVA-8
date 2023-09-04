package FunctionalInterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        //Without predicate
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("078888888888888888"));
        System.out.println(isPhoneNumberValid("06999999999"));

//        With predicate
        System.out.println( isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println( isPhoneNumberValidPredicate.test("070000000000"));

        System.out.println
                (
                        "is phone No. valid and contains 3 =" +
                        isPhoneNumberValidPredicate.
                        and(containsNumber3).test("07333333333"));

        System.out.println
                (
                        "is phone No. valid and contains 3 =" +
                                isPhoneNumberValidPredicate.
                                        or(containsNumber3).test("07777777777"));

    }



    static boolean isPhoneNumberValid(String phoneNumber)
    {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate =
            phoneNumber ->
                    phoneNumber.startsWith("07") && phoneNumber.length() ==11;

    static  Predicate<String> containsNumber3 =
            phoneNumber -> phoneNumber.contains("3");
}
