import org.example.Pages.DiskPage;
import org.example.Pages.HomePage;
import org.example.Pages.LoginForm;
import org.example.Utils.CredentialsReader;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class YandexDiskTest extends BaseTest{

    @Test
    public void addFileTest() throws IOException, InterruptedException {
        HomePage homePage = new HomePage();
        LoginForm loginForm = new LoginForm();
        DiskPage diskPage = new DiskPage();

        homePage.clickLoginButton();
        loginForm.login(CredentialsReader.getUserData().getLogin());

        Thread.sleep(250);
    }
}
