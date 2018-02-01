package controller;

import java.math.BigDecimal;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.BmiCalculator;

public class BmiController {
    private static Logger log = Logger.getLogger(BmiController.class.getName());
	private BmiCalculator bmiCalculator = new BmiCalculator();
	private String result ="";
	
	@FXML
	private TextField heightTextField;
	
	@FXML
	private TextField weightTextField;
	
	@FXML
	private Label resultLabelText;

	@FXML
	private void calculateButtonClicked(ActionEvent event) {
		try {
			BigDecimal height = new BigDecimal(heightTextField.getText());
			log.info("Height: " + height.toString());
			BigDecimal weight = new BigDecimal(weightTextField.getText());
			log.info("Weight: " + weight.toString());
			result = bmiCalculator.showResult(height, weight);
			
			resultLabelText.setText(result);
			
		}catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Please enter correct values");
            log.warning("Incorrect value inserted");
		}
	}
}
