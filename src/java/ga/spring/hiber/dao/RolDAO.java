/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ga.spring.hiber.dao;

import ga.spring.hiber.model.Rol;
import ga.spring.hiber.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author rodrigo gutierrez
 */
public class RolDAO implements OperacionTotal<Rol>{

    @Override
    public int create(Rol d) {
    
        Session session = HibernateUtil.getSessionFactory().openSession();
        int x = 0;
        try {
            session.beginTransaction();
            session.merge(d);
            session.flush();
            session.getTransaction().commit();
            x=1;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return x;
    }

    @Override
    public int update(Rol d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Rol> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Rol> buscar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
