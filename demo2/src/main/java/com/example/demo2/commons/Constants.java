package com.example.demo2.commons;

public class Constants {
    private Constants() {
        throw new IllegalStateException("Utility class");
    }

    /**----Error-Handling-Codes-----*/
    public static final String ER_ILLEGAL_ARGUMENT_EXCEPTION ="ERN004";
    public static final String ER_NULL_POINTER_EXCEPTION ="ERN005";
    public static final String ER_BIND_EXCEPTION="ERN006";
    public static final String ER_CONVERSION_NOT_SUPPORTED_EXCEPTION ="ERN007";
    public static final String ER_HTTP_MEDIA_TYPE_NOT_ACCEPTABLE_EXCEPTION = "ERN008";
    public static final String ER_HTTP_MEDIA_TYPE_NOT_SUPPORTED = "ERN009";
    public static final String ER_HTTP_MESSAGE_NOT_READABLE_EXCEPTION = "ERN0010";
    public static final String ER_HTTP_MESSAGE_NOT_WRITABLE_EXCEPTION = "ERN0011";
    public static final String ER_HTTP_REQUEST_METHOD_NOT_SUPPORTED_EXCEPTION = "ERN0012";
    public static final String ER_METHOD_ARGUMENT_NOT_VALID_EXCEPTION = "ERN0013";
    public static final String ER_MISSING_SERVLET_REQUEST_PARAMETER_EXCEPTION = "ERN0014";
    public static final String ER_MISSING_SERVLET_REQUEST_PART_EXCEPTION = "ERN0015";
    public static final String ER_TYPE_MISMATCH_EXCEPTION = "ERN0016";
    /**----Business-Error-----*/
    public static final String ER_PARAMETER_TYPE_NOT_FOUND_EXCEPTION ="ERN001";
    public static final String ER_PARAMETER_PARENT_NOT_FOUND_EXCEPTION ="ERN002";
    public static final String ER_PARAMETER_NOT_FOUND_EXCEPTION="ERN003";
    public static final String ER_PARAMETER_ALREADY_EXIST_EXCEPTION ="ERN0020";
}
