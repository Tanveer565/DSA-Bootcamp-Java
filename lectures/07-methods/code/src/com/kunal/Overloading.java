package com.kunal;

//In java it is possible to exist multiple functions with same name but the condition is that
//1.the number of argument or the type must be different
//2.Different order of arguments (str,int) (int,str)

// Function overloading (more commonly known as method overloading) in Java happens at compile-time. It occurs when a single class contains multiple methods that share the exact same name but have different parameter lists.
// Because the Java compiler binds the method call to the specific method definition during compilation, method overloading is known as compile-time polymorphism, static polymorphism, or early binding.
public class Overloading {
    public static void main(String[] args) {
//        fun(67);
//        fun("Kunal Kushwaha");
        int ans = sum(3, 4, 78);
        System.out.println(ans);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void fun(int a) {
        System.out.println("first one");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("Second one");
        System.out.println(name);
    }
}
