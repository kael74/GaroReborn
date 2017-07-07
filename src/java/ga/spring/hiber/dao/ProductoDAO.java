/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ga.spring.hiber.dao;

import ga.spring.hiber.model.Persona;
import ga.spring.hiber.model.Producto;
import ga.spring.hiber.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author rodrigo gutierrez
 */
public class ProductoDAO implements OperacionTotal<Producto>{

    @Override
    public int create(Producto d) {
    
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
    public int update(Producto d) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        int x = 0;
        Producto p = new Producto();
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
            Producto p = (Producto) session.get(Producto.class, id);
            session.delete(p);
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
    public List<Producto> readAll() {
        List<Producto> listaproduc = new ArrayList<>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            listaproduc = session.createCriteria(Producto.class).list();
            int count = listaproduc.size();
            session.getTransaction();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return listaproduc;
    }

    @Override
    public List<Producto> buscar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Producto read(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Producto p = new Producto();
        try {
            session.beginTransaction();
            p = (Producto) session.get(Producto.class, id);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return p;
    }
}
