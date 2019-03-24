package org.openhds.jwtauth.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.openhds.jwtauth.domain.Fieldworker;
import org.openhds.jwtauth.repository.FieldworkerRepository;
import org.openhds.jwtauth.service.FieldworkerService;

@Service
public class FieldworkerServiceImpl implements FieldworkerService{

	@Autowired
	FieldworkerRepository fieldworkerRepo;
	
	public List<Fieldworker> getAllFieldworkers() {
		List<Fieldworker> allFieldworkers = fieldworkerRepo.findAll();	
		return allFieldworkers;
	}

	public String createFieldworker(Fieldworker fw) {
		Fieldworker field = new Fieldworker();
		field.setId(fw.getId());
		field.setExtId(fw.getExtId());
		field.setFirstName(fw.getFirstName());
		field.setLastName(fw.getLastName());
		
		fieldworkerRepo.save(field);
		return "Fieldworker created...";
	}

	public String deleteFieldworker(long id) {
		fieldworkerRepo.delete(id);
		return "Fieldworker removed...";
	}

}
