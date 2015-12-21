package com.levelup.dao.impl;

import com.levelup.dao.TruckDao;
import com.levelup.model.Truck;
import com.levelup.util.HibernateUtil;
import org.hibernate.Session;
import java.sql.SQLException;

/**
 * Class {@link com.levelup.dao.impl.TruckDaoImpl}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 21.12.15
 */
public class TruckDaoImpl implements TruckDao{
    @Override
    public void saveTruckDao(Truck truck) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(truck);
            session.getTransaction().commit();
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            if(session != null && session.isOpen()){
                session.close();
            }
        }

    }
}
