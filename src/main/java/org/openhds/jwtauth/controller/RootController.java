package org.openhds.jwtauth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RootController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getMessage() {
		return "No authentication is needed to view this page...";
	}
}
