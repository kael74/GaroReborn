/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ga.spring.hiber.dao;

import ga.spring.hiber.model.Persona;
import ga.spring.hiber.model.Venta;
import ga.spring.hiber.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.IdentifierLoadAccess;
import org.hibernate.Session;

/**
 *
 * @author rodrigo gutierrez
 */
public class VentaDAO implements OperacionTotal<Venta>{
    
    @Override
    public int create(Venta d) {
    
        Session session = HibernateUtil.getSessionFactory().openSession();
        int x = 0;
        try {
            session.getTransaction();
            session.merge(d);
            session.flush();
            session.getTransaction();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return x;
    }

    @Override
    public int update(Venta d) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        int x = 0;
        Venta v = new Venta();
        try {
            session.beginTransaction();
            session.update(d);
            session.getTransaction().commit();
            x = 1;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return x;
    }

    @Override
    public int delete(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        int x = 0;
        try {
            session.beginTransaction();
            Venta v = (Venta) session.get(Venta.class, id);
            session.delete(v);
            session.getTransaction().commit();
            x = 1;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return x;
    }

    @Override
    public List<Venta> readAll() {
        List<Venta> listavent = new ArrayList<>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            listavent = session.createCriteria(Persona.class).list();
            int count = listavent.size();
            session.getTransaction();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return listavent;
    }
    @Override
    public List<Venta> buscar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
