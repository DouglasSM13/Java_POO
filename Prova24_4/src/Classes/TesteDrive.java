package Classes;

public class TesteDrive {

	public static void main(String[] args) {
		
		Veiculo v1 = new Veiculo("HONDA ", 4, "- Civic", 70);
		v1.acelerar(70);
		v1.imprimirInformacoes();
		
		Bicicleta b1 = new Bicicleta("CALOI", 2, "BMX", 40, 12, false);
		b1.acelerar(40);
		b1.imprimirInformacoes();
		
		Automovel teste = new Automovel("TESTE", 8, "Truck", 90, 8);
		teste.acelerar(90);
		teste.imprimirInformacoes();
		
		Carro c1 = new Carro("Peugeot", 4, "Expert", 80, 4, 4);
		c1.acelerar(80);
		c1.imprimirInformacoes();
		
		Moto m1 = new Moto("Yamaha", 2, "XJ 6", 150, 9, true);
		m1.acelerar(150);
		m1.imprimirInformacoes();
		
		
		}
	}
	

