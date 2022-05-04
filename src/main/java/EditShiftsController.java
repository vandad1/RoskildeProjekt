import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseEvent;


import java.io.IOException;

public class EditShiftsController implements AppContact {

    @Override
    public void setApp(APPHANDLER app) {
            this.app = app;
        }

    @FXML
    public APPHANDLER app;

    @FXML
    public TableView<User> table;

    @FXML
    public TableColumn<User, String> name;

    @FXML
    public TableColumn<User, String> date;

    @FXML
    public TableColumn<User, String> task;

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

    public void List(APPHANDLER app, ObservableList observableList) {

    }


    }



