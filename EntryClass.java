import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EntryClass{

     public void studentMethod(int id, String name, int stclass,Double precentage){
        Student student = new Student(id,name,stclass,precentage);
        System.out.println("Student ID: "+student.getId());
        System.out.println("Student name: "+student.getStName());
        System.out.println("Student class: "+student.getStclass());
        System.out.println("student precentage: " +student.getPrecentage());
        System.out.println("******"); 

    }
 

     public void employeeMethod(int id, String firstName, String lastName){
        Employee employee = new Employee(id,firstName,lastName);
        System.out.println(" Employee ID: "+employee.getId());
        System.out.println("Employee firstName: "+employee.getFirstName());
        System.out.println("Employee lastName: "+employee.getLastName());
        System.out.println("******");

    }
     

    public void studentInput(){
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        
        InputStreamReader r=new InputStreamReader(System.in); 
        BufferedReader br=new BufferedReader(r); 
        
        
        System.out.println("Enter Student Id: ");
        student.setId(sc.nextInt());
        System.out.println("Student ID: "+student.getId());
        
        System.out.println("Enter Student Name:");
        student.setStName(sc.next());
        System.out.println("student stName: "+student.getStName());
        
        
        System.out.println("Enter Student Class:");
        student.setStclass(sc.nextInt());
        System.out.println("student stclass: "+student.getStclass());
        
        
        System.out.println("Enter Student Percentage:");
        student.setPrecentage(sc.nextDouble());
        System.out.println("student precentage: "+student.getPrecentage());

        sc.close();
    }
        
    
        public void employeeInput(){
        Employee employee = new Employee();
        Scanner sc1 = new Scanner(System.in);

        InputStreamReader r1=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r1); 
        System.out.println("Entry employee Id: ");
        employee.setId(sc1.nextInt());
        System.out.println("employee id: "+employee.getId());

        System.out.println("entry employee firstName: ");
        employee.setFirstName(sc1.next());
        System.out.println("Employee First Name: "+employee.getFirstName());

        System.out.println("Entry employee Lastname: ");
        employee.setLastName(sc1.nextLine());
        System.out.println("employee Lastname: "+employee.getLastName());

        sc1.close();

    }
    public static void main(String[] args) {
         
        EntryClass entryClass = new EntryClass();
        //entryClass.studentInput();
        entryClass.employeeInput();
        
    }

}    

    

