package org.openhds.jwtauth.service;

import java.util.List;
import org.openhds.jwtauth.domain.Fieldworker;

public interface FieldworkerService {
	List<Fieldworker> getAllFieldworkers();
	String createFieldworker(Fieldworker fw);
	String deleteFieldworker(long id);

}
