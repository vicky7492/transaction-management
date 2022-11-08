package com.docter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.docter.appointmentForm.AppointmentForm;
import com.docter.service.AppointmentService;

@RestController
public class AppointmentController {
	
	@Autowired
	private AppointmentService AppointmentService;
	
	
	@PostMapping ("/book")
	public String Appointment(@RequestBody AppointmentForm appointmentForm)
	{
		return AppointmentService.Appointment(appointmentForm);
	}

}
