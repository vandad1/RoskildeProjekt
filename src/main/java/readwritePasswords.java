import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

public class readwritePasswords {
    public static void main(String[] args) {
        //Converting strings into byte array
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        byte[] data = str.getBytes();
        Path path = Paths.get("./Passwords.csv");

        try (OutputStream out = new BufferedOutputStream(Files.newOutputStream(path, CREATE, APPEND))) {
            out.write(data, 0, data.length);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
