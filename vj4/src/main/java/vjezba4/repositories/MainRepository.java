package vjezba4.repositories;

import java.util.List;
public interface MainRepository <T> {
    public abstract List<T> getAll();
    public abstract T getById(Long x);
    public abstract void add(T d);
    public abstract void deleteById(Long x);
}

