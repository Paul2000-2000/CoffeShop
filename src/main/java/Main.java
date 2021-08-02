import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application  {



    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("StartPageController.fxml"));
        primaryStage.setTitle("Coffe Shop");
        primaryStage.setScene(new Scene(root, 350, 400));
        primaryStage.show();

        int s=0;
        s++;
    }



    public static void main(String[] args)
    {
        launch(args);

    }
}
