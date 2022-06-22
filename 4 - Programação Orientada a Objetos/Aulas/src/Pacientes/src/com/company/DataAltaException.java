package Pacientes.src.com.company;

public class DataAltaException extends Exception{

    public DataAltaException (){

        super("Data errada, data de alta anterior ao dia de internação");
    }
}
