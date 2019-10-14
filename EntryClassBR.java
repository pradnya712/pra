import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntryClassBR{

   

       public void studentInput(){

            Student student = new Student();
        
            try{
                           
                InputStreamReader r=new InputStreamReader(System.in); 
                BufferedReader br=new BufferedReader(r); 
                
                
                System.out.println("Enter Student Id: ");
                student.setId(Integer.parseInt(br.readLine()));
                
                System.out.println("Enter Student Name:");
                student.setStName(br.readLine());
                
                System.out.println("Enter Student Class:");
                student.setStclass(Integer.parseInt(br.readLine()));
                
                System.out.println("Enter Student Percentage:");
                student.setPrecentage(Double.parseDouble(br.readLine()));
                
                System.out.println("**************************");
                System.out.println("Student ID: "+student.getId());
                System.out.println("student stName: "+student.getStName());
                System.out.println("student stclass: "+student.getStclass());
                System.out.println("student precentage: "+student.getPrecentage());
                
            }
            catch (IOException e){

                System.out.println(e);
            }
        }
        
    
        public void employeeInput(){
            Employee employee = new Employee();
        
            try{
        
            InputStreamReader r1=new InputStreamReader(System.in);
            BufferedReader br1=new BufferedReader(r1); 
        
            System.out.println("Entry employee Id: ");
            employee.setId(Integer.parseInt(br1.readLine()));
            
            System.out.println("entry employee firstName: ");
            employee.setFirstName(br1.readLine());
            
            System.out.println("Entry employee Lastname: ");
            employee.setLastName(br1.readLine());
            
            System.out.println("*****************************");
            System.out.println("employee id: "+employee.getId());
            System.out.println("Employee First Name: "+employee.getFirstName());
            System.out.println("employee Lastname: "+employee.getLastName());

        }
            catch (IOException e){
                System.out.println(e);
            }
    }
    
    public static void main(String[] args) {
         
        EntryClassBR entryClassbr = new EntryClassBR();
        entryClassbr.studentInput();
        entryClassbr.employeeInput();
        
    }

}    

    

