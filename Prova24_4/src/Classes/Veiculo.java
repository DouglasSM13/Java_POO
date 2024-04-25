package Classes;

public class Veiculo {
	
	String marca;
	int qtdRodas;
	String modelo;
	int velocidade;
	
	
	public Veiculo(String marca, int qtdRodas, String modelo, int velocidade) {
		super();
		this.marca = marca;
		this.qtdRodas = qtdRodas;
		this.modelo = modelo;
		this.velocidade = velocidade = 0;
	}
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}


	public int getQtdRodas() {
		return qtdRodas;
	}
	public void setQtdRodas(int qtdRodas) {
		this.qtdRodas = qtdRodas;
	}


	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	
	
	public void imprimirInformacoes() {
		System.out.println("Marca: " + marca);
		System.out.println("Quantidade de Rodas: " + qtdRodas);
		System.out.println("Modelo: " + modelo);
		System.out.println("Velocidade Atual: " + velocidade);
		
		System.out.println("");
	}
	
	
	
	public void acelerar(int acelero) {
		this.velocidade += acelero;
	}
	
	
	
	public void frear(int freio) {
		this.velocidade -= freio;
	}
	
	
}
