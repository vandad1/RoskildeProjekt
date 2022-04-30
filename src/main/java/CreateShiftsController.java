import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.*;

import static javafx.scene.paint.Color.GREEN;
import static javafx.scene.paint.Color.RED;

public class CreateShiftsController implements AppContact{



    @FXML
    private APPHANDLER app;

    @Override
    public void setApp(APPHANDLER app) {
        this.app = app;
    }

    public void GoBackMenuR(MouseEvent mouseEvent) throws IOException {
        app.GoBackToRmenu();
    }

    public void logout(MouseEvent mouseEvent) throws IOException {
        app.logout1();
    }

    public Label foundor;
    public TextField fullname;

    public void confirm(MouseEvent mouseEvent) throws IOException{

        File VolunteerData = new File("VolunteerData.txt");
        BufferedReader br = new BufferedReader(new FileReader(VolunteerData));
        String s;
        String name = fullname.getText();

        while((s = br.readLine()) != null){
            if(s.equals(name)){
                foundor.setText("Person found!");
                foundor.setTextFill(GREEN);
                break;
            }
            else{
                foundor.setText("Person not found in system");
                foundor.setTextFill(RED);
            }

        }
    }


    public void submitS(MouseEvent mouseEvent) throws IOException{
        String filename = "VolunteerData.txt";

    }
}
