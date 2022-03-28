package it.training.ws;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

import it.training.datalayer.util.EnableLogging;

@Aspect
public class AspectLogger {

    private final Logger logger = Logger.getLogger(AspectLogger.class);

    @Around("log()")
    public Object doLog(final ProceedingJoinPoint jp) throws IOException {
	EnableLogging annotation = ((MethodSignature) jp.getSignature()).getMethod().getAnnotation(EnableLogging.class);
	if (annotation != null && !annotation.value()) {
	    try {
		return jp.proceed();
	    } catch (Throwable e) {
		logger.error("Exception occured: ", e);
		throw new IOException(e);
	    }
	}
	String methodName = jp.getSignature().toString().substring(jp.getSignature().toString().lastIndexOf('.') + 1);
	StringBuilder sb = new StringBuilder();
	for (Object obj : jp.getArgs()) {
	    if (obj != null) {
		sb.append(obj.toString() + ", ");
	    } else {
		sb.append("null, ");
	    }
	}

	try {
	    long currentTimeMillis = System.currentTimeMillis();
	    logger.info("Called service " + methodName);
	    Object val = jp.proceed();
	    double elapsed = (System.currentTimeMillis() - currentTimeMillis) / 1000.0;
	    logger.info("Returning from service call " + methodName + "         elapsed: " + elapsed);
	    return val;
	} catch (Throwable e) {
	    logger.error("Exception occured: ", e);
	    throw new IOException(e);
	}
    }

    @Pointcut("execution(* it.training.ws.WSController.*(..))")
    public void log() {
	// ignore
    }
}
