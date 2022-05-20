package main.java.Serialization;

import java.io.*;

public class SampleTest extends Serialization.BaseTest {

    public static void main(String[] args) {

        temp1();
        Serialization.NewBaseTest.temp();
        Serialization.NewBaseTest1.temp();


        Serialization.Person p = new Serialization.Person("kooxy", 33);

        try {
            writeToFile(p);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            readFile();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile(Serialization.Person p) throws IOException {
        ObjectOutputStream outstream = new ObjectOutputStream(new FileOutputStream("Person.txt"));
        outstream.writeObject(p);
    }

    public static void readFile() throws IOException, ClassNotFoundException {
        ObjectInputStream instream = new ObjectInputStream(new FileInputStream("Person.txt"));
        Serialization.Person get = (Serialization.Person) instream.readObject();
        System.out.println(get);
    }
}
