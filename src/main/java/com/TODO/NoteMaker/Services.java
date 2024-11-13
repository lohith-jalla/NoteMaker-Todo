package com.TODO.NoteMaker;

import com.TODO.NoteMaker.model.note;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Services {

    noteRepository repo;

    public Services(noteRepository repo) {
        this.repo = repo;
    }

    public boolean exist(Long Id){
        Optional<note> n=repo.findById(Id);
        return n.isPresent();
    }

    public List<note> getAllNotes() {
        return repo.findAll();
    }

    public void save(note n){
        repo.save(n);
    }

    public void delete(Long Id){
        repo.deleteById(Id);
    }
}
