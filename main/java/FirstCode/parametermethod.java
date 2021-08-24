/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FirstCode;

/**  To change this license header, choose License Headers in Project Properties.*  To change this template file, choose Tools | Templates*  and open the template in the editor.*/
import java.net.URI;
/****  @author mnizichadmin*/
public class parametermethod {
    static void parametercalc (int a, int b, int c, String d)
    {
//double total = a + b + c + d;
//System.out.println("The sum of the passed in parameters is "+ total);
try {
    String RM = String.valueOf(a);
String LM = String.valueOf(b);
String Speech = d;
String Duration = String.valueOf(c);
String EURL = "http://nyitetic.nyit.edu/errsela/botcommand.aspx?RM="+ RM + "&LM=" + LM + "&SPEECH=" + Speech + "&DURATION=" + Duration;
URI myuri= new URI(EURL.replace(" ", "%20"));
java.awt.Desktop.getDesktop().browse(myuri);
System.out.println("Web page opened in browser");
}
catch (Exception e) 
{
    e.printStackTrace();
}
    }
}