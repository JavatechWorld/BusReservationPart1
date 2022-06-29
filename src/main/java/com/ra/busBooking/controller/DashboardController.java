package com.ra.busBooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ra.busBooking.DTO.ReservationDTO;
import com.ra.busBooking.model.Reservation;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {

	@ModelAttribute("reservation")
    public ReservationDTO reservationDTO() {
        return new ReservationDTO();
    }
	
	@GetMapping
    public String displayDashboard(){
        return "dashboard";
    }
	
	@PostMapping
	public String saveStudent( @ModelAttribute("reservation") ReservationDTO reservationDTO) {
	    return "dashboard";
	}
}
