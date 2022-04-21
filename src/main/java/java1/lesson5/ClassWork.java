package java1.lesson5;

public class ClassWork {

    public static void main(String[] args) {
        Person pers = new Person();

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Petya", "Ivanov", "Peper", "aaaa@maoil.com", 23123123, 1111, 40);
        persArray[1] = new Person("Galya", "Galina", "GAlinovna", "arewr@mail.com", 1211123123, 3123123, 50);
        persArray[2] = new Person("dsfd", "sdasdas", "sdadas", "fsdfsdf!@222.re", 123123, 312312, 60);
        persArray[3] = new Person("dsfd423", "sda534sdas", "s3442dadas", "fsdfsdf!@222.re", 123123, 312312, 31);
        persArray[4] = new Person("dsfgdf", "sdasjghdas", "sdadgdfgas", "fsdfsdf!@222.re", 123123, 312312, 31);

        for (Person person : persArray) {
            if (person.getAge() > 40) {
                person.printPerson();
            }
        }

    }

}





