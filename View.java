import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;

public class View extends Application {

    private Track track;

    public static void main(String[] args) { launch(args); }

    @Override
    public void start(final Stage stage) throws Exception {
        Track t = new Track();
        Scene scene = new Scene(t, 700, 700, Color.GHOSTWHITE);
        stage.setScene(scene);
        stage.show();
    }


}