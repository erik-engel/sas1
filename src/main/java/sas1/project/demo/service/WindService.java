package sas1.project.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sas1.project.demo.model.Wind;
import sas1.project.demo.repository.WindRepository;
import sas1.project.demo.util.IRepoServ;

import java.util.List;
@Service
public class WindService implements IRepoServ<Wind> {
    @Autowired
    WindRepository windRepository;


    @Override
    public Wind read(int id) {
        return windRepository.read(id);
    }

    @Override
    public List<Wind> readAll() {
        return windRepository.readAll();
    }

    @Override
    public boolean create(Wind wind) {
        return windRepository.create(wind);
    }

    @Override
    public boolean update(Wind wind) {
        return windRepository.update(wind);
    }

    @Override
    public boolean delete(int id) {
        return windRepository.delete(id);
    }
}
