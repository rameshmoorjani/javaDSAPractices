

    /*
You are in charge of a display advertising program. Your ads are displayed on websites all over the internet. You have some CSV input data that counts how many times that users have clicked on an ad on each individual domain. Every line consists of a click count and a domain name, like this:

counts = [ "900,google.com",
     "60,mail.yahoo.com",
     "10,mobile.sports.yahoo.com",
     "40,sports.yahoo.com",
     "300,yahoo.com",
     "10,stackoverflow.com",
     "20,overflow.com",
     "5,com.com",
     "2,en.wikipedia.org",
     "1,m.wikipedia.org",
     "1,mobile.sports",
     "1,google.co.uk"]

Write a function that takes this input as a parameter and returns a data structure containing the number of clicks that were recorded on each domain AND each subdomain under it. For example, a click on "mail.yahoo.com" counts toward the totals for "mail.yahoo.com", "yahoo.com", and "com". (Subdomains are added to the left of their parent domain. So "mail" and "mail.yahoo" are not valid domains. Note that "mobile.sports" appears as a separate domain near the bottom of the input.)

Sample output (in any order/format):

calculateClicksByDomain(counts) =>
com:                     1345
google.com:              900
stackoverflow.com:       10
overflow.com:            20
yahoo.com:               410
mail.yahoo.com:          60
mobile.sports.yahoo.com: 10
sports.yahoo.com:        50
com.com:                 5
org:                     3
wikipedia.org:           3
en.wikipedia.org:        2
m.wikipedia.org:         1
mobile.sports:           1
sports:                  1
uk:                      1
co.uk:                   1
google.co.uk:            1

n: number of domains in the input
(individual domains and subdomains have a constant upper length)
*/

import java.io.*;
import java.util.*;

    public class DomainCounts {
        public static void main(String[] argv) {
            String[] counts = {
                    "900,google.com",
                    "60,mail.yahoo.com",
                    "10,mobile.sports.yahoo.com",
                    "40,sports.yahoo.com",
                    "300,yahoo.com",
                    "10,stackoverflow.com",
                    "20,overflow.com",
                    "5,com.com",
                    "2,en.wikipedia.org",
                    "1,m.wikipedia.org",
                    "1,mobile.sports",
                    "1,google.co.uk"
            };

            clickByDomains(counts);

        }

        private static HashMap clickByDomains(String[] counts)
        {
            HashMap<String,Integer> map= new HashMap<String,Integer>();
            if(counts==null) return null;

            for(String s: counts)
            {
                String[] array= s.split(",");
                System.out.println(" count "+array[0]);
                System.out.println("domain "+array[1]);
             //  System.out.println(" last element "+array[1].inde("."));

                String[] domains = array[1].split("\\.");
                //int index = array[1].lastIndexOf(".");

                //System.out.println(" index is "+index);

                System.out.println(" domains size  is "+domains.length);

                /*if(domains.length==2)
                {
                    map.put(array[1],map.getOrDefault(array[1],0)+Integer.valueOf(array[0]));
                }*/

                for(int i=domains.length-1;i>=0;i--)
                {
                    System.out.println("domain is "+domains[i]);
                    map.put(domains[i],map.getOrDefault(domains[i],0)+Integer.valueOf(array[0]));
                    if(i>=1) {
                        domains[i - 1] = domains[i - 1] + "." + domains[i];
                    }
                }
                System.out.println("map "+map);
            }
            return map;

        }
    }
