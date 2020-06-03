package repository;

import eneity.Persion;

public interface LoginRepository {
    public Persion Login(String username,String password);
    public void Register(Persion persion);
}
