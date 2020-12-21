package com.src.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.src.spring.model.Booking;
import com.src.spring.model.Hall;
import com.src.spring.service.BookingService;
import com.src.spring.service.BookingServiceImpl;


	@Controller
	public class BookingController {
		
		private BookingService bookingService;
		
		@Autowired(required=true)
		@Qualifier(value="bookingService")
		public void setBookingService(BookingService bs){
			this.bookingService = bs;
		}
		
		
		@RequestMapping(value = "/login/bookings", method = RequestMethod.GET)
		public String listBookings2(Model model) {
			model.addAttribute("booking", new Booking());
			model.addAttribute("listBookings", this.bookingService.listBookings());
			return "booking";
		}
		@RequestMapping(value = "/bookings", method = RequestMethod.GET)
		public String listBookings3(Model model) {
			model.addAttribute("booking", new Booking());
			model.addAttribute("listBookings", this.bookingService.listBookings());
			return "booking";
		}
		
		@RequestMapping(value = "/lastpage", method = RequestMethod.GET)
		public String listBookings4(Model model) {
//			model.addAttribute("booking", new Booking());
//			model.addAttribute("listBookings", this.bookingService.listBookings());
			return "lastpage";
		}

		@RequestMapping(value = "/booking.jsp", method = RequestMethod.GET)
		public String listBookings(Model model) {
			model.addAttribute("booking", new Booking());
			model.addAttribute("listBookings", this.bookingService.listBookings());
			return "booking";
			
		}
		
		//For add and update booking both
		@RequestMapping(value= "/booking/add", method = RequestMethod.POST)
		public String addBooking(@ModelAttribute("booking") Booking b){
			
			if(b.getBookingid() == 0){
				//new person, add it
				this.bookingService.addBooking(b);
			}else{
				//existing person, call update
				this.bookingService.updateBooking(b);
			}
			
			return "redirect:/bookings";
			
		}
		
		@RequestMapping("/removebooking/{bookingid}")
	    public String removeBooking(@PathVariable("bookingid") int bookingid){
			
	        this.bookingService.removeBooking(bookingid);
	        return "redirect:/bookings";
	    }
	 
	    @RequestMapping("/Update/{bookingid}")
	    public String editBooking(@PathVariable("bookingid") int bookingid, Model model){
	        model.addAttribute("booking", this.bookingService.getBookingById(bookingid));
	        model.addAttribute("listBooking", this.bookingService.listBookings());
	        return "booking";
	    }
	    
	    @RequestMapping("/payment/{bookingid}")
	    public String paymentBooking(@PathVariable("bookingid") int bookingid, Model model){
	        model.addAttribute("booking", this.bookingService.getBookingById(bookingid));
	        model.addAttribute("listBooking", this.bookingService.listBookings());
	        return "payment";
	    }
	    
		
}
