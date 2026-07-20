package com.example.demo;

import java.util.Arrays;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Person;
import com.example.demo.service.PersonService;


@SpringBootApplication
public class PersonApplication implements CommandLineRunner {
	
	@Autowired
	private PersonService PersonService;

	public static void main(String[] args) {
		SpringApplication.run(PersonApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		//createPersons();
		getPersonByIds();
		
	}
	
	private void createPersons() {
		/*List<Person> personsList=new ArrayList<Person>();
		personsList.add(new Person("Vijay","Kumar","vijumca@gmail.com",39,"1111111"));*/
		

		List<Person> personList = Arrays.asList(
				new Person("Kiran", "kumar", "kiran@gmail.com", 20,"11111111"),
				new Person("Ram", "kumar", "ram@gmail.com", 22,"222222222"),
				new Person("RamKiran", "LaxmiKiran", "sita@gmail.com", 30,"3333333"),
				new Person("Lakshamn", "Seth", "seth@gmail.com", 50,"44444444"),
				new Person("Sita", "Kumar", "lakshman@gmail.com", 50,"5555555"),
				new Person("Ganesh", "Kumar", "ganesh@gmail.com", 50,"6666666"),
				
				new Person("KiranKiran", "kumar", "kirank@gmail.com", 20,"7777777"),
				new Person("RamRam", "kumar", "ramk@gmail.com", 22,"8888888"),
				new Person("RamKiranRamKiran", "LaxmiKiran", "sital@gmail.com", 30,"99999999"),
				new Person("RamKiranRamKiran", "Seth", "sethk@gmail.com", 50,"1212121212"),
				new Person("SitaSita", "Kumar", "lakshmans@gmail.com", 50,"131313123"),
				new Person("GaneshSita", "Kumar", "ganeshg@gmail.com", 50,"2343943939"));

		Iterable<Person> list = PersonService.saveAllPersons(personList);
		for (Person person : list) {
			System.out.println("Person Object" + person.toString());

		}
		
	}
	private void getPersonByIds() {
		List<Integer> personList = new ArrayList<Integer>();
		personList.add(1);
		personList.add(2);
		personList.add(12);
		personList.add(5);
		personList.add(6);
		personList.add(20);
		personList.add(40);
		personList.add(11);
		personList.add(15);
		personList.add(3);
		personList.add(4);
		Iterable<Person> personsList = PersonService.findMultiplePersons(personList);
		//select * from tbl_person where person_id in (1,2,12,5,6,20,40,11,15,3,4);
		for (Person person : personsList) {
			System.out.println("Person Object" + person.toString());

		}
	}
	
//	private void findN
	
	
}
