package com.moving.springbootmoving.setviceinterface;

import com.moving.springbootmoving.models.Van;

import java.util.List;

public interface IVanService {

    public List<Van> findAll();

    public void save(Van cliente);

    public Van findById(Long id);

    public void delete(Van cliente);
}
