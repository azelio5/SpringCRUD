package com.anvar.crud.mvc.dao;

import com.anvar.crud.mvc.model.User;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.PersistenceUnit;
import java.util.List;


@Component
public class UserDaoImpl implements UserDao {


    @PersistenceContext(type = PersistenceContextType.EXTENDED)
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Override
    public void createUser(User user) {
        entityManager.persist(user);
        entityManager.flush();
    }

    @Override
    public void updateUser(User user) {

        entityManager.merge(user);
        entityManager.flush();
    }

    @Override
    public User readUser(long id) {
        return entityManager.find(User.class, id);
    }


    @Override
    public User deleteUser(long id) throws NullPointerException {
        User user = readUser(id);
//        if (null == user) {
//            throw new NullPointerException("User not found");
//        }
        entityManager.remove(user);
        entityManager.flush();
        return user;
    }
}