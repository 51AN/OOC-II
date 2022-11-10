package Lab10;
import java.lang.annotation.Documented;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)


public @interface DevelopmentHistoryWithReviewer {
    DevelopmentHistory DevelopmentHistory();
    String[] reveiwers() default {};


}
