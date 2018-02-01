package model;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class BmiCalculatorTest {
    private BmiCalculator bmiCalculator = new BmiCalculator();

    @Test

    public void showResultBelowWeight() {
        assertTrue(bmiCalculator.showResult(new BigDecimal(180), new BigDecimal(50)).equals("Below weight"));
    }

    @Test
    public void showResultNormal() {
       assertTrue(bmiCalculator.showResult(new BigDecimal(180), new BigDecimal(80)).equals("Normal"));
    }

    @Test
    public void showResultOverweight() {
        assertTrue(bmiCalculator.showResult(new BigDecimal(180), new BigDecimal(90)).equals("Overweight"));
    }

    @Test
    public void showResultObese() {
        assertTrue(bmiCalculator.showResult(new BigDecimal(180), new BigDecimal(100)).equals("Obese"));
    }
}