import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Window;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MyCalendercontroller implements AppContact {

    public javafx.scene.control.DatePicker DatePicker;
    public ChoiceBox timepicker;

    @FXML
    private APPHANDLER app;

    @FXML
    private Label myLabel;

    @FXML
    VBox vbMenu;

    FileChooser fileChooser = new FileChooser();


    public void initialize(URL location, ResourceBundle resources){
        fileChooser.setInitialDirectory(new File("C:\\temp"));
    }

    @FXML
    private void handleSaveClicked(ActionEvent event){
        Window stage = vbMenu.getScene().getWindow();
        fileChooser.setTitle("Save Dialog");
        fileChooser.setInitialFileName("mysave");
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("text file", "*.txt"), new FileChooser.ExtensionFilter("pdf", "*.pdf"));

        try{
            File file = fileChooser.showSaveDialog(stage);
            fileChooser.setInitialDirectory(file.getParentFile());
            //TODO create load and save to file, not working as of now, just testing.
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    private void handleLoadClicked(ActionEvent event){
        Window stage = vbMenu.getScene().getWindow();
        fileChooser.setTitle("Load Dialog");

        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("text file", "*txt", "*.docx", "*.doc"),
                new FileChooser.ExtensionFilter("pdf", "*.pdf"),
                new FileChooser.ExtensionFilter("images", "*.jpg", "*gif"));
    }

    private String[] time = {"8:00","10:00","12:00","14:00","16:00","18:00","20:00"};

    public MyCalendercontroller() {
    }


    public void logout(MouseEvent mouseEvent) throws IOException {
        app.logout1();
    }

    public void GoBackMenuV(MouseEvent mouseEvent) throws IOException{
        app.GoBackToVMenu();
    }


    @Override
    public void setApp(APPHANDLER app) {
        timepicker.getItems().addAll(time);
    }
}
