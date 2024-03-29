package design.pattern.builder.a1.after;

public class Main {
    /*
     *  1) A sort of Josh Bloch
     *  2) to generate immutable object
     */
    
    public static void main(String[] args) {
        Person person = new Person.PersonalInfoBuilder()
                                            .address("myaddress")
                                            .age(5)
                                            .cellphone("1234567890")
                                            .firstName("my first name")
                                            .lastName("my last name")
                                            .phone("myphone")
                                            .build();
        System.out.println(person);
    }
}







