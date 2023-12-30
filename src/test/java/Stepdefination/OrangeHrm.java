package Stepdefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHrm 
{
	
	WebDriver driver;
	String empid;
	
	@Given("^i open broswer with the url \"([^\"]*)\"$")
	public void i_open_broswer_with_the_url(String url) 
	{
		
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
		
		
	}

	@Then("^i should see login page$")
	public void i_should_see_login_page() 
	{
		
	if(driver.findElement(By.id("btnLogin")).isDisplayed())
	{
		System.out.println("system diplayes Login Page");
	}
		
	}

	@When("^i enter username as \"([^\"]*)\"$")
	public void i_enter_username_as(String username) 
	{
	
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		
	}

	@When("^i enter password as \"([^\"]*)\"$")
	public void i_enter_password_as(String pwd)
	{
		
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		
	}

	@When("^i click login$")
	public void i_click_login() 
	{
		
		driver.findElement(By.id("btnLogin")).click();
		
	}

	@Then("^i should see admin module$")
	public void i_should_see_admin_module() 
	{
	
		if(driver.findElement(By.linkText("Admin")).isDisplayed())
		{
			System.out.println("system displays admin module");
		}
		
	}

	@When("^i close browser$")
	public void i_close_browser()
	{
		
		driver.close();
	}

	@Then("^i should see erro mesage$")
	public void i_should_see_erro_mesage() 
	{
		
	String erro =	driver.findElement(By.id("spanMessage")).getText();
	   if(erro.toLowerCase().contains("invalid") || erro.toLowerCase().contains("empty"))
{
	
		System.out.println("erro message Displayed");   
		   
}
		
	}
	
	
	
	
	
	
	@When("^i goto new employee registration page$")
	public void i_goto_new_employee_registration_page() 
	{
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		
		
	}

	@And("^i enter user as \"([^\"]*)\"$")
	public void i_enter_user_as(String username) 
	{
	
	driver.findElement(By.name("firstName")).sendKeys(username);	
		
		
	}

	@And("^i enter pass as \"([^\"]*)\"$")
	public void i_enter_pass_as(String pwd) 
	{
		
		driver.findElement(By.id("lastName")).sendKeys(pwd);
	 empid =	driver.findElement(By.name("employeeId")).getAttribute("value");
		
		
	}

	@And("^i click save$")
	public void i_click_save()
	{
		driver.findElement(By.id("btnSave")).click();
		
		
	}

	@Then("^i should see registered employee in the employee list$")
	public void i_should_see_registered_employee_in_the_employee_list()
	{
		driver.findElement(By.linkText("Employee List")).click();
		driver.findElement(By.id("empsearch_id")).sendKeys(empid);
		driver.findElement(By.id("searchBtn")).click();
		
		
	WebElement table =	driver.findElement(By.id("resultTable"));
		
	List<WebElement>row =	table.findElements(By.tagName("tr"));
		
		for(int i=1;i<row.size();i++)
		{
			
	List<WebElement>cols = row.get(i).findElements(By.tagName("td"));
	    if(cols.get(1).getText().equals(empid))
	    {
	    	System.out.println("system display emp reg");
	    	
	    	
	    	
	    }
			
			
		}
		
		
		
		
	}

	@When("^i click logout$")
	public void i_click_logout()
	{
		
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		
	}


	
	
	

@When("^i goto new userr registration$")
public void i_goto_new_userr_registration() 
{
	
	driver.findElement(By.linkText("Admin")).click();
	driver.findElement(By.name("btnAdd")).click();
	
	
}

@When("^i enter user rolee  as \"([^\"]*)\"$")
public void i_enter_user_rolee_as(String role1) 
{
	
	Select role = new Select(driver.findElement(By.id("systemUser_userType")));
	role.selectByVisibleText(role1);
	
	
	
}

@When("^i enter employee id as \"([^\"]*)\"$")
public void i_enter_employee_id_as(String san) 
{
	
	
	driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(san);
	
	
}




@And("^i enter usernamee as \"([^\"]*)\"$")
public void i_enter_usernamee_as(String namee) 
{
	
	driver.findElement(By.id("systemUser_userName")).sendKeys(namee);
	
	
	
}

@And("^i enter passwordd as \"([^\"]*)\"$")
public void i_enter_passwordd_as(String pwd)
{
	driver.findElement(By.name("systemUser[password]")).sendKeys(pwd);
	
}

@And("^i enter confirmm password as \"([^\"]*)\"$")
public void i_enter_confirmm_password_as(String comfirm) 
{
	driver.findElement(By.name("systemUser[confirmPassword]")).sendKeys(comfirm);
}

@And("^i click savee$")
public void i_click_savee() 
{
	
	driver.findElement(By.name("btnSave")).click();
	
	
}

@Then("^i should see new registered id in user registration list$")
public void i_should_see_new_registered_id_in_user_registration_list() 
{
	
	
	
	
	
	
}


	
	
	
}	
	
	