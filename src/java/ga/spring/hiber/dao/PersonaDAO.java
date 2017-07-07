/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ga.spring.hiber.dao;

import ga.spring.hiber.model.Persona;
import ga.spring.hiber.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author rodrigo gutierrez
 */
public class PersonaDAO implements OperacionTotal<Persona> {

    @Override
    public int create(Persona d) {
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
    public int update(Persona d) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        int x = 0;
        Persona p1 = new Persona();
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
            Persona p = (Persona) session.get(Persona.class, id);
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
    public List<Persona> readAll() {
        List<Persona> listaperson = new ArrayList<>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            listaperson = session.createCriteria(Persona.class).list();
            int count = listaperson.size();
            session.getTransaction();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return listaperson;
    }

    @Override
    public List<Persona> buscar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
