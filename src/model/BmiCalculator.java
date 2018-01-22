package model;

import java.math.BigDecimal;

public class BmiCalculator {
	
	private static final BigDecimal below = new BigDecimal("18.5");
	private static final BigDecimal normalLow = new BigDecimal("18.6");
	private static final BigDecimal normalHigh = new BigDecimal("24.9");
	private static final BigDecimal overweightLow = new BigDecimal("25");
	private static final BigDecimal overweightHigh = new BigDecimal("29.9");
	private static final BigDecimal obese = new BigDecimal("30");
	
	
	public String showResult(BigDecimal height, BigDecimal weight) {
		BigDecimal heightInMeter = height.divide(new BigDecimal(100));
		BigDecimal square = height.multiply(heightInMeter);
		BigDecimal bmi = weight.divide(square);
		String result = "";
		if (bmi.compareTo(below) < 0) {
			result = "Below weight";
		}else if (bmi.compareTo(normalLow) < 0 && bmi.compareTo(normalHigh) > 0 ) {
			result = "Normal";
		}else if (bmi.compareTo(overweightLow) < 0 && bmi.compareTo(overweightHigh) > 0) {
			result = "Overweight";
		}else if (bmi.compareTo(obese) > 0) {
			result = "Obese";
		}
		return result;
	}

}
