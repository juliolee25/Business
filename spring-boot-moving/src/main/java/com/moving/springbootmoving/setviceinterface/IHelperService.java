package com.moving.springbootmoving.setviceinterface;

import com.moving.springbootmoving.models.Helper;

import java.util.List;

public interface IHelperService {

    public List<Helper> findAll();

    public void save(Helper cliente);

    public Helper findById(Long id);

    public void delete(Helper cliente);
}
