package tasks;

import org.testng.annotations.Test;

public class TC_tasks_001_Test extends Base_Test{
	
	@Test(groups="smoke")
	public void test() {
      driver.get("http://demowebshop.tricentis.com/");
	
	
}
}