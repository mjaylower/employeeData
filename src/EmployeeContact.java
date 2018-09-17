public class EmployeeContact {

    private String firstName;
    private String lastName;
    private String idNumber;
    private int shiftWorked;

    EmployeeContact(String firstName, String lastName, String idNumber, int shiftWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.shiftWorked = shiftWorked;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public int getShiftWorked() {
        return shiftWorked;
    }

    public void setShiftWorked(int shiftWorked) {
        this.shiftWorked = shiftWorked;
    }

    void print(){
        System.out.println("Name: " + firstName + " " + lastName + "\n" + "ID: " + idNumber + "\n" + "Shift: " + shiftWorked);
    }
}
