package Classes;

public class Automovel extends Veiculo {
	
	double potenciaDoMotor;
	

	public Automovel(String marca, int qtdRodas, String modelo, int velocidade, double potenciaDoMotor) {
		super(marca, qtdRodas, modelo, velocidade);
		this.potenciaDoMotor = potenciaDoMotor;
	}
	
	
	
	
	public double getPotenciaDoMotor() {
		return potenciaDoMotor;
	}
	public void setPotenciaDoMotor(double potenciaDoMotor) {
		this.potenciaDoMotor = potenciaDoMotor;
	}

	

	public void imprimirInformacoes() {
		System.out.println("Marca: " + marca);
		System.out.println("Quantidade de Rodas: " + qtdRodas);
		System.out.println("Modelo: " + modelo);
		System.out.println("Velocidade Atual: " + velocidade);
		System.out.println("Potencia do Motor: " + potenciaDoMotor);
		
		System.out.println("");
	}
}
	
