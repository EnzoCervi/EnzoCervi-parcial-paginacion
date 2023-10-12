package com.utn.utnApiRest.services;

import com.utn.utnApiRest.entities.Base;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;
import java.util.Locale;

//método y operaciones principales
public interface BaseService<E extends Base, ID extends Serializable> {
    //obtiene una lista de todas las entidades
    public List<E> findAll() throws Exception;
    public Page<E> findAll(Pageable pageable) throws Exception;
    //obtener persona que tiene dicho Id
    public E findById(ID id)  throws Exception;
    //crea entidad
    public E save(E entity) throws Exception;
    //
    public E update(ID id, E entity) throws Exception;
    //elimina registro de la entidad
    public boolean delete(ID id) throws Exception;
}
