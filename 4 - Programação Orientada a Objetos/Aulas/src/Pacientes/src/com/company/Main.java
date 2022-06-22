package Pacientes.src.com.company;

import Pacientes.src.com.company.DataAltaException;
import Pacientes.src.com.company.DataInternacaoException;
import Pacientes.src.com.company.Paciente;

import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws DataInternacaoException {
        LocalDate local;
        Paciente paciente = new Paciente("Juan", "Perez", "12345", LocalDate.of(2021, 5, 10));


        try {
            paciente.darAlta(LocalDate.of(2021, 5, 10));

        } catch (DataInternacaoException | DataAltaException exception) {
            System.out.println(exception.getMessage());
        }
    }

}
