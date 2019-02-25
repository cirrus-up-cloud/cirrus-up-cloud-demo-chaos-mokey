package cloud.cirrusup.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@Configuration
@ImportResource(locations = "classpath:spring-config/applicationContext.xml")
@PropertySource("classpath:properties/config-${spring.profiles.active}.properties")
public class CirrusCloudDemoController {

    private final Random random = new Random();

    @Value("${default.text}")
    private String message;

    private static final Logger LOG = LoggerFactory.getLogger(CirrusCloudDemoController.class);

    @GetMapping("/sum")
    public String sum() {

        LOG.info("GET /sum request.");
        long start = System.currentTimeMillis();
        int number = random.nextInt(20000000);
        long sum = 0;
        for (int index = 0; index < number; index++) {

            sum += index;
        }
        long took = System.currentTimeMillis() - start;
        return "Hello! " + message + ". Sum of first " + number + " numbers is:  " + sum + ". Took: " + took;
    }
}
