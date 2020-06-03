package service;

import eneity.Persion;

public interface LoginService {
    public Object Login(String username,String password);
    public void Register(Persion persion);
}
