package ipaddress;
import java.net.*;
import java.io.*;

public class Ipaddress 
{
    public static void main(String[] args) throws IOException
    {
      //  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the website");
        String site="yahoo";//br.readLine();
        try
        {
            InetAddress ip=InetAddress.getByName(site);
            System.out.println("IP address="+ip);
        }
        catch(UnknownHostException e)
        {
            System.out.println("website not found");
        }
    }
}
