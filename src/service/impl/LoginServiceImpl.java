package service.impl;

import repository.LoginRepository;
import repository.impl.LoginRepositoryImpl;
import service.LoginService;


public class LoginServiceImpl implements LoginService {
    LoginRepository loginRepository = new LoginRepositoryImpl();
    @Override
    public Object Login(String username, String password) {
        Object object = null;
        object = (Object) loginRepository.Login(username,password);
        return object;
    }
}
