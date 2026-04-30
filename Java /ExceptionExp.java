import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExp {
    public static void main(String[] args) {
        try{
            File file = new File("exp.txt");
            FileReader fr = new FileReader(file);
            System.out.println("File opened Successfully!");
            fr.close();
        }catch(IOException e){
            System.out.println("An IOException Occurred!"+e.getMessage());
        }
    }
}
