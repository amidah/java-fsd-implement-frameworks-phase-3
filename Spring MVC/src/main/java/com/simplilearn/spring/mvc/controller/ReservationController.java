package com.simplilearn.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.simplilearn.spring.mvc.model.Reservation;

@RequestMapping("/reservation")
@Controller
public class ReservationController {

	@RequestMapping("/bookingForm")
	public String bookingForm(Model model) {

		Reservation reservation = new Reservation();
		model.addAttribute("reservation", reservation);
		return "reservation-page";
	}

	@RequestMapping("/submitForm")
	public String submitForm(@ModelAttribute("reservation") Reservation res) {
		return "confirmation-page";
	}

}
