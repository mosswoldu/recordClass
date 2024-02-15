package IQ.recordClass;

public record EmployeeRecord(String name, int employeeNUmber) {

    // records can not extend any other class as they already extend to Record Class
    //records can't be extended by other classes as they are intrinsically final classes
    // can implement interfaces like Runnable class
    // automatically create canonical constructor
    // u can create static fields
    private static final String DEFAULT_EMPLOYEE_NAME="George";
    //private String name2; //will give compile error


    //compact constructor if we want to override the constructor
    public  EmployeeRecord{
        if(employeeNUmber<0){
            throw new IllegalArgumentException("Employee number can not be negative");
        }
    }
    public String nameInUpperCASE(){

        return  name.toUpperCase();
    }
    public  void printSomething(){
        System.out.println("print");
    }
}
