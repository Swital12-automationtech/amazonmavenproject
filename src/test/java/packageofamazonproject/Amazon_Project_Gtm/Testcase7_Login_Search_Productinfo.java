package packageofamazonproject.Amazon_Project_Gtm;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listner.class)

public class Testcase7_Login_Search_Productinfo extends LaunchQuit
{
@Test(retryAnalyzer=IRetry_Logic.class)
public void login_search_productinformation() throws EncryptedDocumentException, IOException 
{
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
searchresult.productselection(driver);
ProductdetailPage productadd = new ProductdetailPage(driver);

productadd.review();
productadd.prodtitle();
productadd.price();
productadd.proddetail();
productadd.proddesc();

}
}