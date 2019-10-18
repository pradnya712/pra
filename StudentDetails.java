import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * StudentDetails
 */
public class StudentDetails {

        
         
      
        public static void main(String[] args) {
        
                  StudentDetails sd = new  StudentDetails();
       
                   Student std1 = new Student();
                   
                   
                    int choice=0;

                    while(true){
                        System.out.println("1. Student Id: ");
                        System.out.println("2. Student Name: ");
                        System.out.println("3. Student Class: ");
                        System.out.println("4. Student percentage: ");
                        System.out.println("5. Exit ");
                        System.out.println("****Enter option****");
                    
                        try {
                            choice=Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());

                            if(choice==1){
                                System.out.println("Enter Id: ");
                                std1.setId(Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine()));
                                
                            }    

                            if(choice==2){
                                System.out.println("Enter Name: ");
                               std1.setStName((new BufferedReader(new InputStreamReader(System.in))).readLine());
                                  
                            }  

                            if(choice==3){
                                System.out.println("Enter Class: ");
                                std1.setStclass(Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine()));
                                
                            }
                            if(choice==4){
                                System.out.println("Enter percentage: ");
                                std1.setPercentage(Double.parseDouble((new BufferedReader(new InputStreamReader(System.in))).readLine()));
                                
                            }
                            if(choice==5){
                                    System.out.println("***********"+"\n"+"Id-"+std1.getId());
                                    System.out.println("Name-"+std1.getStName());
                                    System.out.println("Class-"+std1.getStclass());
                                    System.out.println("Percentage-"+std1.getPrecentage());
                                   System.exit(1);
                            }
                        }catch (IOException e) {
                                 System.out.println(e);
                        }
                    }
        }    
                
            

}
           
    
                
   
