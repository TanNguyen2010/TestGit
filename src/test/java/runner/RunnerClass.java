package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        //plugin = {"",""}
        glue = "step",
        tags = "@TestCase02"

)
public class RunnerClass {

/*
    @BeforeClass
    public static void beforeSuite(){
        System.out.println("1.RunnerClass: Run before suite class here");
    }
    @AfterClass
    public static void afterSuite() {
        System.out.println("Final.RunnerClass: Run after suite class here+++++");
    }*/
}
