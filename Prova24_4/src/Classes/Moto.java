package Classes;

public class Moto extends Automovel {
	
	boolean partidaEletrica;

	public Moto(String marca, int qtdRodas, String modelo, int velocidade, double potenciaDoMotor,boolean partidaEletrica) {
		super(marca, qtdRodas, modelo, velocidade, potenciaDoMotor);
		this.partidaEletrica = partidaEletrica;
	}
	
	
	
	public boolean isPartidaEletrica() {
		return this.partidaEletrica;
	}

	public void setPartidaEletrica(boolean partidaEletrica) {
		this.partidaEletrica = partidaEletrica;
	}


	

	public void imprimirInformacoes() {
		System.out.println("Marca: " + marca);
		System.out.println("Quantidade de Rodas: " + qtdRodas);
		System.out.println("Modelo: " + modelo);
		System.out.println("Velocidade Atual: " + velocidade);
		System.out.println("A partida é eletrica? : " + partidaEletrica);
		
		System.out.println("");
	}
	
}
