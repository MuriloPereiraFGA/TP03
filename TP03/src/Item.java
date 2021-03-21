
public class Item {
	
	private String nome;
	private int quantidade;
	private boolean status;
	
	public Item(String nome, int quantidade, boolean status) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.status = status;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public boolean getStatus() {
		return status;
	}
	
	public String toString() {
		return (getStatus() == true)?"Item: " + getNome() + "\nQuantidade: " + getQuantidade() + "\nStatus: Encontra-se na mala.":"Item: " + getNome() + "\nQuantidade: " + getQuantidade() + "\nStatus: Encontra-se fora da mala.";
	}

}
