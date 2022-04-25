import java.io.*;

public class searchVolunteerResponsible {
    public static void find(String word, File file){
        try{
            BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
