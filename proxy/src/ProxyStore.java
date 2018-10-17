public class ProxyStore implements Funtion {
	private Store store;
	@Override
	public void saleShoe() {
		
		if(store == null){
			store = new Store();
		}
		this.extractMoney();
		store.saleShoe();
	}
	public void extractMoney(){
		System.out.println("抽取差价");
	}
}
