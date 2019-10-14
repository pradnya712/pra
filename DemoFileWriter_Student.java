import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * DemoFileWriter
 */
public class DemoFileWriter_Student {
    String content;
   
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
            
            /* System.out.println("**************************");
            System.out.println("Student ID: "+student.getId());
            System.out.println("student stName: "+student.getStName());
            System.out.println("student stclass: "+student.getStclass());
            System.out.println("student precentage: "+student.getPrecentage()); */
            
            content=student.getId()+" "+student.getStName()+" "+student.getStclass()+" "+student.getPrecentage();
            
        }
        catch (IOException e){

            System.out.println(e);
        }
    }

    public static void main(String[] args) {
       
        DemoFileWriter_Student demoFileWriter_Student = new DemoFileWriter_Student();
        demoFileWriter_Student.studentInput();

        try {
            FileWriter fileWriter = new FileWriter("E:/info.txt");
            fileWriter.write(demoFileWriter_Student.content);
            fileWriter.close();

        } catch (IOException e) {
            System.out.println(e);
        }
        
    }
}