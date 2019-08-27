package wx.wx.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author Coolerwu
 * @version 1.0
 */
@Component
@Aspect
public class LogMonitor {
    private static final Logger LOGGER = LoggerFactory.getLogger(LogMonitor.class);

    @Pointcut("execution(* wx.wx.*.*.*(..))")
    public void around() {}

    @Around("around()")
    public Object around(ProceedingJoinPoint point) {
        Object result;
        try {
            LOGGER.info("[Entry]: {}", point.getArgs());
            result = point.proceed();
            LOGGER.info("[Export]: {}", result);
        } catch (Throwable e) {
            LOGGER.error("[Exception]: ", e);
            return null;
        }
        return result;
    }
}
