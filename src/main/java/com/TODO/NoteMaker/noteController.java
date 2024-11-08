package com.TODO.NoteMaker;

import java.util.*;
import com.TODO.NoteMaker.model.note;
import org.springframework.web.bind.annotation.*;

@RestController
public class noteController {

    noteRepository repo;

    public noteController(noteRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/findById")
    public Optional<note> Home(@RequestParam Long id) {
        return repo.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody note n){
        repo.save(n);
    }

    @GetMapping("/All")
    public List<note> findAll(){
        return repo.findAll();
    }

    @DeleteMapping("/deleteById")
    public void deleteById(@RequestParam Long id){
        repo.deleteById(id);
    }

}
