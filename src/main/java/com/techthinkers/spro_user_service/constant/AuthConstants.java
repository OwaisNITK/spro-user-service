package com.techthinkers.spro_user_service.constant;

public final class AuthConstants {
	
	private AuthConstants() {
		// private constructor
	}
	
	public static final String AUTHEN_OP_PATH = "/authenticate";
	
	public static final String AUTHEN_OP_VAL = "Authenticate user credentials and generate access token" ;
	public static final String AUTHEN_OP_DESC = "This API is used to authenticate user credentials and generate valid access tokens for authorization";
	
	public static final String OK_STATUS_CODE = "200";
	public static final String AUTHEN_OP_SUCCESS_MSSG = "Authentication successful";
	public static final String UNAUTHORIZED_STATUS_CODE_STR = "401";
	public static final String UNAUTHORIZED_MSSG = "You are not authorized to perform this action";
	public static final String ACCESS_FORBIDDEN_STATUS_CODE_STR = "403";
	public static final String ACCESS_FORBIDDEN_MSSG = "Access is forbidden";
	public static final String NOT_FOUND_STATUS_CODE_STR = "404";
	public static final String NO_USER_FOUND_MSSG = "User Not Found";	
}