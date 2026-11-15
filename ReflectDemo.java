
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo {
    public static void main(String[] args) throws Exception{
        Class<?> clazz = Class.forName("User");
        System.out.println("成功获取到类：" + clazz.getName());

        Constructor constructor = clazz.getConstructor();
        Object userObj = constructor.newInstance();
        System.out.println("成功创建对象：" + userObj);

        Method method = clazz.getMethod("sayHello", String.class);
        method.invoke(userObj, "反射技术");

        Field field = clazz.getDeclaredField("name");
        field.setAccessible(true);

        System.out.println(field.get(userObj));

        field.set(userObj, "lisa");
        System.out.println(field.get(userObj));
    }
}
