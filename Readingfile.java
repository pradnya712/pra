import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Readingfile {

    public static void main(String[]arg){
        StringBuilder sb = new StringBuilder();
       
  try {
    BufferedReader bReader = Files.newBufferedReader(Paths.get("studentname"));
    
    String line;
    while((line=bReader.readLine())!=null)
       sb.append(line).append("\t");

   System.out.println(sb);
  }
   catch (Exception e) {
    System.out.println(e);
  }
       
}
}