
  package com.sapient.userrest.model;
  
  import java.io.Serializable;
  import javax.persistence.Column;
  import javax.persistence.Entity; 
  import javax.persistence.GeneratedValue;
  import javax.persistence.GenerationType;
  import javax.persistence.Id; 
  import javax.persistence.ManyToOne;
  import javax.persistence.OneToMany;
  import javax.persistence.OneToOne;
  import javax.persistence.Table;
  import javax.validation.constraints.NotEmpty;
  import javax.xml.bind.annotation.XmlAccessType;
  import javax.xml.bind.annotation.XmlAccessorType;
  import javax.xml.bind.annotation.XmlElement;
  import javax.xml.bind.annotation.XmlRootElement;
  import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
  import com.fasterxml.jackson.annotation.JsonProperty;
  import lombok.Data; 
  import lombok.ToString;
  
  @Data
  
  @ToString
  
  @XmlRootElement
  
  @XmlAccessorType(XmlAccessType.FIELD)
  
  @Entity
  
  @Table(name = "Post1")
  
  @JsonIgnoreProperties(ignoreUnknown = true) 
  public class Post implements Serializable{
  
  
	 
	  
	 
	  @Id
	  @XmlElement
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	  
	  private String title;
	
	  private String body;
  
  }
 