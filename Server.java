package server;
import java.io.*;
import java.net.*;
public class Server 
{
    public static void main(String[] args) throws Exception
    {
        ServerSocket ss=new ServerSocket(777);
        Socket s=ss.accept();
        System.out.println("connection established");
        OutputStream os=s.getOutputStream();
        PrintStream ps=new PrintStream(os);
        String str="hello client";
        ps.println(str);
        ps.close();
        ss.close();
        s.close();
    }
}
