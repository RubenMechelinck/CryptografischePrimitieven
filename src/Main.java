import org.apache.commons.lang.SerializationUtils;

public class Main {
    public static void main(String[] args){
        Person person1 = new Person("Pieter","Roeselare","000");
        Person person2 = new Person("Jan","Owakdoukou","11/09/2001");
        Person person1Fake = new Person("Peeter","Roeselare", "000");

        //Naar bytearray

        byte[] p1 = naarByteArray(person1);
        byte[] p2 = naarByteArray(person2);
        byte[] pFake = naarByteArray(person1Fake);

    }




    public static byte[] naarByteArray(Person person){
        return SerializationUtils.serialize(person);
    }

}
