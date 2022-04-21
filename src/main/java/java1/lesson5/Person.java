package java1.lesson5;

public class Person {
    private String lastName, firstName, patronymic, email;
    private int phone, salary, age;

    public Person() {

    }


    public Person(String lastName, String firstName, String patronymic, String email, int phone, int salary, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printPerson() {
        System.out.printf("Person %s, lastName - %s, firstName - %s, patronymic - %s, email - %s, phone - %d, salary - %d, age - %d \n", lastName, firstName, patronymic, email, phone, salary, age);
    }

    public int getAge() {
        return age;
    }

}
