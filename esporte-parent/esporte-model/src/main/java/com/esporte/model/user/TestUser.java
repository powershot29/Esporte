package com.esporte.model.user;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.transaction.annotation.Transactional;

import com.esporte.model.Base.BaseData;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TestUser extends BaseData {
	
	@Column(name="name")
	private String name;
	
	@Column(name="email",unique=true)
	private String email;
	
	@Column(name="ranking")
	private long ranking;
	
	@Column(name="seeding")
	private long seeding;
	
	@Column(name="level")
	private long level;

}