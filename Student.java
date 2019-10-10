public class Student
{
    private int id;
    private String stName;
    private int stclass;

    public Student(){

    }   
    public Student(int id, String stName, int stclass) {
        this.id = id;
        this.stName = stName;
        this.stclass = stclass;
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

    

    
}