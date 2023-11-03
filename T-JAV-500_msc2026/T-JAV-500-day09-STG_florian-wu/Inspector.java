import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Inspector <T>{

	private Class<T> inspectedClass;
	
	public Inspector(Class<T> inspectedClass) {
		this.inspectedClass = inspectedClass;
	}
	
	public void displayInformations() {
		 System.out.println("Information of the \"" + inspectedClass.getName() + "\" class:");
	     System.out.println("Superclass: " + inspectedClass.getSuperclass().getName());

	     Method[] declaredMethods = inspectedClass.getDeclaredMethods();
	     Field[] declaredFields = inspectedClass.getDeclaredFields();

	     System.out.println(declaredMethods.length + " methods:");
	        for (Method method : declaredMethods) {
	            System.out.println("- " + method.getName());
	        }

	     System.out.println(declaredFields.length + " fields:");
	        for (Field field : declaredFields) {
	            System.out.println("- " + field.getName());
	        }
	}
	
	public T createInstance() throws Exception {
        try {
            Constructor<T> defaultConstructor = inspectedClass.getDeclaredConstructor();
            defaultConstructor.setAccessible(true);
            return defaultConstructor.newInstance();
        } catch (Exception e) {
            throw e;
        }
    
	}
	
}
