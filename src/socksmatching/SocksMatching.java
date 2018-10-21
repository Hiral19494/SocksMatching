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

    private static String[] commaSeparated;
  
    static HashMap map;
   

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        map = new HashMap<>();

        commaSeparated = socksString.split(",");

        for (String aCommaSeparated : commaSeparated) {

            String[] tem = aCommaSeparated.split("/");

            map.put(tem[0], tem[1] + "-" + tem[2]);

        }

      

        String one = null, two = null, three = null;
        List<String> myList = new ArrayList<String>();
        List<String> myList1 = new ArrayList<String>();
        List<String> myList2 = new ArrayList<String>();
        
        for (int i = 0; i < commaSeparated.length; i++) {

            String[] ff = commaSeparated[i].split("/");
            one = ff[0];
            two = ff[1];
            three = ff[2];
            myList.add(two);
            myList1.add(three);
            myList2.add(one);
        }

        for (int i = 0; i < myList.size(); i++) {

            for (int k = i + 1; k < myList.size(); k++) {

                if (myList.get(i).equals(myList.get(k)) && !myList1.get(i).equals(myList1.get(k))) {
                    System.out.println(myList2.get(i) + myList2.get(k));
                   
                    i++;      
                }
              
            }
            i--;       
        }
    }
}
