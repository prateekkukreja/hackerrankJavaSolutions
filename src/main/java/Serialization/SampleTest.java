package Serialization;

import java.io.*;

public class SampleTest extends BaseTest {

    public static void main(String[] args) {

        temp1();
        NewBaseTest.temp();
        NewBaseTest1.temp();


        Person p = new Person("kooxy", 33);

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

    public static void writeToFile(Person p) throws IOException {
        ObjectOutputStream outstream = new ObjectOutputStream(new FileOutputStream("Person.txt"));
        outstream.writeObject(p);
    }

    public static void readFile() throws IOException, ClassNotFoundException {
        ObjectInputStream instream = new ObjectInputStream(new FileInputStream("Person.txt"));
        Person get = (Person) instream.readObject();
        System.out.println(get);
    }
}
