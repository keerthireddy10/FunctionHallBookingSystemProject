package com.src.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.src.spring.model.Hall;

import com.src.spring.service.HallService;

@Controller
public class HallController {

	private HallService hallService;
	
	@Autowired(required=true)
	@Qualifier(value="hallService")
	public void setBookingService(HallService hs){
		this.hallService = hs;
	}
	@RequestMapping(value = "/halls", method = RequestMethod.GET)
	public String listHalls2(Model model) {
		model.addAttribute("hall", new Hall());
		model.addAttribute("listHalls", this.hallService.listHalls());
		return "hall";
	}
	
	@RequestMapping(value = "/hall.jsp", method = RequestMethod.GET)
	public String listHalls(Model model) {
		model.addAttribute("hall", new Hall());
		model.addAttribute("listHalls", this.hallService.listHalls());
		return "hall";
	}
	
	//For add and update hall both
	@RequestMapping(value= "/hall/add", method = RequestMethod.POST)
	public String addHall(@ModelAttribute("hall") Hall h){
		
		if(h.getHallid() == 0){
			//new hall, add it
			this.hallService.addHall(h);
		}else{
			//existing hall, call update
			this.hallService.updateHall(h);
		}
		
		return "redirect:/halls";
		
	}
	
	@RequestMapping("/removehall/{hallid}")
    public String removeHall(@PathVariable("hallid") int hallid){
		
        this.hallService.removeHall(hallid);
        return "redirect:/halls";
    }
 
    @RequestMapping("/edithall/{hallid}")
    public String editHall(@PathVariable("hallid") int hallid, Model model){
        model.addAttribute("hall", this.hallService.getHallById(hallid));
        model.addAttribute("listHall", this.hallService.listHalls());
        return "hall";
    }
	
}
