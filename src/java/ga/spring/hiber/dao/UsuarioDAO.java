/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ga.spring.hiber.dao;

import ga.spring.hiber.model.Usuario;
import ga.spring.hiber.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.input.KeyCode;
import org.hibernate.Session;

/**
 *
 * @author rodrigo gutierrez
 */
public class UsuarioDAO implements OperacionTotal<Usuario> {

    @Override
    public int create(Usuario d) {
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
    public int update(Usuario d) {
        int x = 0;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Usuario u1 = new Usuario();
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
            Usuario u = (Usuario) session.get(Usuario.class, id);
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
    public List<Usuario> readAll() {
        List<Usuario> lista = new ArrayList<>();
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
    public List<Usuario> buscar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
