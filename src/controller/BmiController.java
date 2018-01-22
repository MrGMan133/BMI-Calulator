package controller;

import java.math.BigDecimal;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.BmiCalculator;

public class BmiController {
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
			BigDecimal weight = new BigDecimal(weightTextField.getText());
			result = bmiCalculator.showResult(height, weight);
			
			resultLabelText.setText(result);
			
		}catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Please enter correct values");
		}
	}
}
