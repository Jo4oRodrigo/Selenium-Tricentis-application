package steps;

import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.MetodoPage;
import metodos.Utils;

public class FormularioSteps {

	MetodoPage metodo = new MetodoPage();
	Elementos elemento = new Elementos();

	@Given("que eu esteja no site automobile")
	public void que_eu_esteja_no_site_automobile() throws IOException {
		metodo.abrirNavegador("http://sampleapp.tricentis.com/101/app.php");
		metodo.print("que eu esteja no site automobile");
	}

	@Given("preencho enter vehicle data automobile")
	public void preencho_enter_vehicle_data() throws IOException {
		metodo.clicar(elemento.AutomobileInsurance);
		metodo.print("enter vehicle data automobile");
		metodo.clicar(elemento.Audi);
		metodo.escrever(elemento.EnginePerformance, "500");
		metodo.escrever(elemento.DateOfManufacture, "07/18/2022");
		metodo.clicar(elemento.NumberOfSeatsFour);
		metodo.clicar(elemento.FuelType);
		metodo.escrever(elemento.ListPrice, "25000");
		metodo.escrever(elemento.LicensePlateNumber, "1A2B3398GH");
		metodo.escrever(elemento.AnnualMileage, "100000");
		metodo.clicar(elemento.NextInsurantData);
		metodo.print("preencho enter vehicle data automobile");

	}

	@Given("preencho enter insurant data automobile")
	public void preencho_enter_insurant_data() throws IOException {
		metodo.validarTitle("Enter Insurant Data");
		metodo.escrever(elemento.FirstName, "Joao");
		metodo.escrever(elemento.LastName, "Santana");
		metodo.escrever(elemento.DateOfBirth, "12/06/1981");
		metodo.clicar(elemento.Gender);
		metodo.escrever(elemento.StreetAddress, "738, Quinze de Novembro Street");
		metodo.clicar(elemento.Country);
		metodo.escrever(elemento.ZipCode, "08840110");
		metodo.escrever(elemento.City, "Mogi das Cruzes");
		metodo.clicar(elemento.Occupation);
		metodo.clicar(elemento.Hobbies);
		metodo.escrever(elemento.WebSite, "joaosantana.com");
		metodo.clicar(elemento.NextEnterProductData);
		metodo.print("preencho enter insurant data automobile");

	}

	@Given("preencho enter product data automobile")
	public void preencho_enter_product_data() {
		metodo.validarTitle("Enter Product Data");
		metodo.escrever(elemento.StarDate, Utils.dataFutura(2, 1, 0));
		metodo.clicar(elemento.InsuranceSum);
		metodo.clicar(elemento.MeritRating);
		metodo.clicar(elemento.DamageInsurance);
		metodo.clicar(elemento.OptionalProducts);
		metodo.clicar(elemento.CourtesyCar);
		metodo.clicar(elemento.NextSelectPriceOption);

	}

	@Given("preencho select price option automobile")
	public void preencho_select_price_option() throws InterruptedException {
		metodo.validarTitle("Select Price Option");
		metodo.clicar(elemento.SelectPriceOption);
		Thread.sleep(2000);
		metodo.clicar(elemento.NextSendQuote);

	}

	@When("preencho send quote automobile")
	public void preencho_send_quote() {
		metodo.validarTitle("Send Quote");
		metodo.escrever(elemento.Email, "joao@gmail.com");
		metodo.escrever(elemento.Phone, "01198743216");
		metodo.escrever(elemento.Username, "joao.santana");
		metodo.escrever(elemento.Password, "Aa123456");
		metodo.escrever(elemento.ConfirmPassword, "Aa123456");
		metodo.escrever(elemento.Comments, "Test");
		metodo.clicar(elemento.Sendemail);

	}

	@Then("valido a mensagem de sucesso automobile")
	public void valido_a_mensagem_de_sucesso() throws InterruptedException {
		Thread.sleep(10000);
		metodo.validarMensagem(elemento.Sendemailsuccess, "Sending e-mail success!");
		metodo.fecharNavegador();
	}

	@Given("que eu esteja no site truck")
	public void que_eu_esteja_no_site() throws IOException {
		metodo.abrirNavegador("http://sampleapp.tricentis.com/101/app.php");
		metodo.print("home");
	}

	@Given("preencho enter vehicle data truck")
	public void preencho_enter_vehicle_data_truck() throws IOException {
		metodo.clicar(elemento.TruckInsurance);
		metodo.print("enter vehicle data truck");
		metodo.validarTitle("Enter Vehicle Data");
		metodo.clicar(elemento.Audi);
		metodo.escrever(elemento.EnginePerformance, "500");
		metodo.escrever(elemento.DateOfManufacture, "07/18/2022");
		metodo.clicar(elemento.NumberOfSeatsFour);
		metodo.clicar(elemento.FuelType);
		metodo.escrever(elemento.PayLoad, "300");
		metodo.escrever(elemento.TotalWeight, "400");
		metodo.escrever(elemento.ListPrice, "25000");
		metodo.escrever(elemento.LicensePlateNumber, "1A2B3398GH");
		metodo.escrever(elemento.AnnualMileage, "100000");
		metodo.clicar(elemento.NextInsurantData);

	}

