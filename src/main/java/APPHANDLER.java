import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;


public class APPHANDLER extends Application {

    Scene sceneStart;
    private Stage stageStart;

    @Override
    public void start(Stage stage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(APPHANDLER.class.getResource("/StartsideRoskilde.fxml"));
        sceneStart = fxmlLoader.load();
        startsideContro ller controllerstart = fxmlLoader.getController();
        controllerstart.setApp(this);
        stage.setScene(sceneStart);
        stage.show();
        this.stageStart = stage;

    }

    public void changescnen (String gui) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(gui));
        Scene load = loader.load();
        startsideController controllerstart = loader.getController();
        controllerstart.setApp(this);
        stageStart.setScene(load);
    }


    public static void run(){
        launch();
    }

    public void login() throws IOException {
        changescnen("RESPONSIBLE_MENU.fxml");
    }




}