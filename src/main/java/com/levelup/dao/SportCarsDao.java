package com.levelup.dao;

import com.levelup.model.SportCars;
import java.sql.SQLException;

/**
 * Class {@link com.levelup.dao.SportCarsDao}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 21.12.15
 */
public interface SportCarsDao {
    public void saveSportCarsDao (SportCars sportCars) throws SQLException;
}
