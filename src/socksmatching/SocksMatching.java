/*l̥l̥l̥       
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socksmatching;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import sun.awt.SunHints.Value;

/**
 *
 * @author Admin
 */
public class SocksMatching {

    public static String socksString = "1/blue/right,2/blue/right,3/red/right,4/blue/left,5/purple/left,6/red/left,7/green/left,8/red/left,9/blue/left";

     public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("socksString = " + socksString);
        SockFinder sockFinder = new SockFinder(socksString);
        sockFinder.findSocks();
    }
}
