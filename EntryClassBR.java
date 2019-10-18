import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntryClassBR{   
    Student[] student;

       public void studentInput(int i){

            
        
            try{
                           
                InputStreamReader r=new InputStreamReader(System.in); 
                BufferedReader br=new BufferedReader(r); 
                
                
                System.out.println("Enter Student Id: ");
                student[i].setId(Integer.parseInt(br.readLine()));
                
                System.out.println("Enter Student Name:");
                student.setStName(br.readLine());
                
                System.out.println("Enter Student Class:");
                student.setStclass(Integer.parseInt(br.readLine()));
                
                System.out.println("Enter Student Percentage:");
                student.setPrecentage(Double.parseDouble(br.readLine()));
                
                    
                
                
            }
            catch (IOException e){

                System.out.println(e);
            }
        }
        
    
        /* public void employeeInput(){
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
            System.out.println("id"+\t)
            /* System.out.println("employee id: "+employee.getId());
            System.out.println("Employee First Name: "+employee.getFirstName());
            System.out.println("employee Lastname: "+employee.getLastName());
 
            }
            catch (IOException e){
                System.out.println(e);
            } 
        }*/
    
    public static void main(String[] args) {
         
        EntryClassBR entryClassbr = new EntryClassBR();
        entryClassbr.studentInput();
        //entryClassbr.employeeInput();

        System.out.println("**************************");
                System.out.println("ID"+"\t"+"Name"+"\t"+"Class"+"\t"+"Percentage ");
                System.out.println(student.getId()+"\t"+student.getStName()+"\t"+student.getStclass()+"\t"+student.getPrecentage());
        
    }

}    

    

