package com.levelup.dao;

import com.levelup.model.Truck;
import java.sql.SQLException;

/**
 * Class {@link com.levelup.dao.TruckDao}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 21.12.15
 */
public interface TruckDao {

    public void saveTruckDao (Truck truck) throws SQLException;
}
