
public class Mala extends MalaPadrao{
	
	private String nome,tipoDeViagem;
	private Localidade destino;
	
	public Mala(Item[] item, String nome, Localidade destino, String tipoDeViagem) {
		super(item);
		this.nome = nome;
		this.destino = destino;
		this.tipoDeViagem = tipoDeViagem;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setDestino(Localidade destino) {
		this.destino = destino;
	}
	
	public Localidade getDestino() {
		return destino;
	}
	
	public void setTipoDeViagem(String tipoDeViagem) {
		this.tipoDeViagem = tipoDeViagem;
	}
	
	public String getTipoDeViagem() {
		return tipoDeViagem;
	}
	
	//Cadastra um item no vetor de itens
	public void cadastrarItem(Item item, int i) {
		this.item[i] = item;
	}
	
	public Item getItem(int i) {
		return item[i];
	}
	
	public Item[] getArrayItens(Item[] itens) {
		return itens;
	}
	
	//Procura saber se ja tem um item em especifico
	public void buscarNomeItem(String nomeProcurado, Item[] itens) {
		int jaTem=0;
		for(int i = 0; i < itens.length; i++) {
			if(itens[i].getNome().equalsIgnoreCase(nomeProcurado)){
				jaTem=1;
			}
		}
		if(jaTem==1) {
			System.out.println("Esse item ja esta na mala!");
		}else {
			System.out.println("Esse item nao esta na mala!");
		}
	}
	
	//Preenche o vetor itens antes de qualquer cadastro de item
	public void preencheVetorItem(Item[] itens) {
		for(int i =0; i < itens.length; i++) {
			Item item = new Item("vazio", 0, false);
			itens[i] = item;
		}
	}
	
	//Mostra os atributos da mala
	public void mostraMala() {
		System.out.println("Nome da Mala: " + getNome() + "\nDestino: " + destino.toString() + "\nTipo de Viagem: " + getTipoDeViagem());
	}
	
	//Mostra os itens cadastrados em uma mala de uma especifico
	public void mostraMalaItens(Item[] itens) {
		for(int i = 0; i < itens.length; i++) {
			if(!itens[i].getNome().equalsIgnoreCase("vazio")) {
				System.out.println(itens[i].toString());
			}
		}
	}

	
	
}
