package com.sat.cls;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PritamProjAApplication implements CommandLineRunner {

	@Autowired
	private PritRegRepo repo;
	public static void main(String[] args) {
		SpringApplication.run(PritamProjAApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Pritreg reg=new Pritreg();
//		Optional<Pritreg> po=repo.findById(21);
//		reg=po.get();
//		reg.setId(21);
//		reg.setName("Jeevan");
//		reg.setEmail("jeevan@yahoo.com");
//		repo.save(reg);
//		repo.delete(reg);
//		repo.flush();
	}

}
