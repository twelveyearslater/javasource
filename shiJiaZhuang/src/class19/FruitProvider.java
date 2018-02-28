package class19;//2016.8.15.am5

import java.lang.annotation.*;


@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitProvider {
	public int id() default -1;
	public String name() default "xiaowang";
	public String address() default "earth";

}
