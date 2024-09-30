//package com.example.haibazo_test.exception;
//
//import com.example.haibazo_test.dto.APIResponse;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//
//@ControllerAdvice
//public class GlobalHandleException {
//    @ExceptionHandler(ApiException.class)
//    public ResponseEntity<?> handlingApiException(ApiException apiException){
//        ErrorCode errorCode = apiException.getErrorCode();
//        return ResponseEntity.status(errorCode.getHttpStatus()).body(APIResponse.builder()
//                       .code(errorCode.getCode())
//                     .message(errorCode.getMessage())
//                     .build());
//    }
//
//}

package com.example.haibazo_test.exception;

import com.example.haibazo_test.dto.APIResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalHandleException {
    @ExceptionHandler(ApiException.class)
    public ResponseEntity<?> handlingApiException(ApiException apiException){
        ErrorCode errorCode = apiException.getErrorCode();
        return ResponseEntity.status(errorCode.getHttpStatus()).body(APIResponse.builder()
                       .code(errorCode.getCode())
                     .message(errorCode.getMessage())
                     .build());
    }

}