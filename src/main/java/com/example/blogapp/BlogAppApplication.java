package com.example.blogapp;

import com.example.blogapp.entity.Role;
import com.example.blogapp.repository.RoleRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class BlogAppApplication implements CommandLineRunner {

	@Autowired
	private RoleRepository roleRepository;

	public static void main(String[] args) {
		SpringApplication.run(BlogAppApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	@Override
	public void run(String... args) throws Exception {

		try{
			Role role = new Role();
			role.setId(501);
			role.setName("ROLE_ADMIN");

			Role role1 = new Role();
			role1.setId(502);
			role1.setName("ROLE_USER");

			List<Role> roles = List.of(role, role1);
			roleRepository.saveAll(roles);

		}catch (Exception e){
			e.printStackTrace();
		}

	}
}
