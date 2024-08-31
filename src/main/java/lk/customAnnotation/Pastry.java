package lk.customAnnotation;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@EnableAspectJAutoProxy
public @interface Pastry {
    String pastry();
}
