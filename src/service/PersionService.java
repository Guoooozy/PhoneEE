package service;

import eneity.Persion;
import eneity.PersionIm;

import java.util.List;

public interface PersionService {
    public List<PersionIm> showall(String username);
    public void add(PersionIm persionIm);
    public void del(String name);
}
