package class19;//2016.8.15.am4

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {
	public enum Color{BULE,RED,GREEN};
	Color fruitColor() default Color.GREEN;

}
