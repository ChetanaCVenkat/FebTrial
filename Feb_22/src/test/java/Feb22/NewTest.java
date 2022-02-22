package Feb22;


import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {

		
	private static Logger log=LogManager.getLogger(NewTest.class);
	  @Test
	  public void setup() {
		  
		  System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//comment the above 2 lines and uncomment below 2 lines to use Chrome
			//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
			//WebDriver driver = new ChromeDriver();
	  	
			log.info("CHETANA");
			
	      String baseUrl = "http://demo.guru99.com/test/newtours/";
	      String expectedTitle = "Welcome: Mercury Touars";
	      String actualTitle = "";

	      // launch Fire fox and direct it to the Base URL
	      driver.get(baseUrl);

	      // get the actual value of the title
	      actualTitle = driver.getTitle();

	      /*
	       * compare the actual title of the page with the expected one and print
	       * the result as "Passed" or "Failed"
	       */
	      if (actualTitle.contentEquals(expectedTitle)){
	          System.out.println("Test Passed!");
	      } else {
	          System.out.println("Test Failed");
	      }
	  }
	}

