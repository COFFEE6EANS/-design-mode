public class CommonBuilder implements HouseBuilder{
	private House house = new House();
	@Override
	public void makeFloor() {
		house.setFloor("普通地板");
	}

	@Override
	public void makeRoof() {
		house.setRoof("普通房顶");
	}

	@Override
	public void makeWall() {
		house.setWall("普通墙壁");
	}
	/**
	 * 得到房子
	 * @return
	 */
	public House getHouse(){
		return house;
	}

}
