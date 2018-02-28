package class19;//2016.8.15.am3

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface FruitName {
	public String name() default "";

}
