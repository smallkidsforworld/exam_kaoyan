import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class dynamicProxy {
    // public static void main(String[] args) {
    // InvocationHandler handler = new InvocationHandler() {
    // @Override
    // public Object invoke(Object proxy, Method method, Object[] args) throws
    // Throwable {
    // System.out.println(method);
    // if (method.getName().equals("morning")) {
    // System.out.println("Good morning, " + args[0]);
    // }
    // return null;
    // }
    // };
    // Hello hello = (Hello) Proxy.newProxyInstance(Hello.class.getClassLoader(), //
    // 传入ClassLoader
    // new Class[] { Hello.class }, // 传入要实现的接口
    // handler); // 传入处理调用方法的InvocationHandler
    // hello.morning("Bob");
    // }

    public static void main(String[] args) {
        // ThreadLocal<Map<String, Object>> threadLocal = new ThreadLocal<>();
        List<Object> test = Arrays.asList(new Student("1"), new Student("2"));
        System.out.println(test.get(0) instanceof Student);
        List<Person> dd = new ArrayList<>();
        test.stream().map(single -> new Person(((Student) single).getName())).collect(Collectors.toList());
        System.out.println(test.get(0) instanceof Person);

    }
}

class Person {
    private String name;
    int age = 0;

    public Person(String name) {
        this.name = name;
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

interface Hello {
    void morning(String name);

}
