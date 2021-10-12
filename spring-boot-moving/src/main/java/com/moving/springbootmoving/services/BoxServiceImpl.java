package com.moving.springbootmoving.services;

import com.moving.springbootmoving.models.Box;
import com.moving.springbootmoving.setviceinterface.IBoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BoxServiceImpl  implements IBoxService {

    @Autowired
    private IBoxService boxservice;


    @Override
    @Transactional(readOnly = true)
    public List<Box> findAll() {
        return (List<Box>) boxservice.findAll();
    }

    @Override
    @Transactional
    public void save(Box box) {
        boxservice.save(box);
    }

    @Override
    @Transactional(readOnly = true)
    public Box findById(Long id) {
        return boxservice.findById(id);
    }

    @Override
    @Transactional
    public void delete(Box box) {
        boxservice.delete(box);

    }
}
