package com.alphaware.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alphaware.entity.Continent;
import com.alphaware.service.ContinentService;
import com.lti.dto.ApiResponse;

@RestController
@RequestMapping("/continent")
@CrossOrigin
public class ContinentRestController {

	@Autowired
	ContinentService continentService;

	@GetMapping("/fetch")
	public ResponseEntity<ApiResponse<Iterable<Continent>>> fetchContinents() {
		Iterable<Continent> saveContinent = continentService.saveContinent();
		ApiResponse<Iterable<Continent>> apiResponse = new ApiResponse<>();
		apiResponse.setSuccess(true);
		apiResponse.setMessage("Data Successfully saved");
		apiResponse.setData(saveContinent);
		return new ResponseEntity<>(apiResponse, HttpStatus.OK);

	}

}
