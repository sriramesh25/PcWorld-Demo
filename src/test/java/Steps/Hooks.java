package Steps;

import Base.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends BaseUtil{
    private BaseUtil base;

    public Hooks(BaseUtil base) {
        this.base = base;
    }


    @Before
    public void InitializeTest() {
        System.out.println("Opening the Web Browser");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
        base.Driver=new ChromeDriver();
    }

    @After
    public void TearDownTest(){
        System.out.println("Closing the Web Browser");
    }

}
