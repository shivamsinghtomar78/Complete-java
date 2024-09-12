package Challenge.company;

public class testEmployee {
    public static void main(String[] args) {
        Employee emp=new Employee("shivam",22,100000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("Golu");
        System.out.println(emp.getEmployeeDetails());
    }
}
