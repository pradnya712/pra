public class Student
{
    private int id;
    private String stName;
    private int stclass;
    private double precentage;

    public Student(){

    }   
    public Student(int id, String stName, int stclass , Double precentage) {
        this.id = id;
        this.stName = stName;
        this.stclass = stclass;
        this.precentage = precentage;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public int getStclass() {
        return stclass;
    }

    public void setStclass(int stclass) {
        this.stclass = stclass;
    }

    public double getPrecentage() {
        return precentage;
    }

    public void setPrecentage(double precentage) {
        this.precentage = precentage;
    }

  

    

    
}