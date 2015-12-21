package com.levelup.dao.impl;

import com.levelup.dao.PassengerCarDao;
import com.levelup.model.PassengerCar;
import com.levelup.util.HibernateUtil;
import org.hibernate.Session;
import java.sql.SQLException;

/**
 * Class {@link com.levelup.dao.impl.PassengerCarDaoImpl}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 21.12.15
 */
public class PassengerCarDaoImpl implements PassengerCarDao{
    @Override
    public void savePassengerCarDao (PassengerCar passengerCar)throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(passengerCar);
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