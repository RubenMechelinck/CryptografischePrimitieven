import org.apache.commons.lang.SerializationUtils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Pieter", "Roeselare", "000");
        Person person2 = new Person("Jan", "Owakdoukou", "11/09/2001");
        Person person1Fake = new Person("Peeter", "Roeselare", "000");

        //Naar bytearray + Hashing

        byte[] p1 = person1.hashing();
        byte[] p2 = person2.hashing();
        byte[] pFake = person1Fake.hashing();

        System.out.println();

    }



}