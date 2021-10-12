package com.moving.springbootmoving.setviceinterface;

import com.moving.springbootmoving.models.Box;

import java.util.List;

public interface IBoxService {

    public List<Box> findAll();

    public void save(Box cliente);

    public Box findById(Long id);

    public void delete(Box cliente);
}
