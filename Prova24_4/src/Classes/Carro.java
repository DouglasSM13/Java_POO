package Classes;

public class Carro extends Automovel {
		
		int qtdPortas;

		public Carro(String marca, int qtdRodas, String modelo, int velocidade, double potenciaDoMotor, int qtdPortas) {
			super(marca, qtdRodas, modelo, velocidade, potenciaDoMotor);
			this.qtdPortas = qtdPortas;
		}
		
		
		
		public int getQtdPortas() {
			return qtdPortas;
		}
		public void setQtdPortas(int qtdPortas) {
			this.qtdPortas = qtdPortas;
		}



		public void imprimirInformacoes() {
			System.out.println("Marca: " + marca);
			System.out.println("Quantidade de Rodas: " + qtdRodas);
			System.out.println("Modelo: " + modelo);
			System.out.println("Velocidade Atual: " + velocidade);
			System.out.println("Quantidade de portas: " + qtdPortas);
			
			System.out.println("");
		}
		

		
		
}
