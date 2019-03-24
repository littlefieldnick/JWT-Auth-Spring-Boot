package org.openhds.jwtauth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.provider.endpoint.TokenEndpoint;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.openhds.jwtauth.domain.Fieldworker;
import org.openhds.jwtauth.service.FieldworkerService;


@RestController
@RequestMapping("/openhds")
public class FieldworkerController {
	@Autowired
	private TokenEndpoint tokenEndpoint;

	@Autowired
	private TokenStore tokenStore;

	@Autowired
	private FieldworkerService fieldworkerService;

    @PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
	@RequestMapping(value = "/fieldworkers", method = RequestMethod.GET)
	public List<Fieldworker> getFieldworkers(){
		return fieldworkerService.getAllFieldworkers();
	}

    @PreAuthorize("hasAuthority('ADMIN_USER')")
	@RequestMapping(value = "/fieldworkers", method = RequestMethod.POST)
	public String createFieldworker(@RequestBody Fieldworker fw){
		return fieldworkerService.createFieldworker(fw);
	}

    @PreAuthorize("hasAuthority('ADMIN_USER')")
	@RequestMapping(value = "fieldworkers/{id}", method = RequestMethod.DELETE)
	public String deleteFieldworker(@PathVariable("id") String id){
		return fieldworkerService.deleteFieldworker(Integer.parseInt(id));
	}
}