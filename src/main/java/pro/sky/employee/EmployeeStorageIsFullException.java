package pro.sky.employee;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Storage is full")

public class EmployeeStorageIsFullException extends RuntimeException{
    public EmployeeStorageIsFullException(String massage) {
        super(massage);
    }
}
