
package com.sapient.userrest.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.hibernate.annotations.Parameter;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.ToString;

@ToString

@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Data
@Table(name = "Address1")

public class Address implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private long id;

	@XmlElement
	private String city;
	@XmlElement
	private String state;
	@XmlElement
	private String zip;

	public Address(String city, String state, String zip) {

		this.city = city;
		this.state = state;
		this.zip = zip;

	}

	public Address() {
		super();

	}

}
