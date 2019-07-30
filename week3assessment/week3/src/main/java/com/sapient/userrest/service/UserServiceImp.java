package com.sapient.userrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sapient.userrest.dao.HibernateImp;
import com.sapient.userrest.model.Post;
import com.sapient.userrest.model.User;

@Service(value="service")
public class UserServiceImp implements UserService{

	
	@Autowired( required = true)
	  
	@Qualifier(value = "hibernatesql")
	private HibernateImp hi;
	
	  
	public UserServiceImp(@Qualifier(value = "hibernatesql")HibernateImp hi )
	{ 
		this.hi=hi;
	}
		 
	public User saveUser(User user) {
		return hi.saveUser(user);
	}

	public User findById(long id) {
		return hi.findById(id);
	}

	public void deleteUser(long id) {
		hi.deleteUser(id);
		
	}

	public User updateUser(long id, User user) {
		return hi.updateUser(id, user);
	}
	 
	public Post savePost(long id,Post post) {
		return hi.savePost(id,post);
	}
	public Post deletePost(long id,long u_id)
	{
		return hi.deletePost(id, u_id);
	}
	public List<Post> listAll(long id)
	{
		return hi.listAll(id);
	}
	public List<User> listAllUsers(){
		return hi.listAllUsers();
	}
	
}
