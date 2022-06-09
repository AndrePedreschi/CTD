package Checkpoint01;

import java.time.ZonedDateTime;
import java.util.Date;

public class Coordenadores extends Funcionarios{

    private String modalidade;
    private Date aula;

    public Coordenadores(String nome, Double salario, String modalidade) {
        super(nome, salario);

        this.modalidade = modalidade;

    }

    public Date darAula(Date aula){
        return this.aula ;
    };

}
