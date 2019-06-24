package com.oracle.healthcare.controller;

import org.springframework.web.bind.annotation.RestController;

import com.oracle.healthcare.dao.Patient;
import com.oracle.healthcare.service.PatientService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController

public class PatientController {
	
	@Autowired
	PatientService patientService;
	
  @GetMapping("/")	
  public List<Patient> getPatientDetails(){
	  List<Patient> patients=new ArrayList<Patient> ();
	  patients=patientService.getAllPatient();
	  return patients;
  }

}
