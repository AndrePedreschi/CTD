package Prova1;

public class HotelService {
    private IDao<Hotel> hotelIDao;

    public HotelService(IDao<Hotel> hotelIDao) {
        this.hotelIDao = hotelIDao;
    }

    public Hotel salvar(Hotel hotel){return hotelIDao.salvar(hotel);}

}
