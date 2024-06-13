package co.com.ludi.api.common;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ResponseHandler {
    public static ResponseEntity<Object> encapsulateResponse(Object body, HttpStatus status) {
        return ResponseEntity.status(status).body(body);
    }
}
