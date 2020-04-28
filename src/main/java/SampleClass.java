import com.mashape.unirest.http.Unirest;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;


//http://www.testautomationguru.com/selenium-webdriver-how-to-automatically-skip-tests-based-on-open-defects/
@Listeners(MethodIssueStatusListener.class)
public class SampleClass {


    @Issue("JRA-9")
    @Test
    public void launchGooglePage()
    {

    }
}
