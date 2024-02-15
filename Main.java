package IQ.recordClass;

public class Main {
    public static void main(String[] args) {
        EmployeeRecord emp = new EmployeeRecord("Mussa", 123);
        System.out.println(emp);
        //no getMethod
        System.out.println(emp.name());
        System.out.println(emp.nameInUpperCASE());

        Employee emp1= new Employee("Richard",123);
        System.out.println(emp1);
        System.out.println(emp1.getName());

        EmployeeRecord employeeRecord= new EmployeeRecord("Almaz",-90);
        System.out.println(employeeRecord.employeeNUmber());

    }
}