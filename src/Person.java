public class Person implements Payable {

    private  int id;
    private String name;
    private String surname;
    private static int nextId = 1;
    public Person() {
        this.id = nextId++;
    }
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String toString() {
        return String.format("%s: %d. %s %s", getPosition(), id, name, surname);
    }

    public String getPosition() {
        return "Person";
    }

    @Override
    public double getPaymentAmount() {
        return 0.00;
    }

    @Override
    public int compareTo(Person person) {
        return Double.compare(this.getPaymentAmount(), person.getPaymentAmount());
    }
}



















}
