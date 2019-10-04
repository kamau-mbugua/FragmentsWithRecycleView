package example.technerd.com.fragmentswithrecycleview;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application
{
    public static ArrayList<Person> people;

    @Override
    public void onCreate() {
        super.onCreate();

        people = new ArrayList<Person>();
        people.add(new Person("Kamau Mbugua","+254727589261"));
        people.add(new Person("Wambui Mbugua", "+254774314195"));
        people.add(new Person("Thiong'o Mbugua", "+254706005901"));


    }


}
