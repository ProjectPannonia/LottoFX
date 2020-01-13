package DesignLoaders;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GiveNewWindow implements NewWindow{
    Parent parent;
    Stage stage;
    String path;
    String title;

    public GiveNewWindow(String fxmlPath,String title){
        this.path = fxmlPath;
        this.title = title;
    }

    public void createNewWindow(){
        try {
            parent = FXMLLoader.load(getClass().getClassLoader().getResource(this.path));
            stage = new Stage();
            stage.setTitle(this.title);
            stage.setScene(new Scene(parent));
            stage.setResizable(false);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
