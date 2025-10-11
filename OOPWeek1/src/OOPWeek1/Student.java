package OOPWeek1;

public class Student {
    private int idNumber;
    private String firstName;
    private String lastName;

    public Student(int idNumber, String first, String last) {
        this.idNumber = idNumber;
        this.firstName = first;
        this.lastName = last;
    }
    public int getIdNumber() {
        return this.idNumber;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public String getSortName() {
        return this.lastName + ", " + this.firstName;
    }
    public String toString() {
        return this.idNumber + " " + getSortName();
    }
}
