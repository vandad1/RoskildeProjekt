import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class EditShiftsController implements AppContact {


    @FXML
    public APPHANDLER app;

    @FXML
    public TableView<User> table;

    @FXML
    public TableColumn<User, String> task;

    @FXML
    public TableColumn<User, String> date;

    @FXML
    public TableColumn<User, String> time;

    @FXML
    public void GoBackMenuR(MouseEvent mouseEvent) throws IOException {
        app.GoBackToRmenu();
    }

    @FXML
    public void logout(MouseEvent mouseEvent) throws IOException {
        app.logout1();
    }


    ObservableList<User> List = FXCollections.observableArrayList(
            new User("Goere rent", "05/03/2022", "15:00 - 19:00"),
            new User("Rens", "05/03/2022", "15:00 - 20:00"),
            new User("Hotdog service", "05/03/2022", "20:00 - 24:00")
    );


    public void CellValue(URL url, ResourceBundle resourceBundle) {
        task.setCellValueFactory(new PropertyValueFactory<User, String>("task"));
        date.setCellValueFactory(new PropertyValueFactory<User, String>("date"));
        time.setCellValueFactory(new PropertyValueFactory<User, String>("time"));

        table.setItems(List);
    }

    @Override
    public void setApp(APPHANDLER apphandler) {
        this.app = apphandler;
    }

}


