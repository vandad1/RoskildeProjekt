import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class EditShiftsController implements Initializable {

    @FXML
    private TextField editShift;

    @FXML
    private TreeTableView<User> shiftTable;

    @FXML
    private TreeTableColumn<User, String> shiftTask;

    @FXML
    private TreeTableColumn<User, String> shiftDate;

    @FXML
    private TreeTableColumn<User, String> shiftTime;

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
