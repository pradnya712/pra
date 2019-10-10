public class EntryClass{

    public void studentMethod(int id, String name, int stclass){
        Student student = new Student(id,name,stclass);
        System.out.println("Student ID: "+student.getId());
        System.out.println("Student name: "+student.getStName());
        System.out.println("Student class: "+student.getStclass());
        System.out.println("******");

    }


    public void employeeMethod(int id, String firstName, String lastName){
        Employee employee = new Employee(id,firstName,lastName);
        System.out.println(" Employee ID: "+employee.getId());
        System.out.println("Employee firstName: "+employee.getFirstName());
        System.out.println("Employee lastName: "+employee.getLastName());
        System.out.println("******");

    }
    
    public static void main(String[] args) {
         
        EntryClass entryClass = new EntryClass();

        entryClass.studentMethod(10, "Kalyan", 12);
        entryClass.studentMethod(12, "pradnya", 13);
        entryClass.studentMethod(25, "some name", 3);

        entryClass.employeeMethod(1,"pradnya", "shelke");
        entryClass.employeeMethod(2, "pranjal", "shitole");
        entryClass.employeeMethod(3, "chhaya", "shelke");
    }

}    

    

