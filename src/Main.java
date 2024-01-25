import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Student S1 = new Student("S1", "S123", 1.00);
        Student S2 = new Student("S2", "S234", 2.00);
        Student S3 = new Student("S3", "S345", 3.00);

        Employee E1 = new Employee("E1", "E11", "teacher", 100);
        Employee E2 = new Employee("E2", "E22", "teacher",200);
        Employee E3 = new Employee("E3", "E33", "teacher", 300);

        arrayList<Person> people =new ArrayList<>();
        people.add(S1);
        people.add(S2);
        people.add(S3);
        people.add(E1);
        people.add(E2);
        people.add(E3);
        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
