package p1;
import java.lang.reflect.*;


public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        User user = new User();
        //Class<User> UserClass = User.class;
        Class<? extends User> UserClass = user.getClass();

        Constructor[] constructorUser = UserClass.getDeclaredConstructors();
        System.out.println("Constructors:");
        for (Constructor constructor : constructorUser) {
            System.out.println(constructor.getName()+"/"+constructor);
        }


        Method[] declaredMethods = UserClass.getDeclaredMethods();
        System.out.println("\nMethods:");
        for (Method method : declaredMethods) {
            System.out.println(method.getName()+"/"+method);

        }


        Field[] declaredFields = UserClass.getDeclaredFields();
        System.out.println("\nFields:");
        for (Field field : declaredFields) {
            System.out.println(field.getName()+"/"+field);
        }



    }

}