package application;

import controller.LoginController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Login.fxml"));
            Parent root = loader.load();
            
            // Obtener el controlador
            LoginController loginController = loader.getController();
            
            // Configurar el primaryStage y mostrar la escena
            Scene scene = new Scene(root, 400, 400);
            primaryStage.setScene(scene);
            
            // add icono
            Image icon = new Image(getClass().getResourceAsStream("/resources/images/logo.jpg"));
            primaryStage.getIcons().add(icon);

            primaryStage.setTitle("Dorairo");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
