
public abstract class MalaPadrao {
	
	public Item[] item;
	
	public MalaPadrao(Item[] item) {
		this.item=item;
	}
	
	public void setItem(Item item, int i) {
		this.item[i] = item;
	}
	
	public Item getItem(int i) {
		return item[i];
	}

}