	@Given("preencho enter insurant data truck")
	public void preencho_enter_insurant_data_truck() {
		metodo.validarTitle("Enter Insurant Data");
		metodo.escrever(elemento.FirstName, "Joao");
		metodo.escrever(elemento.LastName, "Santana");
		metodo.escrever(elemento.DateOfBirth, "12/06/1981");
		metodo.clicar(elemento.Gender);
		metodo.escrever(elemento.StreetAddress, "738, Quinze de Novembro Street");
		metodo.clicar(elemento.Country);
		metodo.escrever(elemento.ZipCode, "08840110");
		metodo.escrever(elemento.City, "Mogi das Cruzes");
		metodo.clicar(elemento.Occupation);
		metodo.clicar(elemento.Hobbies);
		metodo.escrever(elemento.WebSite, "joaosantana.com");
		metodo.clicar(elemento.NextEnterProductData);

	}

	@Given("preencho enter product data truck")
	public void preencho_enter_product_data_truck() {
		metodo.validarTitle("Enter Product Data");
		metodo.escrever(elemento.StarDate, Utils.dataFutura(2, 1, 0));
		metodo.clicar(elemento.InsuranceSum);
		metodo.clicar(elemento.DamageInsurance);
		metodo.clicar(elemento.OptionalProductsTruck);
		metodo.clicar(elemento.NextSelectPriceOption);

	}

	@Given("preencho select price option truck")
	public void preencho_select_price_option_truck() throws InterruptedException {
		metodo.validarTitle("Select Price Option");
		metodo.clicar(elemento.SelectPriceOption);
		Thread.sleep(2000);
		metodo.clicar(elemento.NextSendQuote);

	}

	@When("preencho send quote truck")
	public void preencho_send_quote_truck() {
		metodo.validarTitle("Send Quote");
		metodo.escrever(elemento.Email, "joao@gmail.com");
		metodo.escrever(elemento.Phone, "01198743216");
		metodo.escrever(elemento.Username, "joao.santana");
		metodo.escrever(elemento.Password, "Aa123456");
		metodo.escrever(elemento.ConfirmPassword, "Aa123456");
		metodo.escrever(elemento.Comments, "Test");
		metodo.clicar(elemento.Sendemail);

	}

	@Then("valido a mensagem de sucesso truck")
	public void valido_a_mensagem_de_sucesso_truck() throws InterruptedException {
		Thread.sleep(10000);
		metodo.validarMensagem(elemento.Sendemailsuccess, "Sending e-mail success!");
		metodo.fecharNavegador();

	}

	@Given("que eu esteja no site motorcycle")
	public void que_eu_esteja_no_site_motorcycle() throws IOException {
		metodo.abrirNavegador("http://sampleapp.tricentis.com/101/app.php");
		metodo.print("home");
	}

	@Given("preencho enter vehicle data motorcycle")
	public void preencho_enter_vehicle_data_motorcycle() throws IOException {
		metodo.clicar(elemento.MotorcycleInsurance);
		metodo.print("enter vehicle data motorcycle");
		metodo.validarTitle("Enter Vehicle Data");
		metodo.clicar(elemento.Audi);
		metodo.clicar(elemento.Scooter);
		metodo.escrever(elemento.CylinderCapacity, "1.0");
		metodo.escrever(elemento.EnginePerformance, "500");
		metodo.escrever(elemento.DateOfManufacture, "07/18/2022");
		metodo.clicar(elemento.NumberOfSeatsTwo);
		metodo.escrever(elemento.ListPrice, "25000");
		metodo.escrever(elemento.AnnualMileage, "100000");
		metodo.clicar(elemento.NextInsurantData);

	}

	@Given("preencho enter insurant data motorcycle")
	public void preencho_enter_insurant_data_motorcycle() {
		metodo.validarTitle("Enter Insurant Data");
		metodo.escrever(elemento.FirstName, "Joao");
		metodo.escrever(elemento.LastName, "Santana");
		metodo.escrever(elemento.DateOfBirth, "12/06/1981");
		metodo.clicar(elemento.Gender);
		metodo.escrever(elemento.StreetAddress, "738, Quinze de Novembro Street");
		metodo.clicar(elemento.Country);
		metodo.escrever(elemento.ZipCode, "08840110");
		metodo.escrever(elemento.City, "Mogi das Cruzes");
		metodo.clicar(elemento.Occupation);
		metodo.clicar(elemento.Hobbies);
		metodo.escrever(elemento.WebSite, "joaosantana.com");
		metodo.clicar(elemento.NextEnterProductData);
	}

	@Given("preencho enter product data motorcycle")
	public void preencho_enter_product_data_motorcycle() {
		metodo.validarTitle("Enter Product Data");
		metodo.escrever(elemento.StarDate, Utils.dataFutura(2, 1, 0));
		metodo.clicar(elemento.InsuranceSum);
		metodo.clicar(elemento.DamageInsurance);
		metodo.clicar(elemento.OptionalProductsMotorcycle);
		metodo.clicar(elemento.NextSelectPriceOption);

	}

