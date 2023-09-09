package com.simplilearn.spring.core.bean;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	
	private int id;
	private String name;
	private Map<Answer,User> answers;
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int id, String name, Map<Answer, User> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
	
	public void displayQuestionInfo() {
		System.out.println("Question Id: " + id);
		System.out.println("Question Name: " + name);
		System.out.println("Answers Info: ");
		Set<Entry<Answer,User>> entrySet = answers.entrySet();
		Iterator<Entry<Answer,User>> itr = entrySet.iterator();
		
		while(itr.hasNext()) {
			Entry<Answer,User> entry = itr.next();
			System.out.println("Answer: " + entry.getKey());
			System.out.println("Posted by: " + entry.getValue());
		}
		
	}

}
