package com.sat.cls;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceCode {
	@Autowired
	private PritRegRepo repo;

	@GetMapping("/sel")
	public List<Pritreg> retRegs() {
		return repo.findAll();
	}
	
	@PostMapping("/ins/{id}/{name}/{email}")
	public String insRegs(@PathVariable("id") int id,@PathVariable("name") String name,@PathVariable("email") String email) {
		String status="inserted";
		Pritreg pp=new Pritreg();
		pp.setId(id);
		pp.setName(name);
		pp.setEmail(email);
		repo.save(pp);
		return status;
	}
	
	@PutMapping("/ups/{id}/{name}/{email}")
	public String upRegs(@PathVariable("id") int id,@PathVariable("name") String name,@PathVariable("email") String email) {
		String status="updated";
		Optional<Pritreg> aa=repo.findById(id);
		Pritreg ppa= aa.get();
		ppa.setName(name);
		ppa.setEmail(email);
		repo.save(ppa);
		return status;
	}
	
	@DeleteMapping("/del/{id}")
	public String delRegs(@PathVariable("id") int id) {
		String status="deleted";
		Optional<Pritreg> aa=repo.findById(id);
		Pritreg ppa= aa.get();
		ppa.setName(ppa.getName());
		ppa.setEmail(ppa.getEmail());
		repo.delete(ppa);
		return status;
	}
}
