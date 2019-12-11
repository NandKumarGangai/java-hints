import java.util.Date;

class Person {
    private String personName;
    private Date dateOfBirth;
    private static long universalId = 741614512156l;

    // Constructor overloading
    Person() {
        setUniversalId();
    }

    Person(String personName, Date dateOfBirth) {
        this.personName = personName;
        this.dateOfBirth = dateOfBirth;
        setUniversalId();
    }

    public void printData() {
        System.out.println("Name:  " + personName);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("UniversalId: " + universalId);
    }

    public void setPerson(String personName, Date dateOfBirth) {
        setPersonName(personName);
        setDateOfBirth(dateOfBirth);
        setUniversalId();
    }

    private void setPersonName(String personName) {
        this.personName = personName;
    }

    private void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    private static void setUniversalId() {
        universalId++;
    }

    public String getPersonName() {
        return this.personName;
    }

    // No sub - class can override this method.
    public final Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    public long getUniversalId() {
        return universalId;
    }
}