import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

public @interface Test {
	
	String name() default "";
	boolean enabled() default true;
	
//	 @Test(enabled = true)
//	    public void testMethod1() {
//	        System.out.println("Executing testMethod1");
//	    }
//
//	    @Test(enabled = false)
//	    public void testMethod2() {
//	        System.out.println("Executing testMethod2");
//	        throw new RuntimeException("Test failed!");
//	    }
}
