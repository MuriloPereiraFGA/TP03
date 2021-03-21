
public class Cidade extends Localidade{
	
	public Cidade(String pais, String estado, String cidade) {
		super(pais, estado, cidade);
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public String getPais() {
		return pais;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCidade() {
		return cidade;
	}
	
	public String toString() {
		return "Pais: " + getPais() + "\nEstado: " + getEstado() + "\nCidade: " + getCidade();
	}

}
