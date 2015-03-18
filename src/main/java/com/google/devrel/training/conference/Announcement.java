package com.google.devrel.training.conference;

import com.googlecode.objectify.annotation.Cache;
import com.googlecode.objectify.annotation.Entity;

@Cache
@Entity
public class Announcement {
	private String message;
	
	public Announcement(){
		
	}
	
	public Announcement(String message){
		this.message = message;
	}
	
	public String getMessage(){
		return message;
	}
}
