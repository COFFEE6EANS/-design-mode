/**
 * 描述：设计者里管理工程队来进行建造房子
 * @author 张谋江
 * @version 1.0 2017年4月22日 
 * @since 1.0
 */
public class Designer {

public void designHouse(HouseBuilder houseBuilder){
	houseBuilder.makeFloor();
	houseBuilder.makeRoof();
	houseBuilder.makeWall();
}
}
