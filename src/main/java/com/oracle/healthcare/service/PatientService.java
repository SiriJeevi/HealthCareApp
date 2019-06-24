package com.oracle.healthcare.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.oracle.healthcare.dao.Patient;

@Service
public class PatientService {
	
	List<Patient> patientList;
	
	public List<Patient> getAllPatient(){
		patientList =new ArrayList<Patient>();
		
		Patient p1=new Patient("AA",40,"Bangalore","aa.test@gmail.com");
		Patient p2=new Patient("BB",50,"Hyderabad","bb.test@gmail.com");
		Patient p3=new Patient("CC",55,"Delhi","cc.test@gmail.com");
		Patient p4=new Patient("DD",45,"Chenai","dd.test@gmail.com");
		
		/*Patient p1=new Patient();
		p1.setName("AA");
		p1.setAge(40);
		p1.setAdress("Bangalore");
		p1.setEmail("aa.test@gmail.com");
		
		Patient p2=new Patient();
		p2.setName("BB");
		p2.setAge(50);
		p2.setAdress("Hyderabad");
		p2.setEmail("bb.test@gmail.com");
		
		Patient p3=new Patient();
		p3.setName("CC");
		p3.setAge(50);
		p3.setAdress("Delhi");
		p3.setEmail("cc.test@gmail.com");*/
		
		patientList.add(p1);
		patientList.add(p2);
		patientList.add(p3);
		patientList.add(p4);
		
		return patientList;
	}

}
