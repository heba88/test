package com.expedia.hotel.beans;

public class UserInfoBean{
	//"userInfo":{"persona":{"personaType":"OTHERS"},"userId":"foo"},
	private  String userId;
	private Persona persona;
	
	UserInfoBean(String userId) {
		this.userId = userId;
		persona = new Persona();
	}
	
	public String getUserId() {
		return userId;
	}
	
	class Persona {
		 private String personaType;
	}
	
	public String getPersonaType() {
		return persona.personaType;
	}
}