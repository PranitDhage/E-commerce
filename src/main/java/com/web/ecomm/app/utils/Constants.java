package com.web.ecomm.app.utils;

public interface Constants {

    String REQUEST_START_TIME = "REQUEST_START_TIME";
    String REQUEST_END_TIME = "REQUEST_END_TIME";
    String REQ_ID_KEY = "reqId";

    // Status
    String STATUS_SUCCESS = "SUCCESS";
    String STATUS_ERROR = "ERROR";

    // Success Code
    String SUCCESS_CODE = "200";

    // Errors Codes
    String ERR_DEFAULT = "ERR-DEF-500";
    String ERR_AUTH = "ERR-AUTH-401";
    String ERR_INVALID_DATA = "ERR-INV-100";
    String ERR_RESOURCE_NOT_FOUND = "ERR-RNF-400";
    String ERR_IO = "ERR-IO-503";
    String ERR_EXCEPTION = "ERR-EX-505";

    // Security
    public static final String SECRET = "SECRET_KEY";
    public static final long ACCESS_TOKEN_VALIDITY = 60 * 60 * 1000;
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String TOKEN_HEADER = "Authorization";
    public static final String SIGN_UP_URL = "/";
}