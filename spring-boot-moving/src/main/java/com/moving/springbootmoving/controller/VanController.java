package com.moving.springbootmoving.controller;

import com.moving.springbootmoving.models.Box;
import com.moving.springbootmoving.models.Van;
import com.moving.springbootmoving.setviceinterface.IBoxService;
import com.moving.springbootmoving.setviceinterface.IVanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class VanController {

    @Autowired
    private IVanService vanService;

    @GetMapping("/van")
    public List<Van> index() {
        return vanService.findAll();
    }

    @GetMapping("/van/{id}")
    public Van show(@PathVariable Long id) {
        return this.vanService.findById(id);
    }

    @PostMapping("/van")
    @ResponseStatus(HttpStatus.CREATED)
    public Van create(@RequestBody Van van) {

        this.vanService.save(van);
        return van;
    }

    @DeleteMapping("/van/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        Van currentVan = this.vanService.findById(id);
        this.vanService.delete(currentVan);
    }

    @PutMapping("/van/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Van update(@RequestBody Van van, @PathVariable Long id) {
        Van currentVan = this.vanService.findById(id);

        currentVan.setName(van.getName());
        currentVan.setPrice(van.getPrice());
        currentVan.setHight(van.getHight());
        currentVan.setWith(van.getWith());
        currentVan.setDepth(van.getDepth());


        this.vanService.save(currentVan);
        return currentVan;
    }
}
