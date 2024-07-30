package com.techthinkers.spro_user_service.controller;

import static com.techthinkers.spro_user_service.constant.AuthConstants.ACCESS_FORBIDDEN_MSSG;
import static com.techthinkers.spro_user_service.constant.AuthConstants.ACCESS_FORBIDDEN_STATUS_CODE_STR;
import static com.techthinkers.spro_user_service.constant.AuthConstants.AUTHEN_OP_DESC;
import static com.techthinkers.spro_user_service.constant.AuthConstants.AUTHEN_OP_PATH;
import static com.techthinkers.spro_user_service.constant.AuthConstants.AUTHEN_OP_SUCCESS_MSSG;
import static com.techthinkers.spro_user_service.constant.AuthConstants.AUTHEN_OP_VAL;
import static com.techthinkers.spro_user_service.constant.AuthConstants.NOT_FOUND_STATUS_CODE_STR;
import static com.techthinkers.spro_user_service.constant.AuthConstants.NO_USER_FOUND_MSSG;
import static com.techthinkers.spro_user_service.constant.AuthConstants.OK_STATUS_CODE;
import static com.techthinkers.spro_user_service.constant.AuthConstants.UNAUTHORIZED_MSSG;
import static com.techthinkers.spro_user_service.constant.AuthConstants.UNAUTHORIZED_STATUS_CODE_STR;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techthinkers.spro_user_service.dto.AuthRequest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
@Slf4j
public class AuthenticationControllerV1 {

	@PostMapping(path = AUTHEN_OP_PATH, consumes = MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = AUTHEN_OP_VAL, description = AUTHEN_OP_DESC)
	@ApiResponses(value = { @ApiResponse(responseCode = OK_STATUS_CODE, description = AUTHEN_OP_SUCCESS_MSSG),
			@ApiResponse(responseCode = UNAUTHORIZED_STATUS_CODE_STR, description = UNAUTHORIZED_MSSG),
			@ApiResponse(responseCode = ACCESS_FORBIDDEN_STATUS_CODE_STR, description = ACCESS_FORBIDDEN_MSSG),
			@ApiResponse(responseCode = NOT_FOUND_STATUS_CODE_STR, description = NO_USER_FOUND_MSSG) })
	public String authenticate(@RequestBody AuthRequest authenReq) {
		//log.info("sample log");
		return "OK";
	}
}