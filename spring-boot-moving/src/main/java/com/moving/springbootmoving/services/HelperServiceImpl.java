package com.moving.springbootmoving.services;

import com.moving.springbootmoving.models.Box;
import com.moving.springbootmoving.models.Helper;
import com.moving.springbootmoving.setviceinterface.IBoxService;
import com.moving.springbootmoving.setviceinterface.IHelperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HelperServiceImpl implements IHelperService {

    @Autowired
    private IHelperService helperService;


    @Override
    @Transactional(readOnly = true)
    public List<Helper> findAll() {
        return (List<Helper>) helperService.findAll();
    }

    @Override
    @Transactional
    public void save(Helper helper) {
        helperService.save(helper);
    }

    @Override
    @Transactional(readOnly = true)
    public Helper findById(Long id) {
        return helperService.findById(id);
    }

    @Override
    @Transactional
    public void delete(Helper helper) {
        helperService.delete(helper);

    }
}
