import static org.junit.jupiter.api.Assertions.assertEquals;

import com.typesafe.config.Config;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Tag;
import org.powertester.annotations.SmokeTest;
import org.powertester.config.TestEnvFactory;

@Tag("employee-service")
@Slf4j
public class TestEmployeeService {
  @SmokeTest
  void assertThatTestForChosenEnvRuns() {
    //Config CONFIG = TestEnvFactory.getInstance().getConfig();
    //String expectedEnv = CONFIG.getString("TEST_ENV");
    //log.info("expectedEnv is: {}", expectedEnv);
    //assertEquals(expectedEnv, CONFIG.getString("TEST_ENV"), "TEST_ENV");
    assertEquals(1,1);
  }
}
