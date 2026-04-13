package ex2.dto;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class ResponseDto<T> {
    private int status;
    private T data;
}
