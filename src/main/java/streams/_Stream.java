package streams;



import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class _Stream {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John" , Gender.MALE),
                new Person("maria" , Gender.FEMALE),
                new Person("Alisha" , Gender.PREFER_NOT_TO_SAY),
                new Person("Alex" , Gender.MALE),
                new Person("Alice" ,  Gender.FEMALE)
        );


//        Function<Person , String> personStringFunction = person -> person.name;
//        ToIntFunction<String> length = String::length;
//        IntConsumer println = System.out::println;
//        people.stream()
//                .map(personStringFunction)
//                .mapToInt(length)   //.mapToInt(name -> name.length())
//                .forEach(println);


        //allMatch() , noneMatch() , anyMatch()
        Predicate<Person> personPredicate =  person -> Gender.PREFER_NOT_TO_SAY.equals(person.gender);
      boolean containsOnlyFemales =  people.stream()
                .noneMatch(personPredicate);

      System.out.println(containsOnlyFemales);
    }


    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE , FEMALE , PREFER_NOT_TO_SAY
    }
}
