package Pacientes.src.com.company;

public class DataInternacaoException extends Exception {

    public DataInternacaoException(){

        super("Data de internação errada, internação posterior a data presente.");
    }



}
