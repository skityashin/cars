package com.levelup.dao.impl;

import com.levelup.dao.SportCarsDao;
import com.levelup.model.SportCars;
import com.levelup.util.HibernateUtil;
import org.hibernate.Session;
import java.sql.SQLException;

/**
 * Class {@link com.levelup.dao.impl.SportCarsDaoImpl}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 21.12.15
 */
public class SportCarsDaoImpl implements SportCarsDao {

    @Override
        public void saveSportCarsDao (SportCars sportCars)throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(sportCars);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

    }
}