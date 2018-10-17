import application.IUserSerfaceAdapter;
import application.IUserService;

/**
 * Description:
 *
 * @author
 * @Date
 */
public class Client {
    public static void main(String[] args) {
        UserService userService = new UserService();
//        userService.login();
//        userService.register();
        /**
         * 由于项目需求的不断变更。
         */
        IUserService iUserService = new IUserSerfaceAdapter();
        iUserService.login();
        iUserService.register();
    }
}
