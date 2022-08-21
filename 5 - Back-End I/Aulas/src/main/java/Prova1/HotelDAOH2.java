package Prova1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class HotelDAOH2 implements IDao<Hotel>{
    private ConfiguracaoJDBC configuracaoJDBC;
    final static Logger log = Logger.getLogger(String.valueOf(HotelDAOH2.class.getName()));

    public HotelDAOH2(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Hotel salvar(Hotel hotel) {
        log.info("Registrando uma nova filial: "+hotel.toString());
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query=String.format("INSERT INTO hoteis(nomeFilial,rua,numero,cidade,estado,cincoEstrelas) VALUES('%s','%s','%s','%s','%s','%s')",
                hotel.getNomeFilial(), hotel.getRua(), hotel.getNumero(), hotel.getCidade(), hotel.getCidade(), hotel.isCincoEstrelas());
        try{
            statement = connection.createStatement();
            statement.executeUpdate(query,Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();
            if (keys.next()){
                hotel.setId(keys.getInt(1));
                statement.close();
                connection.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return hotel;
    }
}
