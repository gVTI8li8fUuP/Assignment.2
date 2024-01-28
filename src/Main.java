public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("S1", "S123", 1.00);
        Student student2 = new Student("S2", "S234", 2.00);
        Employee employee1 = new Employee("E1", "E11", "teacher", 100);
        Employee employee2 = new Employee("E2", "E22", "teacher", 200);


        ArrayList<Person> individuals = new ArrayList<>();
        individuals.add(student1);
        individuals.add(student2);
        individuals.add(employee1);
        individuals.add(employee2);

        printData(individuals);
    }

    public static void printData(Iterable<Person> iterable) {
        for (Person person : individuals) {
            System.out.println(person + "earns" + person.getPaymentAmount());
        }
    }
}
