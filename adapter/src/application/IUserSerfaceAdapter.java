package application;

/**
 * Description:
 *
 * @author <a href="mailto:zhangmoujiang@zuozh.com">Moujiang.Zhang</a>
 * @Date Create on 2017/11/23
 * @since version1.0 Copyright 2015 ZZJR All Rights Reserved.
 */
public class IUserSerfaceAdapter implements IUserService {
    NewUserService newUserService = new NewUserService();
    @Override
    public void register() {
        newUserService.register();
    }

    @Override
    public void login() {
        newUserService.login();
    }
}
