package com.TODO.NoteMaker;

import java.util.*;
import com.TODO.NoteMaker.model.note;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class noteController {

    private final Services s;
    private note n;

    public noteController(Services s, note n) {
        this.s = s;
        this.n = n;
    }

    //HomePage ***********************************
    @GetMapping("/index")
    public String home(){
        return "index";
    }

    // Create Note Mapping ***********************
    @GetMapping("/create")
    public String createNote() {
        return "save";
    }

    @PostMapping("/create")
    public String PostCreate(@RequestParam String title,@RequestParam String content) {
        n.setTitle(title);
        n.setContent(content);
        s.save(n);
        return "redirect:/index";
    }

    //Display Page *********************************
    @GetMapping("/AllNotes")
    public String findAll(Model model){
        List<note> notes = s.getAllNotes();
        model.addAttribute("notes", notes);
        return "AllNotes";
    }

    //Update Page************************************
    @GetMapping("/update")
    public String update(){
        return "update";
    }

    @PostMapping("/update")
    public String Patchupdate(ModelMap map, @RequestParam Long id , @RequestParam String title, @RequestParam String content){
        boolean noteExist=s.exist(id);
        if(!noteExist) {
            map.put("error", "Note Not Exist");
            return "index";
        }else{
            note n=s.getById(id);
            n.setTitle(title);
            n.setContent(content);
            s.save(n);
            return "redirect:/AllNotes";
        }
    }

    //DeletePage ***********************************
    @GetMapping("/delete")
    public String deleteById(){
        return "delete";
    }

    @PostMapping("/delete")
    public String deleteById(ModelMap map,@RequestParam Long id){
        boolean noteExist=s.exist(id);
        if(!noteExist) {
            map.put("error`", "Note Not Exist");
            return "index";
        }
        else {
            s.delete(id);
            return "redirect:/AllNotes";
        }
    }
}
