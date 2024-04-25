package Classes;

public class Bicicleta extends Veiculo {
	
	int numMarchas;
	boolean bagageiro;
	
	public Bicicleta(String marca, int qtdRodas, String modelo, int velocidade, int numMarchas, boolean bagageiro) {
		super(marca, qtdRodas, modelo, velocidade);
		this.numMarchas = numMarchas;
		this.bagageiro = bagageiro;
	}
	
	
	
	public int getNumMarchas() {
		return numMarchas;
	}
	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}

	
	
	public boolean isBagageiro() {
		return bagageiro;
	}
	public void setBagageiro(boolean bagageiro) {
		this.bagageiro = bagageiro;
	}
	
	public void imprimirInformacoes() {
		System.out.println("Marca: " + marca);
		System.out.println("Quantidade de Rodas: " + qtdRodas);
		System.out.println("Modelo: " + modelo);
		System.out.println("Velocidade Atual: " + velocidade);
		System.out.println("Numero de marchas: " + numMarchas);
		System.out.println("Tem bagageiro? " + bagageiro);
		
		System.out.println("");
	}
	
}
