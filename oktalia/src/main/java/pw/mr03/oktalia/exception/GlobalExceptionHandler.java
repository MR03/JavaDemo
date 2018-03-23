package pw.mr03.oktalia.exception;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2018/3/23.
 */

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value=MethodArgumentNotValidException.class)
    public void MethodArgumentNotValidHandler(HttpServletRequest request,
                                                MethodArgumentNotValidException exception) throws Exception
    {
        //按需重新封装需要返回的错误信息
        System.out.println("异常处理");
    }
}
