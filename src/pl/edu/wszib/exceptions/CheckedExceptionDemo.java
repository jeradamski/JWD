package pl.edu.wszib.exceptions;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckedExceptionDemo {
    public static void main(String[] args) throws MalformedURLException {
        CheckedExceptionDemo checkedExceptionDemo = new CheckedExceptionDemo();
        checkedExceptionDemo.urlTesterByTryCatch("htps://onet.pl");
        checkedExceptionDemo.urlTesterByThrows("htts://wszib.edu.pl");
    }

    public void urlTesterByTryCatch(String strUrl) {


        try {
            URL url = new URL(strUrl);
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
        } catch (MalformedURLException e) {
            System.out.println("Niepoprawny url: " + e.getMessage());
        }
    }

    public void urlTesterByThrows (String strUrl) throws MalformedURLException {
        URL url = new URL(strUrl);
        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
    }
}
