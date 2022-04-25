import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import java.lang.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javafx.scene.paint.Color;


public class LogInRController implements AppContact {
    public Label wrong;
    public Label login;


    @FXML
    private APPHANDLER app;


    @FXML
    public void setApp(APPHANDLER apphandler) {
        this.app = apphandler;
    }


    public TextField username;
    public PasswordField password;


    public void logininfo(MouseEvent mouseEvent) throws IOException {

        String passworduse = password.getText();
        String usernameuse = username.getText();


        File file = new File("ResponsibleData.txt");

        BufferedReader rd = new BufferedReader(new FileReader(file));

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