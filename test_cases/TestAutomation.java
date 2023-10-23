package test_cases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Set the path to the ChromeDriver executable
		        System.setProperty("webdriver.chrome.driver", "");
		        
		        // Create a WebDriver instance
		        WebDriver driver = new ChromeDriver();
		        
		        // Open the web application
		        driver.get("https://example.com/login");
		        
		        // Create instances of the Page Object classes
		        LoginPage loginPage = new LoginPage(driver);
		        HomePage homePage = new HomePage(driver);
		        
		        // Perform actions on the Login page
		        loginPage.enterUsername("yourUsername");
		        loginPage.enterPassword("yourPassword");
		        loginPage.clickLoginButton();
		        
		        // Perform actions on the Home page
		        String welcomeMessage = homePage.getWelcomeMessage();
		        System.out.println("Welcome Message: " + welcomeMessage);
		        homePage.clickLogoutButton();
		        
		        // Close the browser
		        driver.quit();
		    }
		}

	}

}
