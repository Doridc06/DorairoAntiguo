package constants;

import java.util.Date;

import models.Perfil;

public class Constants {

	public static final String ERROR_TYPE = "ERROR";
	public static final String WARNING_TYPE = "WARNING";
	public static final String INFORMATION_TYPE = "INFORMATION";
	
	public static final String URL_LOGO_AMPLIADO = "/resources/images/logoAmpliado.jpg";
	public static final String URL_LOGIN_FXML = "/view/Login.fxml";
	public static final String URL_REGISTRO_FXML = "/view/Registro.fxml";
	
	public static final Perfil PERFIL_JAIRO = new Perfil("Jairopo", "Jairo", "jairo@ejemplo.com", "123", new Date());
	public static final Perfil PERFIL_DORIANA = new Perfil("Doridc", "Doriana", "doriana@ejemplo.com", "456", new Date());

}
