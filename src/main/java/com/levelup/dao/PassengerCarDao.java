package com.levelup.dao;

import com.levelup.model.PassengerCar;
import java.sql.SQLException;

/**
 * Class {@link com.levelup.dao.PassengerCarDao}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 21.12.15
 */
public interface PassengerCarDao {
    public void savePassengerCarDao (PassengerCar passengerCar) throws SQLException;
}
