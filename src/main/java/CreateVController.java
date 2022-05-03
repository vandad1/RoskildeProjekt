import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.*;
import java.security.SecureRandom;
import java.util.Objects;
import java.util.Random;

import static javafx.scene.paint.Color.GREEN;

public class CreateVController implements AppContact {


    @FXML
    private APPHANDLER app;

    @Override
    public void setApp(APPHANDLER apphandler) {
        this.app = apphandler;
    }

    public void logout(MouseEvent mouseEvent) throws IOException {
        app.logout1();
    }

    public void GoBackMenuR(MouseEvent mouseEvent) throws IOException {
        app.GoBackToRmenu();
    }

    public TextField name;
    public TextField email;
    public TextField phonenr;
    public TextField address;
    public Label missing;
    public Label auto;
    public Label password;
    public static String name1;


    public void submit(MouseEvent mouseEvent) throws IOException {
        name1 = name.getText();
        String email1 = email.getText();
        String phonenr1 = phonenr.getText();
        String address1 = address.getText();


        if (Objects.equals(name1, "") || Objects.equals(email1, "") || Objects.equals(phonenr1, "") || Objects.equals(address1, "")) {
            missing.setText("Missing information!");
        } else {
            File volunteerInfo = new File("VolunteerData.txt");

            BufferedWriter bw = new BufferedWriter(new FileWriter(volunteerInfo, true));
            PrintWriter pw = new PrintWriter(bw);

            bw.write(name1 + "\n");
            bw.write(email1 + "\n");
            bw.write(phonenr1 + "\n");
            bw.write(address1 + "\n");

            char[] characters = "abcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
            Random random = new SecureRandom();
            StringBuilder pass = new StringBuilder();
            for (int i = 0; i < 5; i++) {
                pass.append(characters[random.nextInt(characters.length)]);
            }
            bw.write(String.valueOf(pass) + "\n");
            for (int i = 0; i < 2; i++) {
                bw.write("\n");
            }


            password.setText(String.valueOf(pass));

            auto.setText("Auto Generated Password:");

            missing.setTextFill(GREEN);
            missing.setText("Volunteer Created Succesfully!");

            bw.close();
            pw.close();


        }


    }


}
