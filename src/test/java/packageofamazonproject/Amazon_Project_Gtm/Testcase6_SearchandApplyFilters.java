package packageofamazonproject.Amazon_Project_Gtm;

import java.awt.AWTException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listner.class)

public class Testcase6_SearchandApplyFilters extends LaunchQuit {
	@Test
	public void login_search_filters() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {
		HomePage homepage = new HomePage(driver);
		homepage.hoverover(driver);
		homepage.signin();

		LoginPage loginpage = new LoginPage(driver);
		loginpage.un();
		loginpage.ctn();
		loginpage.pwd();
		loginpage.signbtn();
		homepage.searching();
		SearchResultPage searchresult = new SearchResultPage(driver);
		searchresult.deliveryday();
		//searchresult.shoesizeselect();
		searchresult.pricerange(driver);
		//searchresult.brandselect();

	}
}
