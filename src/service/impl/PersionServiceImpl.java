package service.impl;

import eneity.Persion;
import repository.PersionRepository;
import repository.impl.PersionRepostioryImpl;
import service.PersionService;

import java.util.List;

public class PersionServiceImpl implements PersionService {
    private PersionRepository persionRepository = new PersionRepostioryImpl();
    @Override
    public List<Persion> showall() {
        List<Persion> list = persionRepository.showall();
        return list;
    }
}
