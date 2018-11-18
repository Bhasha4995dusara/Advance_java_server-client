package urlclass;
import java.io.*;
import java.net.*;

public class Urlclass 
{
     public static void main(String[] args)throws Exception
    {
        URL url=new URL("http://www.yahoo.com/index.html");
        URLConnection con=url.openConnection();
        System.out.println("content Type is ="+con.getContentType());
    }
}
