package com.sapient.userrest.dao;


import java.util.List;

import com.sapient.userrest.model.Post;
import com.sapient.userrest.model.User;

public interface UserDao {
	public User saveUser(User user);

    public User findById(long id);

    public void deleteUser(long id);
    
    public User updateUser(long id,User user);
	 
	public Post savePost(long id,Post post);
	public Post deletePost(long id,long p_id);
	public List<Post> listAll(long id);
	public List<User> listAllUsers();
}
