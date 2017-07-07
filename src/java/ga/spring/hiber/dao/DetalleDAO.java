/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ga.spring.hiber.dao;

import ga.spring.hiber.model.Detalle;
import ga.spring.hiber.model.Usuario;
import ga.spring.hiber.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Computer
 */
public class DetalleDAO implements OperacionTotal<Detalle>{

    @Override
    public int create(Detalle d) {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        int x = 0;
        try {
            session.beginTransaction();
            session.merge(d);
            session.flush();
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
    public int update(Detalle d) {
    
        int x = 0;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Detalle d1 = new Detalle();
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
        int x = 0;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            Detalle u = (Detalle) session.get(Detalle.class, id);
            session.delete(u);
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
    public List<Detalle> readAll() {
    
        List<Detalle> lista = new ArrayList<>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            lista = session.createCriteria(Usuario.class).list();
            int count = lista.size();
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return lista;
    }

    @Override
    public List<Detalle> buscar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
