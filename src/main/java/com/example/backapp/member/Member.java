package com.example.backapp.member;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Member {
	@Id  //primary key
	private String id;
	private String pwd;
	private String name;
	private String email;
	private String type;    //admin, seller, consumer
}
