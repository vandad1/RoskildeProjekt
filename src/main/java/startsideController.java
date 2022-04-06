import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.*;


public class startsideController {
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
        String usernameuse =  username.getText();

        File file = new File("ResponsibleData.txt");

        BufferedReader rd = new BufferedReader(new FileReader(file));

        String s;
        while ((s = rd.readLine())!=null){
            if(s.equals(usernameuse)){
                s = rd.readLine();
                if(s.equals(passworduse)){
                    app.login();
                }

            }
        }
        rd.close();
    }


}