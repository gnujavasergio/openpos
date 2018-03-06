/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.com.syscode.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Interfaz abstracta para ser implementado por todos los DAO.
 *
 * @param <DomainObject>
 * @param <PK>
 * @author Sergio Antonio Ochoa Martinez<gnu.java.sergio@gmail.com>
 */
public abstract interface GenericInterface<DomainObject, PK extends Serializable> {

    /**
     * Insert one instance.
     *
     * @param object T object.
     */
    int create(DomainObject object);

    /**
     * Update one instance.
     *
     * @param object T object.
     */
    int update(DomainObject object);

    /**
     * Remove one object.
     *
     * @param object PK id
     */
    int delete(DomainObject object);

    /**
     * @param id PK object.
     * @return T object.
     */
    DomainObject findById(DomainObject object);

    /**
     * @return List<T> Object list.
     */
    List<DomainObject> findAll();

    /**
     * @return List<T> Object list.
     */
    List<DomainObject> findPagination(int pagination);

    /**
     * Check if an element exist.
     *
     * @param paramPK PK object
     * @return boolean
     */
    boolean exists(PK paramPK);

    /**
     *
     * @return int the number of object.
     */
    int count();

}
