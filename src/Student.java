public class Student {
    private double gpa;

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("Student: %s earns %.2f tenge", super.toString(), getPaymentAmount());
    }

    @Override
    public double getPaymentAmount() {
        return (gpa > 2.67) ? 36660.00 : 0.00;
    }

    @Override
    public int compareTo(Person person) {
        if (person instanceof Student) {
            Student otherStudent = (Student) person;
            return Double.compare(this.getPaymentAmount(), otherStudent.getPaymentAmount());
        }
        return super.compareTo(person);
    }
}
