package com.TODO.NoteMaker;

import com.TODO.NoteMaker.model.note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface noteRepository extends JpaRepository<note, Long> {

    Optional<note> findById(Long id);

    @Query("select * from note")
    default List<note> findAll(String title) {
        return null;
    }

    void deleteById(Long id);

}
