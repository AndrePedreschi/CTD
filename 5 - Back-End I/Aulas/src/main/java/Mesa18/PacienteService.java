package Mesa18;

public class PacienteService {
    private IDao<Paciente> pacienteIDao;
    public PacienteService(IDao<Paciente> pacienteIDao){
        this.pacienteIDao = pacienteIDao;
    }

    public Paciente salvar(Paciente paciente){
        return pacienteIDao.salvar(paciente);
    }

    public Paciente buscar(Integer id){
        return pacienteIDao.buscar(id);
    }
    public Paciente excluir(Integer id){ return pacienteIDao.excluir(id); }
}
