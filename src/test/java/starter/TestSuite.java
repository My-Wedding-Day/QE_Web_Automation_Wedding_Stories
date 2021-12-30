package starter;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/",
        tags = "@deletepackage"
)
public class TestSuite{
}

//As a User: @RegisterUser, @LoginUser , @ProfileUser , @CreateReservation , @listOrder , @paymentuser
//As a WO: @RegisterWO , @LoginWO , @addpackage ,  @updatestatusorder
//As a Admin: @adminApprove