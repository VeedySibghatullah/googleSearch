package googleSearch;

public class xplorGoogle {

	public static void main(String[] args) {
	
				// I have to set my property using System.setProperty
				      System.setProperty("webdriver.chrome.driver","Path of my chrome driver in my local machin");
				      WebDriver driver = new ChromeDriver(); 
					  
				// now I have to launch google 	 
				      driver.get("https://www.google.com/");
					  drive().manage.window().maximize();
					  Thread.sleep(5000);
				// in this step I will locate my WebElement 
				      WebElement searchDuck=driver.findElement(By.Name('search'));
				      searchDuck.sendKeys("Duck");
					  
				// now user click on search
					  WebElement clickSearchBTN=driver.findElement(By.XPATH(//button[@type='submit']));
					  clickSearchBTN.click();
				      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

					  
				//once I completed the test I will close the page
				      driver.close();
				   }
				}
	}

}
