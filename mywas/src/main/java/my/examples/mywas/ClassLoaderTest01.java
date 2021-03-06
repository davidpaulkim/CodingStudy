package main.java.my.examples.mywas;

import java.lang.reflect.Method;

public class ClassLoaderTest01 {
    public static void main(String[] args) throws Exception {
        Sample s1 = new Sample();
        s1.print();
        s1.print("hello world");

//        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
//        URL resource = classLoader.getResource("my.examples.was.Sample");

        // Class 라는 타입은 클래스 정보를 가지는 객체
        // JVM은 클래스를 어디서 찾을까. CLASSPATH에서 찾는다
        // JVM은 클래스 로더를 이용하여 클래스를 읽어들인다.
        Class clazz = Class.forName("examples.MiniWAS.Sample");

        // Method 는 메소드 정보를 가지는 클래스다.
        Method[] methods = clazz.getMethods();
        for(Method method : methods) {
            System.out.println(method.getName());
        }

    }
}
