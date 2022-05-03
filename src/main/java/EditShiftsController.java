import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class EditShiftsController implements Initializable {

    @FXML
    private TextField editShift;

    @FXML
    private TableView<User> shiftTable;

    @FXML
    private TableColumn<User, String> shiftTask;

    @FXML
    private TableColumn<User, String> shiftDate;

    @FXML
    private TableColumn<User, String> shiftTime;

    @FXML
    void GoBackMenuR(MouseEvent event) {

    }

    @FXML
    void logout(MouseEvent event) {

    }

    @FXML
    void search(MouseEvent event) {

    }

    ObservableList<User> List = FXCollections.observableArrayList(
            new User("Goere rent", "05/03/2022", "15:0019:00"));

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        shiftDate.setCellValueFactory(new PropertyValueFactory<User, String>("shiftDate"));
        shiftTask.setCellValueFactory(new PropertyValueFactory<User, String>("shiftTask"));
        shiftTime.setCellValueFactory(new PropertyValueFactory<User, String>("shiftTime"));

        shiftTable.setId(String.valueOf(List));
    }
}
