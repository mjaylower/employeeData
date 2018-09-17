
public class Main{

    public static void main(String[] args) {

        EmployeeContact employee1 = new EmployeeContact("Michael", "Lower", "42", 2);
        EmployeeContact employee2 = new EmployeeContact("Rachel", "Miller", "21", 1);
        EmployeeContact employee3 = new EmployeeContact("Mark", "Riley", "289", 3);

        employee1.print();
        System.out.println("\n");
        employee2.print();
        System.out.println("\n");
        employee3.print();

     }
}


