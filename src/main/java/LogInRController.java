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


public class LogInRController implements AppContact {


    @FXML
    private APPHANDLER app;

    @FXML
    public void setApp(APPHANDLER apphandler) {
        this.app = apphandler;
    }


    public TextField username;
    public PasswordField password;
    public static String usernameuse;
    public Label login;


    public void logininfo(MouseEvent mouseEvent) throws IOException {

        String passworduse = password.getText();
        usernameuse = username.getText();


        File responsibleData = new File("ResponsibleData.txt");

        BufferedReader rd = new BufferedReader(new FileReader(responsibleData));

        String s;
        while ((s = rd.readLine()) != null) {

            if (s.equals(usernameuse)) {

                s = rd.readLine();
                if (s.equals(passworduse)) {
                    app.OpenStartR();
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

    public void back(MouseEvent mouseEvent) throws IOException {
        app.GoBackToChooseRorV();
    }
}