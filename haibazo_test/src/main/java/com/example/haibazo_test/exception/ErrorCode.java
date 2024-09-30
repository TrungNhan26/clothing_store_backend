//package com.example.haibazo_test.exception;
//
//import lombok.AccessLevel;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.experimental.FieldDefaults;
//import org.springframework.http.HttpStatus;
//@Getter
//@AllArgsConstructor
//@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
//public enum ErrorCode {
//    PRODUCT_NOT_EXIST(40101,"Product not exist",HttpStatus.NOT_FOUND),
//    DEPARTMENT_NOT_EXIST(40102,"department not exist",HttpStatus.NOT_FOUND),
//    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized error", HttpStatus.INTERNAL_SERVER_ERROR),
//    INVALID_KEY(1001, "Uncategorized error", HttpStatus.BAD_REQUEST),
//    USER_EXISTED(1002, "User existed", HttpStatus.BAD_REQUEST),
//    USERNAME_INVALID(1003, "Username must be at least {min} characters", HttpStatus.BAD_REQUEST),
//    INVALID_PASSWORD(1004, "Password must be at least {min} characters", HttpStatus.BAD_REQUEST),
//    USER_NOT_EXISTED(1005, "User not existed", HttpStatus.NOT_FOUND),
//    UNAUTHENTICATED(1006, "Unauthenticated", HttpStatus.UNAUTHORIZED),
//    UNAUTHORIZED(1007, "You do not have permission", HttpStatus.FORBIDDEN),
//    INVALID_DOB(1008, "Your age must be at least {min}", HttpStatus.BAD_REQUEST),
//    USER_NOT_FOUND(1009, "User not found", HttpStatus.BAD_REQUEST),
//    GET_SUCCESSFUL(1010, "Get successful", HttpStatus.OK),
//    ADD_SUCCESSFUL(1011, "Add successful", HttpStatus.OK),
//    DELETE_SUCCESSFUL(1012, "Delete successful", HttpStatus.OK),
//    UPDATE_SUCCESSFUL(1013, "Update successful", HttpStatus.OK),
//    INVALID_DATA(1014, "Invalid data", HttpStatus.BAD_REQUEST),
//    FULL_NAME_INVALID(1014, "Full name must be not blank", HttpStatus.BAD_REQUEST),
//    ;
//    public final Integer code;
//    public final String message;
//    public final HttpStatus httpStatus;
//}
//
package com.example.haibazo_test.exception;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum ErrorCode {
    PRODUCT_NOT_EXIST(40101,"Product not exist",HttpStatus.NOT_FOUND),
    DEPARTMENT_NOT_EXIST(40102,"department not exist",HttpStatus.NOT_FOUND),
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized error", HttpStatus.INTERNAL_SERVER_ERROR),
    INVALID_KEY(1001, "Uncategorized error", HttpStatus.BAD_REQUEST),
    USER_EXISTED(1002, "User existed", HttpStatus.BAD_REQUEST),
    USERNAME_INVALID(1003, "Username must be at least {min} characters", HttpStatus.BAD_REQUEST),
    INVALID_PASSWORD(1004, "Password must be at least {min} characters", HttpStatus.BAD_REQUEST),
    USER_NOT_EXISTED(1005, "User not existed", HttpStatus.NOT_FOUND),
    UNAUTHENTICATED(1006, "Unauthenticated", HttpStatus.UNAUTHORIZED),
    UNAUTHORIZED(1007, "You do not have permission", HttpStatus.FORBIDDEN),
    INVALID_DOB(1008, "Your age must be at least {min}", HttpStatus.BAD_REQUEST),
    USER_NOT_FOUND(1009, "User not found", HttpStatus.BAD_REQUEST),
    GET_SUCCESSFUL(1010, "Get successful", HttpStatus.OK),
    ADD_SUCCESSFUL(1011, "Add successful", HttpStatus.OK),
    DELETE_SUCCESSFUL(1012, "Delete successful", HttpStatus.OK),
    UPDATE_SUCCESSFUL(1013, "Update successful", HttpStatus.OK),
    INVALID_DATA(1014, "Invalid data", HttpStatus.BAD_REQUEST),
    FULL_NAME_INVALID(1014, "Full name must be not blank", HttpStatus.BAD_REQUEST),
    ;
    int code;
    String message;
    HttpStatus httpStatus;
}
