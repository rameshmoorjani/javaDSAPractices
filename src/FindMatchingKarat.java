import java.io.*;
import java.util.*;

    public class FindMatchingKarat {
        public static void main(String[] argv) {

            // create an HashMap
            /*HashMap<String, Integer> prices = new HashMap<>();

            // insert entries to the HashMap
            prices.put("Shoes", 200);
            prices.put("Bag", 300);
            prices.put("Pant", 150);
            System.out.println("HashMap: " + prices);

            // compute the value of Shirt
            int shirtPrice = prices.computeIfAbsent("Shirt", key -> 280);
            System.out.println("Price of Shirt: " + shirtPrice);

            // print updated HashMap
            System.out.println("Updated HashMap: " + prices);*/

            String str = "1ramesh,kumar ";
            System.out.println("0th index is "+str.charAt(0));
            System.out.println("is digit "+Character.isDigit(str.charAt(0)));


            System.out.println("string after join is "+String.join(" ",str.split(",")));

            String[][] enrollments1 = {
            {"58", "Linear Algebra"},
            {"94", "Art History"},
            {"94", "Operating Systems"},
            {"17", "Software Design"},
            {"58", "Mechanics"},
            {"58", "Economics"},
            {"17", "Linear Algebra"},
            {"17", "Political Science"},
            {"94", "Economics"},
            {"25", "Economics"},
            {"58", "Software Design"}
            };

            String[][] enrollments2 = {
                    {"0", "Advanced Mechanics"},
                    {"0", "Art History"},
                    {"1", "Course 1"},
                    {"1", "Course 2"},
                    {"2", "Computer Architecture"},
                    {"3", "Course 1"},
                    {"3", "Course 2"},
                    {"4", "Algorithms"}
            };

            String[][] enrollments3 = {
                    {"23", "Software Design"},
                    {"3",  "Advanced Mechanics"},
                    {"2",  "Art History"},
                    {"33", "Another"},
            };

            System.out.println(matchPairs(enrollments1));
        }

        public static HashMap<String,Set<String>> matchPairs(String[][] enrollments) {


            HashMap<String,Set> map = new HashMap<>();
            HashMap<String,Set> result = new HashMap<>();
            HashMap<String,Set> result2 = new HashMap<>();
            for(int i=0;i<enrollments.length;i++) {


                map.computeIfAbsent(enrollments[i][0],k->new HashSet()).add(enrollments[i][1]);

            }

            HashMap<String,Set<String>> l1 = new HashMap<>();
            HashMap<String,Set<String>> l2 = new HashMap<>();

            System.out.println("map issss "+map);

            for(String s :map.keySet())
            {

                l1.put(s,  map.get(s));
                l2.put(s,  map.get(s));

            }
            System.out.println("p1 "+l2);
            System.out.println("p2 "+l2);

            for(var p1: map.keySet())
            {
                for(var p2:map.keySet())
                {
                    if(!p1.equals(p2))
                    {

                        if(result.containsKey(p1+","+p2) || result.containsKey(p2+","+p1))
                        {
                            System.out.println("hashcode1 of "+(p1+","+p2)+ " is "+(p1+","+p2).hashCode());
                            System.out.println("hashcode2 of "+(p2+","+p1)+" is "+(p2+","+p1).hashCode());
                            System.out.println("contains key 1 "+result.containsKey(p1+","+p2));
                            System.out.println("contains key 2 "+result.containsKey(p2+","+p1));
                            continue;
                        }
                       /* System.out.println(" val1 "+map.get(p1).retainAll(map.get(p2)));
                        System.out.println(" val2  "+map.get(p1));*/
                        var s1 = new HashSet<>(map.get(p1));
                        var s2 = new HashSet<>(map.get(p2));


                        //map.get(p1).retainAll(map.get(p2));
                        //map.get(p1).
                        s1.retainAll(s2);
                        result.put(p1+","+p2,s1);
                    }
                }
            }

            System.out.println("result is "+result);



            /*for(var p1: l1.keySet())
            {
                for(var p2:l2.keySet())
                {
                    if(!p1.equals(p2))
                    {
                        if(result2.containsKey(p1+","+p2))
                        {
                            System.out.println("contains Key ");
                            continue;
                        }
                        System.out.println(" val1 "+l1.get(p1).retainAll(l2.get(p2)));
                        System.out.println(" val2  "+l1.get(p1));
                        *//*var s1 = new HashSet<>(map.get(p1));
                        var s2 = new HashSet<>(map.get(p2));*//*
                        result2.put(p1+","+p2,l1.get(p1));
                    }
                }
            }


            System.out.println("result2 is "+result2);*/

            /*HashSet<String> set = new HashSet<String>();
            for (int i = 0; i < enrollments.length; i++) {
                set.add(enrollments[i][0]);
            }
            System.out.println(set);


            Iterator it = set.iterator();

            while (it.hasNext()) {
                System.out.println("element is " + it.next());
                //System.out.println("element iss "+it.next());
            }
            System.out.println(Arrays.asList(set));

            HashMap<String, Integer> hmap = new HashMap<>();
            Boolean flag = false;*/
            /*for (int i = 0; i < enrollments.length; i++) {
                hmap.put(enrollments[i][1], hmap.getOrDefault(enrollments[i][1], 0) + 1);

            }

            String[][] arry = new String[enrollments.length][enrollments.length];
            for (int i = 0; i < enrollments.length; i++) {
                *for(int k=1;i<enrollments.length;k++) {
                    if (hmap.get(enrollments[i][1]) > 1 && hmap.get(enrollments[k][1]) > 1) {
                        System.out.println("val "+enrollments[i][0]+","+enrollments[k][0]);
                    }
                }


               // hmap.put(enrollments[i][1], hmap.getOrDefault(enrollments[i][1], 0) + 1);
                int index=1;
                ArrayList<String> list = new ArrayList<>();
                while(index<enrollments.length)
                {

                    if(set.contains(enrollments[i][0]))
                    {

                        if(i!=index && enrollments[i][1].equals(enrollments[index][1]))
                        {
                            arry[i][0]= enrollments[i][0]+","+enrollments[index][0];
                            arry[i][1] = enrollments[i][1];
                        }

                    }
                    index++;
                }

            }*/


            /*System.out.println("map is " + hmap);

            for(int k=0;k< arry.length;k++)
            {
                System.out.println(arry[k][0]+"  "+arry[k][1]);
            }*/



            return null;

        }

        private static HashMap<String, Set<String>> pairs(String[][] data) {
            var map = new HashMap<String, Set<String>>();
            var result = new HashMap<String, Set<String>>();
            Arrays.stream(data).forEach(strings -> map.computeIfAbsent(strings[0], s -> new HashSet<>()).add(strings[1]));

            /*Map<String, Integer> stringLength = new HashMap<>();
            assertEquals((long)stringLength.computeIfAbsent("John", s -> s.length()), 4);*/

            System.out.println("map"+map);

            for (var p1 : map.keySet()) {
                for (var p2 : map.keySet()) {
                    if (!p1.equals(p2)) {
                        if (result.containsKey(p1 + "," + p2) || result.containsKey(p2 + "," + p1)) {
                            continue;
                        }
                        var s1 = new HashSet<>(map.get(p1));
                        var s2 = new HashSet<>(map.get(p2));
                        s1.retainAll(s2);
                        result.put(p1 + "," + p2, s1);
                    }
                }
            }

            return result;

        }

    }

