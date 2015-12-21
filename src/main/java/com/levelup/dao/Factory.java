package com.levelup.dao;

import com.levelup.dao.impl.PassengerCarDaoImpl;
import com.levelup.dao.impl.SportCarsDaoImpl;
import com.levelup.dao.impl.TruckDaoImpl;

/**
 * Class {@link com.levelup.dao.Factory}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 21.12.15
 */
public class Factory {
    private static Factory instance = null;
    private static TruckDao truckDao = null;
    private static SportCarsDao sportCarsDao = null;
    private static PassengerCarDao passengerCarDao = null;




    public static synchronized Factory getInstance(){
        if (instance == null){
            instance = new Factory();
        }
        return instance;
    }

    public TruckDao getTruckDao(){
        if (truckDao == null){
            truckDao = new TruckDaoImpl();
        }
        return truckDao;
    }

    public SportCarsDao getSportCarsDao(){
        if (sportCarsDao == null){
            sportCarsDao = new SportCarsDaoImpl();
        }
        return sportCarsDao;
    }

    public PassengerCarDao getPassengerCarDao(){
        if (passengerCarDao == null){
            passengerCarDao = new PassengerCarDaoImpl();
        }
        return passengerCarDao;
    }
}
