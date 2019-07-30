package com.sapient.userrest.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sapient.userrest.model.User;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "User1")
@JsonIgnoreProperties(ignoreUnknown = true)

public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@XmlElement
	@Column(name = "id")
	private long id;
	@NotEmpty
	@XmlElement
	@Column(name = "name")
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;

	public User() {
		super();
	}

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="uid")
	private List<Post> posts;

	public User(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public User(long id, String name, Address address) {

		this.id = id;
		this.name = name;
		this.address = address;

	}

}
