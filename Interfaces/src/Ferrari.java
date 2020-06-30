
public class Ferrari implements Carro, ItemCaro {  //Quando trabalha com Interface pode implementar varias interfaces a partir de uma 
												   // classe

	@Override
	public void virarEsquerda() {
		System.out.println("Ferrari Virou a esquerda");
	}

	@Override
	public void virarDireita() {
		System.out.println("Ferrari virou a direita");
	}

	@Override
	public void acelerar() {
		System.out.println("Ferrari Acelerou");
	}

	@Override
	public void abrirPorta() {
		System.out.println("Ferrari abriu a porta");
		
	}

	@Override
	public double getPreco() {
		
		return 1000000;
	}
	
}
