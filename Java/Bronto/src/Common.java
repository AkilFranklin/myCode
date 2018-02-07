import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common {
    public static WebDriver driver;
    private String url = "https://www.mortgageloan.com/calculator";

    private String input_LoanAmount =  ".//*[@id='calculator_widget_amount']";
    private String input_Interest = ".//*[@id='calculator_widget_interest']";
    private String input_LoanLength = ".//*[@id='calculator_widget_Length']";
    private String input_HomeValue = ".//*[@id='calculator_widget_HomeValue']";
    private String input_PropertyTaxes = ".//*[@id='calculator_widget_PropertyTaxes']";
    private String input_Insurance = ".//*[@id='calculator_widget_Insurance']";
    private String input_PMI = ".//*[@id='calculator_widget_PMI']";

    private String button_Next = ".//a[@class = 'calculator-button next-button']";
    private String button_ShowResults = ".//a[text() = 'Show Results']";

    private String data_PrincipalAndInterest = ".//th[text() = 'Monthly Principal & Interests']/following-sibling::td";
    private String data_LoanToValue = ".//th[text() = 'Loan To Value Ratio']/following-sibling::td";
    private String data_MonthlyPayments = ".//th[text() = 'Total Monthly Payments']/following-sibling::td";

    public void wait(String element) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
    }
    public void click(String element) {
        wait(element);
        driver.findElement(By.xpath(element)).click();
    }

    public void clearAndSendText(String element, String text) {
        wait(element);
        driver.findElement(By.xpath(element)).clear();
        driver.findElement(By.xpath(element)).sendKeys(text);
    }

    public String getData_PrincipalAndInterest() {
        wait(this.data_PrincipalAndInterest);
        String text = driver.findElement(By.xpath(this.data_PrincipalAndInterest)).getText();
        return text;
    }

    public String getData_LoanToValue() {
        wait(this.data_LoanToValue);
        String text = driver.findElement(By.xpath(this.data_LoanToValue)).getText();
        return text;
    }

    public String getData_MonthlyPayments() {
        wait(this.data_MonthlyPayments);
        String text = driver.findElement(By.xpath(this.data_MonthlyPayments)).getText();
        return text;
    }

    public String getUrl() {
        return url;
    }

    public void setInput_LoanAmount(String text) {
        this.clearAndSendText(this.input_LoanAmount, text);
    }

    public void setInput_Interest(String text) {
        this.clearAndSendText(this.input_Interest, text);
    }

    public void setInput_LoanLength(String text) {
        this.clearAndSendText(this.input_LoanLength, text);
    }

    public void setInput_HomeValue(String text) {
        this.clearAndSendText(this.input_HomeValue, text);
    }

    public void setInput_PropertyTaxes(String text) {
        this.clearAndSendText(this.input_PropertyTaxes, text);
    }

    public void setInput_Insurance(String text) {
        this.clearAndSendText(this.input_Insurance, text);
    }

    public void setInput_PMI(String text) {
        this.clearAndSendText(this.input_PMI, text);
    }
}
