
public class Estado extends Localidade {
	
	public Estado(String pais, String estado, String cidade) {
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
	
	public String toString() {
		return "Pais: " + getPais() + "\nEstado: " + getEstado();
	}

}
