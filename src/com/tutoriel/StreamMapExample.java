package com.tutoriel;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StreamMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<User> users= new ArrayList<User>();
		users.add(new User(1,"faiza","password","faiza@gmail.com"));
		users.add(new User(2,"tony","password2","tony@gmail.com"));
		users.add(new User(3,"katia","password3","katia@gmail.com"));
		users.add(new User(4,"melo","password4","melo@gmail.com"));
		
		
		//manière traditionnel pour remplir la liste userDto des même propriètes que User sauf password
		List<UserDTO> usersDTO= new ArrayList<UserDTO>();
		for(User user:users) {
			usersDTO.add(new UserDTO(user.getId(),user.getUserName(),user.getEmail()));
		}
		for(UserDTO dto:usersDTO) {
			System.out.println(usersDTO);
		}

		
		//using stream map()
		users.stream().map(new Function<User,UserDTO>(){
			@Override
			public UserDTO apply(User user) {
				// TODO Auto-generated method stub
				return new UserDTO(user.getId(),user.getUserName(),user.getEmail());
			}
		});
		
		//using stream map() compressé 
	
		
		
		
	}

}


class UserDTO{
	private int id;
	private String userName;
	private String email;
	
	//constructor
	public UserDTO(int id, String userName,  String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
	}

	//setter & getter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	//method toString()
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName +  ", email=" + email + "]";
	}
}

class User{
	private int id;
	private String userName;
	private String password;
	private String email;
	
	//constructor
	public User(int id, String userName, String password, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}

	//setter & getter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	//method toString()
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email + "]";
	}
	
	
	
	
	
	
}
