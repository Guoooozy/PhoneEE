package service.impl;

import eneity.Persion;
import eneity.PersionIm;
import repository.PersionRepository;
import repository.impl.PersionRepostioryImpl;
import service.PersionService;

import java.util.List;

public class PersionServiceImpl implements PersionService {
    private PersionRepository persionRepository = new PersionRepostioryImpl();
    @Override
    public List<PersionIm> showall(String username) {
        List<PersionIm> list = persionRepository.showall(username);
        return list;
    }

    @Override
    public void add(PersionIm persionIm) {
        persionRepository.add(persionIm);
    }

    @Override
    public void del(String name) {
        persionRepository.del(name);
    }
}
