import java.util.Date;

class InheritanceDemo {
    public static void main(String args[]) {
        Student student = new Student("John Smith", new Date("12/12/1999"), 123123, "School Of International");
        student.printData();
        System.out.println("DOB: " + student.getDateOfBirth());

        Person person = new Student("John Nash", new Date("12/12/1990"), 123123, "School Of International");
        person.printData();
        System.out.println("DOB: " + person.getDateOfBirth());
    }
}