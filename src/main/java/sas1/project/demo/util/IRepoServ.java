package sas1.project.demo.util;

import java.util.List;

public interface IRepoServ<T> {

    public T read(int id);

    public List<T> readAll();

    public T create (T t);

    public boolean update (T t);

    public boolean delete (int id);

}
