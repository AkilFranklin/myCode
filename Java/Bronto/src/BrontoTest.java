
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class BrontoTest extends Common{

    @Before
    public void setUp() throws Exception {
        Common.driver = new ChromeDriver();
        driver.get(getUrl());
    }

    @Test
    public void CalculatorTest() throws InterruptedException {
        setInput_LoanAmount("200000");
        setInput_Interest("5.000");
        setInput_LoanLength("30");
        setInput_HomeValue("235000");
        click(".//a[@class = 'calculator-button next-button']");

        setInput_PropertyTaxes("2000");
        setInput_Insurance("1865");
        setInput_PMI("0.52");
        click(".//a[text() = 'Show Results']");
        assertEquals(getData_PrincipalAndInterest(), "$1,073.64");
        assertEquals(getData_LoanToValue(), "85.11%");
        assertEquals(getData_MonthlyPayments(), "$1,482.39");
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}