package com.docter.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

@Entity
public class Appointment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long appointmentNumber;
	private Date date;
	private Long docterNumber;
	private Long patientNumber;
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Appointment(Date date, Long docterNumber, Long patientNumber) {
		super();
        //this.appointmentNumber = appointmentNumber;
		this.date = date;
		this.docterNumber = docterNumber;
		this.patientNumber = patientNumber;
	}
	public Long getAppointmentNumber() {
		return appointmentNumber;
	}
	public void setAppointmentNumber(Long appointmentNumber) {
		this.appointmentNumber = appointmentNumber;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Long getDocterNumber() {
		return docterNumber;
	}
	public void setDocterNumber(Long docterNumber) {
		this.docterNumber = docterNumber;
	}
	public Long getPatientNumber() {
		return patientNumber;
	}
	public void setPatientNumber(Long patientNumber) {
		this.patientNumber = patientNumber;
	}
	
	
	
}
