import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.Test;

public class test1 {


    @Test
    public static void printHello(){
        ExtentHtmlReporter htmlreporter =new ExtentHtmlReporter("testngreport.html");
        ExtentReports report =new ExtentReports();
        report.attachReporter(htmlreporter);
        ExtentTest test= report.createTest("this ia test","just a dummy report");
        test.log(Status.INFO,"nice duty");
        System.out.print("hello world");
        System.out.println("second world");
        test.pass("this is passed and printed hello world");
        report.flush();
    }
}
