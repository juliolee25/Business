package com.moving.springbootmoving.controller;

import com.moving.springbootmoving.models.Box;
import com.moving.springbootmoving.setviceinterface.IBoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class BoxController {

    @Autowired
    private IBoxService boxService;

    @GetMapping("/box")
    public List<Box> index() {
        return boxService.findAll();
    }

    @GetMapping("/box/{id}")
    public Box show(@PathVariable Long id) {
        return this.boxService.findById(id);
    }

    @PostMapping("/box")
    @ResponseStatus(HttpStatus.CREATED)
    public Box create(@RequestBody Box box) {

        this.boxService.save(box);
        return box;
    }

    @DeleteMapping("/box/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        Box currentBox = this.boxService.findById(id);
        this.boxService.delete(currentBox);
    }

    @PutMapping("/box/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Box update(@RequestBody Box box, @PathVariable Long id) {
        Box currentBox = this.boxService.findById(id);

        currentBox.setName(box.getName());
        currentBox.setPrice(box.getPrice());
        currentBox.setHight(box.getHight());
        currentBox.setWith(box.getWith());
        currentBox.setDepth(box.getDepth());
        currentBox.setPacking(box.getPacking());

        this.boxService.save(currentBox);
        return currentBox;
    }
}
