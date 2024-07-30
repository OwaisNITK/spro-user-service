package com.techthinkers.spro_user_service.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AuthRequest {
	
	@Schema(description = "User Name" , name = "userName", required = true, example = "owais_khan")
	@NotBlank
	@Size(min=5, max= 20)
	private String userName;
	
	@Schema(description = "User Password" , name = "password", required = true, example = "Pass#@123")
	@NotBlank
	@Size(min=5, max= 20)
	private String password;

}