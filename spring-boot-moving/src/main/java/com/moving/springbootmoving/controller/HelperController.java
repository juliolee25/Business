package com.moving.springbootmoving.controller;

import com.moving.springbootmoving.models.Box;
import com.moving.springbootmoving.models.Helper;
import com.moving.springbootmoving.setviceinterface.IBoxService;
import com.moving.springbootmoving.setviceinterface.IHelperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class HelperController {

    @Autowired
    private IHelperService helperService;

    @GetMapping("/box")
    public List<Helper> index() {
        return helperService.findAll();
    }

    @GetMapping("/box/{id}")
    public Helper show(@PathVariable Long id) {
        return this.helperService.findById(id);
    }

    @PostMapping("/box")
    @ResponseStatus(HttpStatus.CREATED)
    public Helper create(@RequestBody Helper helper) {

        this.helperService.save(helper);
        return helper;
    }

    @DeleteMapping("/box/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        Helper currentHelper = this.helperService.findById(id);
        this.helperService.delete(currentHelper);
    }

    @PutMapping("/box/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Helper update(@RequestBody Helper helper, @PathVariable Long id) {
        Helper currentHelper = this.helperService.findById(id);

        currentHelper.setName(helper.getName());
        currentHelper.setPrice(helper.getPrice());
        currentHelper.setDescription(helper.getDescription());
        currentHelper.setCantidad(helper.getCantidad());


        this.helperService.save(currentHelper);
        return currentHelper;
    }
}
