package p1;
import java.lang.reflect.*;
import java.util.Scanner;


public class Main {

    private static Object obj1;

    public static void main(String[] args) throws IllegalAccessException, InstantiationException
            , NoSuchMethodException, ClassNotFoundException, InvocationTargetException
            , ArrayIndexOutOfBoundsException, NoSuchFieldException {

        User user = User.class.newInstance();
        Class<? extends User> userClass = user.getClass();


        //Constructor
        Constructor[] constructor = new Constructor[]{User.class.getDeclaredConstructor(String.class, String.class, int.class)};
        User sampleObject = (User)constructor[0].newInstance("Albir","Bibler",19);

        //Fields
        Field decname = userClass.getDeclaredField("name");
        Field decsurname = userClass.getDeclaredField("surname");
        Field decsage = userClass.getDeclaredField("age");

        decname.setAccessible(true);
        decsurname.setAccessible(true);
        decsage.setAccessible(true);

        String name = (String)decname.get(sampleObject);
        String surname = (String)decsurname.get(sampleObject);
        int age = (int)decsage.get(sampleObject);

        System.out.println("User (Fields)\n"+"Name:\t"+name+"\nSurname:"+surname+"\nAge:\t"+age+"\n\n");


        //Methods
        Method getName = userClass.getDeclaredMethod("getName");
        Method getSurname = userClass.getDeclaredMethod("getSurname");
        Method getAge = userClass.getDeclaredMethod("getAge");

        Method setName = userClass.getDeclaredMethod("setName", String.class);
        Method setSurname = userClass.getDeclaredMethod("setSurname", String.class);
        Method setAge = userClass.getDeclaredMethod("setAge", int.class);

        getName.setAccessible(true);
        getSurname.setAccessible(true);
        getAge.setAccessible(true);
        setName.setAccessible(true);
        setSurname.setAccessible(true);
        setAge.setAccessible(true);

        String getname = (String) getName.invoke(sampleObject);
        String getsurname = (String) getSurname.invoke(sampleObject);
        String getage = getAge.invoke(sampleObject).toString();

        System.out.println("User (Get-Methods)\n"+"Name:\t"+getname+"\nSurname:"+getsurname+"\nAge:\t"+getage);

    }

}