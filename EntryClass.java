public class EntryClass{
    public static void main(String[] args) {
         
        Student student= new Student();
        student.setStName("pradnya");
        student.setStclass(11);
        student.setId(1);

        System.out.println(student.getStName());
        System.out.println(student.getStclass());
        System.out.println(student.getId());

        Employee employee=new Employee();
        employee.setFirstName("pranita");
        employee.setLastName("shelke");
        employee.setId(12);
      
        System.out.println (employee.getFirstName());
       System.out.println (employee.getLastName());
       System.out.println(employee.getId());

    }
}
        
         

    

