package repository;

import com.mysql.cj.PingTarget;
import eneity.Persion;
import eneity.PersionIm;

import java.util.List;

public interface PersionRepository {
    public List<PersionIm> showall(String username);
    public void add(PersionIm persionIm);
    public void del(String name);
}
