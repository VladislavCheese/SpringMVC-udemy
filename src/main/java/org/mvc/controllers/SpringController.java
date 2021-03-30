package org.mvc.controllers;

import org.mvc.entity.PeopleEntity;
import org.mvc.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class SpringController {

    private PeopleService peopleService;

    @Autowired
    public void setPeopleService(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @RequestMapping("/")
    public String showAllPeople(Model model) {
        List<PeopleEntity> peopleEntityList = peopleService.getAllPeople();
        model.addAttribute("allPeople",peopleEntityList);
        return "all-people";
    }
    @RequestMapping("/add_new_person")
    public String addNewPerson(Model model){
        PeopleEntity person = new PeopleEntity();
        model.addAttribute("person",person);
        return "person-info";
    }
    @RequestMapping("/save_person")
    public String savePerson(@ModelAttribute PeopleEntity person){
        peopleService.savePerson(person);
        return "redirect:/";
    }
    @RequestMapping("/update_info")
    public String updatePerson(@RequestParam("personId") int personId, Model model){
        PeopleEntity person = peopleService.getPerson(personId);
        model.addAttribute("person", person);
        return "person-info";
    }
    @RequestMapping("delete_person")
    public String deletePerson(@RequestParam("personId") int personId){
        peopleService.deletePerson(personId);
        return "redirect:/";
    }
}
