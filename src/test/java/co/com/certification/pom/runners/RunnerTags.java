package co.com.certification.pom.runners;


import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features"
        , tags = "@HistoriaDeUsuario"
        , glue = "co.com.certification.pom.definition"
)

public class RunnerTags {


}
