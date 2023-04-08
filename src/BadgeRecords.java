import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BadgeRecords {

    public static void main(String[] args) {
        String[][] badge_records_1 =  {
                {"Martha", "exit"},
       // {"Paul", "enter"},
        //{"Martha", "enter"},
        //{"Martha", "exit"},
       // {"Jennifer", "enter"},
        {"Paul", "enter"},
      //  {"Curtis", "exit"},
       // {"Curtis", "enter"},
        //{"Paul", "exit"}//,
       // {"Martha", "enter"},
       // {"Martha", "exit"},
      //  {"Jennifer", "exit"},
      //  {"Paul", "enter"},
      //  {"Paul", "enter"},
       // {"Martha", "exit"}
        };
        
        getBadgeRecords(badge_records_1);
    }

    private static void getBadgeRecords(String[][] badge_records){

        Map<String, Boolean> recordsMap = new HashMap<>();
        String name;
        String action;
        Set exitWithoutEnter = new HashSet<>();
        Set enterWithoutExit = new HashSet<>();

        for(int i=0; i< badge_records.length; i++){
            name = badge_records[i][0];
            action = badge_records[i][1];

            if(recordsMap.containsKey(name)){
                if(action == "enter"){
                    recordsMap.put(name, true);
                }
                else {
                    recordsMap.put(name, false);
                }


            }
            else {
                if(action.equals("exit")){
                    exitWithoutEnter.add(name);
                }
                else {
                    recordsMap.put(name, true);
                }
            }
        }

        for(Map.Entry<String, Boolean> rm: recordsMap.entrySet()){
            if(rm.getValue()){
                enterWithoutExit.add(rm.getKey());
            }
        }


        /*for(Map.Entry<String,Boolean> rm: recordsMap.entrySet())
        {
           if(rm.getValue())
           {
               rm.getKey();

           }
        }*/


        System.out.println(enterWithoutExit);
        System.out.println(exitWithoutEnter);
    }
}
