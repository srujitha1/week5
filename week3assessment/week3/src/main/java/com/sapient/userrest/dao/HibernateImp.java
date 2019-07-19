package com.sapient.userrest.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sapient.userrest.model.Post;
import com.sapient.userrest.model.User;

@Repository(value="hibernatesql")
public class HibernateImp implements UserDao{

	
	@Autowired
    private SessionFactory sessionFactory;
	
	public User saveUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
        return user;
	}

	public User findById(long id) {
		Session session = sessionFactory.getCurrentSession();
		return sessionFactory.getCurrentSession().get(User.class, id);
	}

	public void deleteUser(long id) {
		Session session = sessionFactory.getCurrentSession();
		User user = session.byId(User.class).load(id);
        session.delete(user);
		
	}

	public User updateUser(long id, User user) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(user);
		return user;
	}
	public List<Post> listAll(long id){
		Session session = sessionFactory.getCurrentSession();
		 User user= session.get(User.class, id);
		 List<Post> list= user.getPosts();
		 return list;
	}
	
	public List<User> listAllUsers(){
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery(" from User").list();
	}
	
	public Post savePost(long id,Post post) {
		Session session = sessionFactory.getCurrentSession();
	    session.save(post);
	   User user= session.get(User.class, id);
	   List<Post> list= user.getPosts();
	   list.add(post);
	   user.setPosts(list);
	   System.out.println(post);
	    return post;
	}
	public Post deletePost(long id,long p_id) {
		Session session = sessionFactory.getCurrentSession();
		  User user= session.get(User.class, id);
		 
		 Post post= session.get(Post.class, p_id);
	 
	   List<Post> list= user.getPosts();
	   
	  while(list.isEmpty())
	  {
		  if(list.equals(post))
		  {
			  session.delete(post);
			  list.remove(post);
		  }
	  }
	   user.setPosts(list);
	   System.out.println(post);
	    return post;
	}

	
}
