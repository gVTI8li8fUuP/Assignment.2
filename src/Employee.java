public class Employee {
    private String position;
    private double salary;

    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Employee: %s earns %.2f tenge", super.toString(), salary);
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }

    @Override
    public int compareTo(Person person) {
        if (person instanceof Employee) {
            Employee otherEmployee = (Employee) person;
            return Double.compare(this.getSalary(), otherEmployee.getSalary());
        }
        return super.compareTo(person);
    }

}
