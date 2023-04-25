package com.nour.enseignant.restcontrollers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nour.enseignant.entities.Enseignant;
import com.nour.enseignant.services.EnseignantService;

@RestController
@RequestMapping("/api")
@CrossOrigin

public class EnseignantRESTController {
	@Autowired
	EnseignantService EnseignantService;
	
	@GetMapping
	public List<Enseignant> getAllEnseignant() {
	return EnseignantService.getAllEnseignant();
	}
	}

