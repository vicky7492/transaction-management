package com.docter.service;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.docter.appointmentForm.AppointmentForm;
import com.docter.model.Appointment;
import com.docter.model.Patient;
import com.docter.repo.AppointmentRepo;
import com.docter.repo.PatientRepo;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
@Transactional
public class AppointmentService {
	
	@Autowired
	private AppointmentRepo appointmentRepo;
	
	@Autowired
	private PatientRepo patientRepo;
	
	public String Appointment(AppointmentForm appointmentForm)
	{
		Patient patient = new ObjectMapper().convertValue(appointmentForm, Patient.class);
		
		Long patientNumber = patientRepo.save(patient).getPatientNumber();
		
		System.out.println("Patient data saved successfully");
		
		
		Appointment appointment = new Appointment(new Date(System.currentTimeMillis()), 101L, patientNumber);
		
		
		Long appointmentNumber = appointmentRepo.save(appointment).getAppointmentNumber();
		
		return "Appointment Confirmed " +appointmentNumber;
		
		
	}
	
	

}
