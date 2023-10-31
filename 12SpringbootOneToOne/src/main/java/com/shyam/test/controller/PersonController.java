package com.shyam.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shyam.test.entity.IdCard;
import com.shyam.test.entity.Person;
import com.shyam.test.repo.IdCardRepository;
import com.shyam.test.repo.PersonRepository;

@RestController
public class PersonController {

	@Autowired
	private PersonRepository personRepository;
	@Autowired
	private IdCardRepository cardRepository;

	@PostMapping("/save")
	private Person savePerson() {
		Person p = new Person();
		p.setName("Pankaj");

		IdCard card = new IdCard();

		card.setName("PAN");
		card.setNumber(34534432);
		card.setPerson(p);

		p.setCard(card);

		//cardRepository.save(card);
		Person save = personRepository.save(p);
		
		return save;
	}

}
