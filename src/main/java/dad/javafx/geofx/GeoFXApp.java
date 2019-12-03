package dad.javafx.geofx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GeoFXApp extends Application {
	private static Stage primaryStage;
	//controlador
	private ControllerGeoFX controller;
	@Override
	public void start(Stage primaryStage) throws Exception {
		GeoFXApp.primaryStage = primaryStage;
		
		controller = new ControllerGeoFX();
		
		Scene scene = new Scene(controller.getView());
		
		primaryStage.setTitle("GeoFX");
		primaryStage.setScene(scene);
		primaryStage.show();

	}
	public static void main(String[] args) {
		launch(args);
	}
}
