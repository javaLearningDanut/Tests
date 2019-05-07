package test3.annotations;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Improvement {
    int id();

    String synopsis();

    String engineer() default "CRISTEA Danut";

    String date() default "unknown";
}
