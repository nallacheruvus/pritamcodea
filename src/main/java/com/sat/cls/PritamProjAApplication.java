package com.sat.cls;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PritamProjAApplication implements CommandLineRunner {

//	@Autowired
//	private PritRegRepo repo;
	public static void main(String[] args) {
		SpringApplication.run(PritamProjAApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Pritreg pp=new Pritreg();
//		pp.setId(6);
//		pp.setName("Ganesh Shankar Vidyarthi");
//		pp.setEmail("ganapatividya@gmail.com");
//		repo.save(pp);
//		Optional<Pritreg> aa=repo.findById(6);
//		Pritreg ppa= aa.get();
//		ppa.setName(pp.getName());
//		ppa.setEmail(pp.getEmail());
//		repo.save(ppa);
//		repo.delete(pp);
//		List<Pritreg> ls=repo.findAll();
//		ls.iterator().forEachRemaining(n->{
//			System.out.println(String.format("Id:%d\nName:%s\nEmail:%s", n.getId(),n.getName(),n.getEmail()));
//		});
	}

}
