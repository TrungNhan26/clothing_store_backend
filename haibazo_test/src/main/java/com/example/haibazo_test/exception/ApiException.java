//package com.example.haibazo_test.exception;
//
//import lombok.AccessLevel;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.experimental.FieldDefaults;
//
//@Getter
//@Setter
//@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
//public class ApiException extends RuntimeException {
//    private final ErrorCode errorCode;
//
//    public ApiException(ErrorCode errorCode) {
//        super(errorCode.getMessage());
//        this.errorCode = errorCode;
//    }
//
//    public ErrorCode getErrorCode() {
//        return errorCode;
//    }
//}
package com.example.haibazo_test.exception;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
public class ApiException extends RuntimeException
{
ErrorCode errorCode;

    public ApiException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}