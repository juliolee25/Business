package com.moving.springbootmoving.services;

import com.moving.springbootmoving.models.Box;
import com.moving.springbootmoving.models.Van;
import com.moving.springbootmoving.setviceinterface.IBoxService;
import com.moving.springbootmoving.setviceinterface.IVanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VanServiceImpl implements IVanService {


    @Autowired
    private IVanService vanService;


    @Override
    @Transactional(readOnly = true)
    public List<Van> findAll() {
        return (List<Van>) vanService.findAll();
    }

    @Override
    @Transactional
    public void save(Van van) {
        vanService.save(van);
    }

    @Override
    @Transactional(readOnly = true)
    public Van findById(Long id) {
        return vanService.findById(id);
    }

    @Override
    @Transactional
    public void delete(Van van) {
        vanService.delete(van);

    }
}
