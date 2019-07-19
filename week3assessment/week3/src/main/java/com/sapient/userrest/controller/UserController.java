package com.sapient.userrest.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.userrest.model.Post;
import com.sapient.userrest.model.User;
import com.sapient.userrest.service.UserService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@RequestMapping("/users")
@EnableSwagger2
@PropertySource("classpath:documentation.properties")
public class UserController {
	
	
	@Autowired
	UserService service;
	@Transactional
	@PostMapping(value="/",consumes= {APPLICATION_JSON_VALUE,APPLICATION_XML_VALUE})

	public User saveUser(  @ApiParam(value = "${ProductController.saveUser}", required = true )@RequestBody User user)
	{
		return service.saveUser(user);
	}
	
	@GetMapping(value="/{id}",produces= {APPLICATION_JSON_VALUE,APPLICATION_XML_VALUE})
	@ResponseStatus(HttpStatus.OK)
	@Transactional
	public User findById( @ApiParam(value = "${ProductController.getUserById}", required = true )@PathVariable("id") long id) {
		return service.findById(id);
	}
	
	@GetMapping(value="/${ProductController.listallusers}",produces= {APPLICATION_JSON_VALUE,APPLICATION_XML_VALUE})
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value ="", notes = "fetchAllUsers")
	@Transactional
	public List<User> listAllUser()
	{
		return service.listAllUsers();
		
	}
	@Transactional
	@DeleteMapping(value="/{id}",consumes= {APPLICATION_JSON_VALUE,APPLICATION_XML_VALUE})
	public void deleteUser( @ApiParam(value = "${ProductController.deleteUser}", required = true )@PathVariable("id")  long id)
	{
		service.deleteUser(id);
	}
	
	@Transactional
	@PutMapping(value="/{id}",consumes= {APPLICATION_JSON_VALUE,APPLICATION_XML_VALUE})
	public User updateUser(  @ApiParam(value = "${ProductController.updateUser}", required = true )@PathVariable("id") long id,@RequestBody User user)
	{
		return service.updateUser(id, user);
	}
	
	@Transactional
	@PostMapping(value="/{id}/posts",consumes= {APPLICATION_JSON_VALUE,APPLICATION_XML_VALUE})
	public Post savePost( @ApiParam(value = "${ProductController.savepost}", required = true )@PathVariable("id") long id,@RequestBody Post post)
	{
		return service.savePost(id,post);
	}
	
	@Transactional
	@DeleteMapping(value="/{id}/posts/{p_id}",consumes= {APPLICATION_JSON_VALUE,APPLICATION_XML_VALUE})
	public Post deletePost( @ApiParam(value = "${ProductController.deletePost}", required = true )@PathVariable("id")  long id,@PathVariable("p_id") long p_id) {
		return service.deletePost(id, p_id);
	}
	@Transactional
	@GetMapping(value="/{id}/posts",produces= {APPLICATION_JSON_VALUE,APPLICATION_XML_VALUE})
	public List<Post> listAll( @ApiParam(value = "${ProductController.listAllPosts}", required = true )long id)
	{
		return service.listAll(id);
	}
	

}
