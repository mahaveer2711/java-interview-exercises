package com.anandhi;

import java.util.*;

public class VotersList {

	public static void main(String... a) {

		List<Person> minors = new ArrayList<>();
		List<Person> voters = new ArrayList<>();

		System.out.println("minors");
		printPeople(minors);
		printPeople(voters);

		minors.add(new Person("Arj",2,'M'));
		minors.add(new Person("Ana",30,'F'));
		minors.add(new Person("Maha",30,'M'));

		for(Person person : minors){
			if(person.getAge() > 18) {
				voters.add(person);
				minors.remove(person);
			}
		}

		printPeople(minors);
		printPeople(voters);
	}

	private static void printPeople(List<Person> people){
		for(Person person :  people){
			System.out.print(person);
		}
	}

}
