package Aula14_DAO_Pattern;

public class MedicamentoService {
    private IDao<Medicamento> medicamentoIDao;

    public MedicamentoService(IDao<Medicamento> medicamentoIDao){
        this.medicamentoIDao = medicamentoIDao;

    }
    public Medicamento salvar(Medicamento medicamento){
        return medicamentoIDao.salvar(medicamento);
    }
    public Medicamento buscar(Integer id){
        return medicamentoIDao.buscar(id);
    }
}
