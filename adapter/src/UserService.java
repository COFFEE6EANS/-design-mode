/**
 * Description:
 *
 * @author <a href="mailto:zhangmoujiang@zuozh.com">Moujiang.Zhang</a>
 * @Date Create on 2017/11/23
 * @since version1.0 Copyright 2015 ZZJR All Rights Reserved.
 */
public class UserService {
    private String userDao = "userDao";

    private String name = "zmj";
    /**
     * 添加用户
     */
    public   void register(){
        userDao.notifyAll();
    }

    /**
     * 登录
     */
    public void  login(){

    }
}
