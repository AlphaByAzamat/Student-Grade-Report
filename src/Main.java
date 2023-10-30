import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> Studentinfo = new ArrayList<>();
        File student_grade = new File("FileLocation/Student_grade");
        FileReader fileReader = new FileReader(student_grade);
        BufferedReader read = new BufferedReader(fileReader);
        String lines;


        while ((lines = read.readLine()) != null) {
            Studentinfo.add(lines);

        }
        info(Studentinfo);


    }

    private static void info(ArrayList arrayList) throws IOException {
        int i = 0;
        while (i < arrayList.size() + 1) {
            //List<String> split = Arrays.asList(arrayList.get(i).toString().split(","));
            String[] split = arrayList.get(i).toString().split(",");
            String class_number = split[0];
            String name = split[1];
            String course_name = split[2];
            try {

                int exam_score1 = Integer.parseInt(split[3]);
                int exam_score2 = Integer.parseInt(split[4]);
                int exam_score3 = Integer.parseInt(split[5]);
                int assignment_score1 = Integer.parseInt(split[6]);
                int assignment_score2 = Integer.parseInt(split[7]);

                System.out.println("Class number: " + class_number);
                System.out.println("Full name: " + name);
                System.out.println("Course: " + course_name);
                System.out.println("Total exam score: " + (exam_score1 + exam_score2 + exam_score3) / 3);
                System.out.println("Total assignment score: " + (assignment_score1 + assignment_score2) / 2);
                System.out.println("Final Grade Score: " + (0.7 * (exam_score1 + exam_score2 + exam_score3) / 3 + 0.3 * (assignment_score1 + assignment_score2) / 2));
                System.out.println("===========================");
                i++;
            } catch (Exception e) {

            }
        }
    }

    public static File filecreater (String name) throws FileNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream(name);
        File file=new File("FileLocation/jack");

return file;
    }

    public static void write(ArrayList arrayList) throws FileNotFoundException {
        int i = 0;
        while (i < arrayList.size() + 1) {
            //List<String> split = Arrays.asList(arrayList.get(i).toString().split(","));
            String[] split = arrayList.get(i).toString().split(",");
            String class_number = split[0];
            String name = split[1];
            String course_name = split[2];
            try {

                int exam_score1 = Integer.parseInt(split[3]);
                int exam_score2 = Integer.parseInt(split[4]);
                int exam_score3 = Integer.parseInt(split[5]);
                int assignment_score1 = Integer.parseInt(split[6]);
                int assignment_score2 = Integer.parseInt(split[7]);


            } catch (NumberFormatException e) {

            }
            filecreater(name);



        }
    }
}








