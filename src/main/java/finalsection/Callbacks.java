package finalsection;

import java.util.function.Consumer;

//CALLBACK FUNCTION

public class Callbacks {
    public static void main(String[] args) {
   hello("Asutosh " ,null , value ->
           {
               System.out.println("lastName is not provided for " + value);
           }  );

   // We are not taking any argument for 3rd parameter

   hello2("Munna" , null , () -> {
       System.out.println("no last name provided");
   });
    }
    static void hello(String FirstName , String lastName , Consumer<String> callback){
        System.out.println(FirstName);
        if(lastName != null)  {
            System.out.println(lastName);
        }
        else{
            callback.accept(FirstName);
        }
    }

//    Callbacks in javaScript

//    function hello(firstName , lastName , callback) {
//        console.log(firstname);
//        if(lastName){
//            console.log(lastName)
//        }  else {
//            callback();
//        }
//    }

    static void hello2(String FirstName , String lastName , Runnable callback){
        System.out.println(FirstName);
        if(lastName != null)  {
            System.out.println(lastName);
        }
        else{
            callback.run();
        }
    }

}

