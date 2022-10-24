package elementos;

import org.openqa.selenium.By;


public class Elementos {
	public By Make = By.id("make");
	public By Audi = By.xpath("//*[@id=\"make\"]/option[2]");
	public By Model = By.id("model");
	public By Scooter = By.xpath("//*[@id=\"model\"]/option[2]");
	public By CylinderCapacity = By.id("cylindercapacity");
	public By EnginePerformance = By.id("engineperformance");
	public By DateOfManufacture = By.id("dateofmanufacture");
	public By NumberOfSeats = By.id("numberofseats");
	public By NumberOfSeatsFour = By.xpath("//*[@id=\"numberofseats\"]/option[5]");
	public By RightHandDrive = By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[2]/span");
	public By NumberOfSeatsTwo = By.xpath("//*[@id=\"numberofseatsmotorcycle\"]/option[3]");
	public By FuelType = By.xpath("//*[@id=\"fuel\"]/option[4]");
	public By PayLoad = By.id("payload");
	public By TotalWeight = By.id("totalweight");
	public By ListPrice = By.id("listprice");
	public By LicensePlateNumber = By.id("licenseplatenumber");
	public By AnnualMileage = By.id("annualmileage");
	public By NextInsurantData = By.id("nextenterinsurantdata");
	public By FirstName = By.id("firstname");
	public By LastName = By.id("lastname");
	public By DateOfBirth = By.id("birthdate");
	public By Gender = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span");
	public By StreetAddress = By.id("streetaddress");
	public By Country = By.xpath("//*[@id=\"country\"]/option[32]");
	public By ZipCode = By.id("zipcode");
	public By City = By.id("city");
	public By Occupation = By.xpath("//*[@id=\"occupation\"]/option[4]");
	public By Hobbies = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[4]/span");
	public By WebSite = By.id("website");
	public By NextEnterProductData = By.id("nextenterproductdata");
	public By StarDate = By.id("startdate");
	public By InsuranceSum = By.xpath("//*[@id=\"insurancesum\"]/option[3]");
	public By MeritRating = By.xpath("//*[@id=\"meritrating\"]/option[5]");
	public By DamageInsurance = By.xpath("//*[@id=\"damageinsurance\"]/option[4]");
	public By OptionalProducts = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]");
	public By CourtesyCar = By.xpath("//*[@id=\"courtesycar\"]/option[3]");
	public By NextSelectPriceOption = By.xpath("//*[@id=\"nextselectpriceoption\"]");
	public By SelectPriceOption = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]/span");
	public By NextSendQuote = By.id("nextsendquote");
	public By Email = By.id("email");
	public By Phone = By.id("phone");
	public By Username = By.id("username");
	public By Password = By.id("password");
	public By ConfirmPassword = By.id("confirmpassword");
	public By Comments = By.id("Comments");
	public By Sendemail = By.id("sendemail");
	public By Sendemailsuccess = By.xpath("/html/body/div[4]/h2");
}
