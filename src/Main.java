import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File student_grade=new File("FileLocation/Student_grade");
        FileReader fileReader=new FileReader(student_grade);
        System.out.println(fileReader.toString());

    }
}