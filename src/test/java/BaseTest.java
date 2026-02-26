import org.example.Driver.DriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;

import java.sql.Driver;

public abstract class BaseTest {

    @BeforeEach
    public void setUp(){
        DriverManager.getDriver().navigate().to("https://disk.yandex.ru/");
    }

    @AfterAll
    public static void tearDown(){
        DriverManager.closeDriver();
    }
}
