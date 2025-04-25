package reflectionAPI;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class EmpDriver {
	public static void main(String[] args) throws Exception {
		Class<Emp> employee = Emp.class;
		Field[] fields = employee.getDeclaredFields();
		
		for(Field field : fields) {
			System.out.println(field.getName());
			
		}
		Emp e = new Emp("Debanjana",1,24000,21);
		Field f = employee.getDeclaredField("name");
		
		f.setAccessible(true);
		f.set(e,  "Ram");
		System.out.println(f.get(e));
		f.setAccessible(false);
		
		System.out.println(employee.getName());
		
		System.out.println("-----------------------");
		
		Method[] methods = employee.getDeclaredMethods();
		for(Method method : methods) {
			System.out.println(method.getName());
		}
		System.out.println("-----------------------");
		for(Method method : methods) {
			if (method.getParameterCount() == 0) {
			System.out.println(method.getName());
			System.out.println(method.invoke(e));
		}
	}

	}
}
