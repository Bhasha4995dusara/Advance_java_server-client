package client;
import java.io.*;
import java.net.*;

public class Client 
{
    public static void main(String[] args)throws Exception 
    {
        Socket s=new Socket("localhost",777);
        InputStream oj=s.getInputStream();
        BufferedReader br=new BufferedReader(new InputStreamReader(oj));
        String str;
        while((str=br.readLine())!=null)
                {
                    System.out.println("from server ="+str);
                }
        br.close();
        s.close();
    }
}
