package com.docter.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.docter.model.Appointment;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment,Long> {

}
