public class Person {
        String name;
        String address;
        final String country = "Indonesia";

        //Constructor Default
        Person(){

        }
        //Constructor 1 Param
        Person(String paramName){
            name = paramName;
        }

        //Constructor 2 Param
        Person(String paramName, String paramAddress){
            this(paramName);
            address = paramName;
        }


        //Method
        void sayHello(String paramName){
            System.out.println("Hi " + paramName + ", My name is " + name);
        }

        String sayAddress(){
            return "My address is " + address;
        }
    }
