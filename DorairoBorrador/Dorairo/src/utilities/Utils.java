package utilities;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Utils {

	private static Stage ownerStage;

	/**
	 * Muestra un dialog de warning con el mensaje proporcionado
	 * 
	 * @param mensaje a mostrar en el dialog
	 */
	public static void mostrarAlerta(String mensaje, String tipo) {
		Alert alert = new Alert(AlertType.valueOf(tipo));
		alert.setTitle(tipo);
		alert.setHeaderText(null);
		alert.setContentText(mensaje);
		alert.initOwner(ownerStage);
		alert.showAndWait();
	}

	/**
	 * Establece el stage proporcionado como ownerStage
	 * 
	 * @param stage que se va a establecer
	 */
	public static void setOwnerStage(Stage stage) {
		ownerStage = stage;

	}

}
