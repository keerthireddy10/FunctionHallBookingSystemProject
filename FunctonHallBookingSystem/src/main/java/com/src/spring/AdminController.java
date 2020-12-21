package com.src.spring;

import java.io.IOException;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.src.spring.model.Admin;
import com.src.spring.service.AdminService;
@Controller
public class AdminController {
	
	

		private static final Logger logger = Logger
				.getLogger(AdminController.class);

		public AdminController() {
			System.out.println("AdminController()");
		}

		
		@Autowired
		private AdminService adminService;
		
		@RequestMapping(value = "/")
		public ModelAndView displayHome(ModelAndView model) throws IOException {
			
			model.setViewName("index");
			return model;
		}
		
		@RequestMapping(value = "/adminlogin")
		public ModelAndView adminLogin(ModelAndView model) throws IOException {
			Admin admin=new Admin();		
			model.addObject("admin", admin);		
			model.setViewName("adminLogin");
			return model;
		}
		
		@RequestMapping(value = "/login")
		public ModelAndView adminLogin(@ModelAttribute("admin")Admin ad,ModelAndView model) throws IOException {
			
			boolean b=adminService.validate(ad);
			
			if(b)
			{
			model.setViewName("display");
			}
			else
			{
				model.setViewName("adminLogin");
			}
			return model;
		}
}

