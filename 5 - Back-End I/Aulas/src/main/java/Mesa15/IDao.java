package Mesa15;

public interface IDao <T>{
    public T salvar(T t);
    public T buscar(Integer id);
    public T excluir(Integer id);
}
