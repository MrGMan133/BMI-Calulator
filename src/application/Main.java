package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import org.apache.log4j.xml.DOMConfigurator;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			DOMConfigurator.configure("log4j.xml");
			Parent root = FXMLLoader.load(getClass().getResource("/view/BMICalc.fxml"));
			Scene scene = new Scene(root,400,400);
			primaryStage.setTitle("BMI Calculator");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
