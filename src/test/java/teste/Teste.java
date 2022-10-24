package teste;

import org.junit.Test;

import elementos.Elementos;
import metodos.MetodoPage;

public class Teste {
	MetodoPage metodo = new MetodoPage();
	Elementos elemento = new Elementos();
	
	@Test
	public void test() {
		
		metodo.abrirNavegador("http://sampleapp.tricentis.com/101/app.php");
		//metodo.clicar(elemento.Make);
		metodo.clicar(elemento.Audi);
		//metodo.clicar(elemento.Model);
		metodo.clicar(elemento.Scooter);
		metodo.escrever(elemento.CylinderCapacity, "1.0");
		metodo.escrever(elemento.EnginePerformance, "500");
		metodo.escrever(elemento.DateOfManufacture, "07/18/2022");
		//metodo.clicar(elemento.NumberOfSeats);
		metodo.clicar(elemento.NumberOfSeatsFour);
		metodo.clicar(elemento.RightHandDrive);
		metodo.clicar(elemento.NumberOfSeatsTwo);
		metodo.clicar(elemento.FuelType);
		metodo.escrever(elemento.PayLoad, "300");
		metodo.escrever(elemento.TotalWeight, "400");
		metodo.escrever(elemento.ListPrice, "25000");
		metodo.escrever(elemento.LicensePlateNumber, "1A2B3398GH");
		metodo.escrever(elemento.AnnualMileage, "100000");
		metodo.clicar(elemento.NextInsurantData);
		metodo.escrever(elemento.FirstName, "Joao");
		
		
		
		
		//metodo.fecharNavegador();
		
	}
	
	
	
	}


