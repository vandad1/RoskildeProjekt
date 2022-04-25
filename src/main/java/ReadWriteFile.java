import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteFile {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\SourSolution\\OneDrive\\Skrivebord\\Javafileread.txt");
        Scanner scanner = new Scanner(file);

        String fileContent = "HEllO, I AM A NEW FILE" + "\n";
        while (scanner.hasNextLine()) {
            fileContent = fileContent.concat(scanner.nextLine() + "\n");
        }

        FileWriter writer = new FileWriter("C:\\Users\\SourSolution\\OneDrive\\Skrivebord\\JavafilereadUpdate");
        writer.write(fileContent);
        writer.close();

        System.out.println(fileContent);
    }
}
