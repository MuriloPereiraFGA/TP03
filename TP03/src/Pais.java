
public class Pais extends Localidade{
	
	public Pais(String pais,String estado, String cidade) {
		super(pais, estado, cidade);
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public String getPais() {
		return pais;
	}
	
	public String toString() {
		return "Pais: " + getPais();
	}

}
