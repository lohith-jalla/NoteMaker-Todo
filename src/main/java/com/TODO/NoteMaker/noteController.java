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

    public noteController(Services s) {
        this.s = s;
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
    public String PostCreate(@RequestBody note note) {
        s.save(note);
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
    public String update(ModelMap map, @RequestParam int id){
        return "update";
    }

    @PostMapping("/update")
    public String Patchupdate(ModelMap map, @RequestParam Long id , @RequestParam String title, @RequestParam String content){
        boolean noteExist=s.exist(id);
        if(!noteExist) {
            map.put("error", "Note Not Exist");
            return "index";
        }else{
            note n=new note();
            n.setTitle(title);
            n.setContent(content);
            s.save(n);
            return "redirect:/AllNotes";
        }
    }

    //DeletePage ***********************************
    @GetMapping("/deleteById")
    public String deleteById(@RequestParam int id){
        return "delete";
    }

    @PostMapping("/deleteById")
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
