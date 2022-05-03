import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LogInVController implements AppContact {

    @FXML
    private APPHANDLER app;

    @Override
    public void setApp(APPHANDLER apphandler) {
        this.app = apphandler;
    }

    public TextField username;
    public PasswordField password;
    public Label login;
    public static String usernameuse;


    public void back(MouseEvent mouseEvent) throws IOException {
        app.GoBackToChooseRorV();
    }


    public void logininfo(MouseEvent mouseEvent) throws IOException {
        String passworduse = password.getText();
        usernameuse = username.getText();


        File VolunteerData = new File("VolunteerData.txt");

        BufferedReader rd = new BufferedReader(new FileReader(VolunteerData));

        String s;
        while ((s = rd.readLine()) != null) {

            if (s.equals(usernameuse)) {

                for (int i = 0; i < 3; i++) {
                    s = rd.readLine();
                }

                if (s.equals(passworduse)) {
                    app.OpenStartV();
                    s = rd.readLine();
                    VOLUNTEERMENUcontroller.shifts.setText(s);


                } else {
                    login.setText("Wrong username or password");
                    login.setTextFill(Color.web("#FF0000"));

                }

            } else {
                login.setText("Wrong username or password");
                login.setTextFill(Color.web("#FF0000"));
            }
        }
        rd.close();
    }


}
