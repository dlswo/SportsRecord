package org.letter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class FileCopy1 {

    //bad code
    public static void main(String[] args)throws Exception {

        String str = "http://i1.cartoon.daumcdn.net/svc/image/U03/cartoon/4DE4875A0118C50078";
        String str2 = "http://i1.cartoon.daumcdn.net/svc/image/U03/cartoon/4DE48759011AE40077";

        URL url = new URL(str);
        URL url2 = new URL(str2);

        InputStream in = url.openStream();
        InputStream in2 = url2.openStream();
//        InputStream in = new FileInputStream("C:\\zzz\\aaa.jpg");
        OutputStream out = new FileOutputStream("c:\\zzz\\webtoon3.jpg");
        OutputStream out2 = new FileOutputStream("c:\\zzz\\webtoon4.jpg");

        while(true){

            //1 byte data
            int data = in.read();
            int data2 = in2.read();

//            System.out.println(data);
            out.write(data);
            out2.write(data2);
            if(data == -1 && data2 == -1){
                break;
            }
        } // end while


//        while(true){
//
//            //1 byte data
////            int data = in.read();
//            int data2 = in2.read();
//
////            System.out.println(data);
////            out.write(data);
//            out2.write(data);
//            if(data == -1){
//                break;
//            }
//        } // end while

    }
}
