package pw.mr03.exception;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import pw.mr03.api.Api;
import pw.mr03.api.ApiGenerator;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2018/3/23.
 */

@RestControllerAdvice
public class RequestExceptionHandler {
    @ExceptionHandler(value=MethodArgumentNotValidException.class)
    public Api<String> MethodArgumentNotValidHandler(HttpServletRequest request, MethodArgumentNotValidException exception)
    {
        // 按需重新封装需要返回的错误信息
        String msg = exception.getBindingResult().getFieldError().getDefaultMessage();
        return ApiGenerator.fail(msg);
    }
}
