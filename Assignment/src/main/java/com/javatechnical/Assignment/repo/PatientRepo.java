package com.javatechnical.Assignment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javatechnical.Assignment.model.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Integer> {

}