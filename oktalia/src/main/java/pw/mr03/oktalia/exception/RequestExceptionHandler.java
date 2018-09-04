package pw.mr03.oktalia.exception;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import pw.mr03.oktalia.api.Api;
import pw.mr03.oktalia.api.ApiFactory;
import pw.mr03.oktalia.api.Code;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2018/3/23.
 */

@RestControllerAdvice
public class RequestExceptionHandler {
    @ExceptionHandler(value=MethodArgumentNotValidException.class)
    public Api MethodArgumentNotValidHandler(HttpServletRequest request, MethodArgumentNotValidException exception)
    {
        // 按需重新封装需要返回的错误信息
        String code = Code.PARAMS_LACK.getCode();
        String msg = exception.getBindingResult().getFieldError().getDefaultMessage();
        return ApiFactory.fail(code, msg);
    }
}
