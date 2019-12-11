import java.util.Date;

class Student extends Person {
    private int regId;
    private String nameOfSchool;
    Student(String studentName, Date dateOfBirth, int regId, String nameOfSchool) {
        super(studentName, dateOfBirth);
        this.regId = regId;
        this.nameOfSchool = nameOfSchool;
    }
    // Overriding the method
    public void printtData() {
        super.printData();
        System.out.println("School Reg. Id: " + regId);
        System.out.println("School Name: " + nameOfSchool);
    }

    /**
     *  public Date getDateOfBirth() {
                ^
        overridden method is final
     */
    /* public Date getDateOfBirth() {
        super.getDateOfBirth();
    } */

}