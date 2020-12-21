package com.src.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.src.spring.model.Person;
import com.src.spring.service.PersonService;

@Controller
public class PersonController {
	
	private PersonService personService;
	
	@Autowired(required=true)
	@Qualifier(value="personService")
	public void setPersonService(PersonService ps){
		this.personService = ps;
	}
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String listPersons1(Model model) {
		//model.addAttribute("person", new Person());
		//model.addAttribute("listPersons", this.personService.listPersons());
		return "home";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String listPersons2(Model model) {
		//model.addAttribute("person", new Person());
		//model.addAttribute("listPersons", this.personService.listPersons());
		return "login";
	}
	
	@RequestMapping(value = "/persons", method = RequestMethod.GET)
	public String listPersons(Model model) {
		model.addAttribute("person", new Person());
		model.addAttribute("listPersons", this.personService.listPersons());
		return "person";
	}
	
	//For add and update person both
	@RequestMapping(value= "/person/add", method = RequestMethod.POST)
	public String addPerson(@ModelAttribute("person") Person p){
		
		if(p.getCustomerid() == 0){
			//new person, add it
			this.personService.addPerson(p);
		}else{
			//existing person, call update
			this.personService.updatePerson(p);
		}
		
		return "redirect:/persons";
		
	}
	
	@RequestMapping("/removecustomer/{customerid}")
    public String removePerson(@PathVariable("customerid") int customerid){
		
        this.personService.removePerson(customerid);
        return "redirect:/persons";
    }
 
    @RequestMapping("/edit/{customerid}")
    public String editPerson(@PathVariable("customerid") int customerid, Model model){
        model.addAttribute("person", this.personService.getPersonById(customerid));
        model.addAttribute("listPersons", this.personService.listPersons());
        return "person";
    }
    @RequestMapping("/login/{customerid}")
    public String BookPerson(@PathVariable("customerid") int customerid, Model model){
        model.addAttribute("person", this.personService.getPersonById(customerid));
        model.addAttribute("listPersons", this.personService.listPersons());
        return "login";
    }
}
