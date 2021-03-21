import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		//Instancia de algumas localizacoes para testar o codigo
		Localidade loc1 = new Pais("Brasil", null, null);
		Localidade loc2 = new Estado("Brasil", "DF", null);
		Localidade loc3 = new Cidade("Brasil", "DF", "Taguatinga");
		
		//Array de itens
		Item[] itens = new Item[100];
		
		//Instancia de malas com algumas atributos ja
		Mala mala1 = new Mala(itens,"mala1", loc1, "passeio");
		Mala mala2 = new Mala(itens,"mala2", loc2, "trabalho");
		Mala mala3 = new Mala(itens, "mala3", loc3, "trabalho de faculdade");
		
		//Preenchendo o vetor de itens antes de cadastrar qualque item
		mala1.preencheVetorItem(itens);
		mala2.preencheVetorItem(itens);
		mala3.preencheVetorItem(itens);
		
		//Isntanciando itens
		Item item1 = new Item("lapis", 2, true);
		Item item2 = new Item("cachorro", 5, false);
		
		//Cadastrando itens
		mala1.cadastrarItem(item1, 0);
		mala1.cadastrarItem(item2, 1);
		
		mala1.buscarNomeItem("lapis", itens);
		System.out.println("\n");
		System.out.println(mala1.getItem(0).toString());
		System.out.println("\n");
		mala1.mostraMalaItens(itens);
		System.out.println("\n");
		mala1.mostraMala();
		System.out.println("\n");
		mala2.mostraMala();
		System.out.println("\n");
		mala3.mostraMala();

		
	}

}
