package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomePage {
	
	    private WebDriver driver;
	    
	    // Web Elements on the Home page
	    private By welcomeMessage = By.id("welcome-message");
	    private By logoutButton = By.id("logout-button");
	    
	    public HomePage(WebDriver driver) {
	        this.driver = driver;
	    }
	    
	    public String getWelcomeMessage() {
	        return driver.findElement(welcomeMessage).getText();
	    }
	    
	    public void clickLogoutButton() {
	        driver.findElement(logoutButton).click();
	    }
	}



