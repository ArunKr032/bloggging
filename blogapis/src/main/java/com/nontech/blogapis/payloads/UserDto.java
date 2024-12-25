package com.nontech.blogapis.payloads;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.nontech.blogapis.entities.Role;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	
	private int id;
	@NotEmpty
	@Size(min = 4,max = 50, message = "Username must be 4 characters and max 50")
	private String name;
	@Email(message = "Email address not valid")
	private String email;
	@NotEmpty
	@Size(min = 3,max = 10,message = "Password must be min 3 char and max 10 char")
	private String password;
	@NotEmpty
	private String about;
	
	private Set<RoleDto> roles = new HashSet<>();

}