	@Given("preencho select price option motorcycle")
	public void preencho_select_price_option_motorcycle() throws InterruptedException {
		metodo.validarTitle("Select Price Option");
		metodo.clicar(elemento.SelectPriceOption);
		Thread.sleep(2000);
		metodo.clicar(elemento.NextSendQuote);

	}

	@When("preencho send quote motorcycle")
	public void preencho_send_quote_motorcycle() {
		metodo.validarTitle("Send Quote");
		metodo.escrever(elemento.Email, "joao@gmail.com");
		metodo.escrever(elemento.Phone, "01198743216");
		metodo.escrever(elemento.Username, "joao.santana");
		metodo.escrever(elemento.Password, "Aa123456");
		metodo.escrever(elemento.ConfirmPassword, "Aa123456");
		metodo.escrever(elemento.Comments, "Test");
		metodo.clicar(elemento.Sendemail);

	}

	@Then("valido a mensagem de sucesso motorcycle")
	public void valido_a_mensagem_de_sucesso_motorcycle() throws InterruptedException {
		Thread.sleep(10000);
		metodo.validarMensagem(elemento.Sendemailsuccess, "Sending e-mail success!");
		metodo.fecharNavegador();
	}

	@Given("que eu esteja no site camper")
	public void que_eu_esteja_no_site_camper() throws IOException {
		metodo.abrirNavegador("http://sampleapp.tricentis.com/101/app.php");
		metodo.print("home");
	}

	@Given("preencho enter vehicle data camper")
	public void preencho_enter_vehicle_data_camper() throws IOException {
		metodo.clicar(elemento.CamperInsurance);
		metodo.print("enter vehicle data camper");
		metodo.validarTitle("Enter Vehicle Data");
		metodo.clicar(elemento.Audi);
		metodo.escrever(elemento.EnginePerformance, "500");
		metodo.escrever(elemento.DateOfManufacture, "07/18/2022");
		metodo.clicar(elemento.NumberOfSeatsFour);
		metodo.clicar(elemento.RightHandDriveCamper);
		metodo.clicar(elemento.FuelType);
		metodo.escrever(elemento.PayLoad, "300");
		metodo.escrever(elemento.TotalWeight, "400");
		metodo.escrever(elemento.ListPrice, "25000");
		metodo.escrever(elemento.LicensePlateNumber, "1A2B3398GH");
		metodo.escrever(elemento.AnnualMileage, "100000");
		metodo.clicar(elemento.NextInsurantData);

	}

	@Given("preencho enter insurant data camper")
	public void preencho_enter_insurant_data_camper() {
		metodo.validarTitle("Enter Insurant Data");
		metodo.escrever(elemento.FirstName, "Joao");
		metodo.escrever(elemento.LastName, "Santana");
		metodo.escrever(elemento.DateOfBirth, "12/06/1981");
		metodo.clicar(elemento.Gender);
		metodo.escrever(elemento.StreetAddress, "738, Quinze de Novembro Street");
		metodo.clicar(elemento.Country);
		metodo.escrever(elemento.ZipCode, "08840110");
		metodo.escrever(elemento.City, "Mogi das Cruzes");
		metodo.clicar(elemento.Occupation);
		metodo.clicar(elemento.Hobbies);
		metodo.escrever(elemento.WebSite, "joaosantana.com");
		metodo.clicar(elemento.NextEnterProductData);
	}

	@Given("preencho enter product data camper")
	public void preencho_enter_product_data_camper() {
		metodo.validarTitle("Enter Product Data");
		metodo.escrever(elemento.StarDate, Utils.dataFutura(2, 1, 0));
		metodo.clicar(elemento.InsuranceSum);
		metodo.clicar(elemento.DamageInsurance);
		metodo.clicar(elemento.OptionalProductsCamper);
		metodo.clicar(elemento.NextSelectPriceOption);

	}

	@Given("preencho select price option camper")
	public void preencho_select_price_option_camper() throws InterruptedException {
		metodo.validarTitle("Select Price Option");
		metodo.clicar(elemento.SelectPriceOption);
		Thread.sleep(2000);
		metodo.clicar(elemento.NextSendQuote);

	}

	@When("preencho send quote camper")
	public void preencho_send_quote_camper() {
		metodo.validarTitle("Send Quote");
		metodo.escrever(elemento.Email, "joao@gmail.com");
		metodo.escrever(elemento.Phone, "01198743216");
		metodo.escrever(elemento.Username, "joao.santana");
		metodo.escrever(elemento.Password, "Aa123456");
		metodo.escrever(elemento.ConfirmPassword, "Aa123456");
		metodo.escrever(elemento.Comments, "Test");
		metodo.clicar(elemento.Sendemail);

	}

	@Then("valido a mensagem de sucesso camper")
	public void valido_a_mensagem_de_sucesso_camper() throws InterruptedException {
		Thread.sleep(10000);
		metodo.validarMensagem(elemento.Sendemailsuccess, "Sending e-mail success!");
		metodo.fecharNavegador();
	}

}
