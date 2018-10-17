public class MediumBuiler implements HouseBuilder {
	private House house = new House();
	@Override
	public void makeFloor() {
		house.setFloor("中等地板");
	}

	@Override
	public void makeRoof() {
		house.setRoof("中等房顶");
	}

	@Override
	public void makeWall() {
		house.setWall("中等墙");
	}

	@Override
	public House getHouse() {
		return house;
	}

}
