
public class Localidade {
	
	public String pais;
	public String estado;
	public String cidade;
	
	public Localidade(String pais, String estado, String cidade) {
		this.pais = pais;
		this.estado = estado;
		this.cidade = cidade;
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

}
