package Pacientes.src.com.company;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;


public class Paciente {
    String nome;
    String sobrenome;
    String historiaClinica;
    LocalDate dataInternacao;
    LocalDate dataAlta;


    Paciente(String nome, String sobrenome, String historiaClinica, LocalDate dataInternacao) throws DataInternacaoException {   LocalDate hoje= LocalDate.now();
        this.nome=nome;
        this.sobrenome=sobrenome;
        dataAlta=null;
        this.dataInternacao=dataInternacao;
    }

    public LocalDate getDataInternacao() {
        return dataInternacao;
    }

    public LocalDate getDataAlta() {
        return dataAlta;
    }

    public void darAlta(LocalDate dataAlta) throws DataAltaException {
        if (dataAlta.isAfter(dataInternacao))
            System.out.println("Ok");
        else
            throw new DataAltaException();
    }

    public void dataInternacao () throws DataInternacaoException {

        if (dataInternacao.isBefore(dataInternacao))
            System.out.println("Maravilha");
        else
            throw new DataInternacaoException();

    }


}
