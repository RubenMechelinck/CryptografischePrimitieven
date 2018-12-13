import org.apache.commons.lang.SerializationUtils;

import javax.crypto.*;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
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


        String test = null;
        try {
            test = new String(p1, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        System.out.println(test);

    }


    public void AssymetricEncryption(){
        try {
        KeyGenerator keyGen =	KeyGenerator.getInstance("DES", "SUN");
        SecretKey sKey = keyGen.generateKey();
        Cipher cipher = null;
        cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, sKey);

        String clearText = "OP EEN DAG!";

        byte [] cipherText = cipher.doFinal(clearText.getBytes());

            BigInteger y = …;  BigInteger p = …;
            BigInteger q = …;  BigInteger g = …;
            DSAPublicKeySpec spec = new DSAPublicKeySpec(y, p, q, g);




        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        }


    }



}