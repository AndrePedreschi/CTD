package Aula14_DAO_Pattern;

public interface IDao <T>{
    public T salvar(T t);
    public T  buscar(Integer id);
}
