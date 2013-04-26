package de.laag.vagrant;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class VagrantTest {
	@Test
	public void vagrantUp() {
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://localhost:18080/demo");
		driver.findElement(By.linkText("Get Environment Info")).click();
		assertThat(driver.findElement(By.xpath("/html/body/center/h2"))
				.getText(), equalTo("System Environment"));
		driver.quit();
	}
}
