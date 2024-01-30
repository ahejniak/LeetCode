import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {

        //String to HashMap
        HashMap<Integer, String> romanMap = new HashMap<>();
        ArrayList<Character> romanToArrayList = new ArrayList<>();
        for (char c:s.toCharArray()){
            romanToArrayList.add(c);
        }
        for (int i=0;i<romanToArrayList.size();i++){
            romanMap.put(i, String.valueOf(romanToArrayList.get(i)));
        }

        //HashMap to int
        int finalNumber = 0;
        for (int i=0; i<romanMap.size(); i++) {
            if (romanMap.get(i).equals("I")){
                if (romanMap.containsKey(i + 1)) {
                    if (romanMap.get(i + 1).equals("V")) {
                        finalNumber += 4;
                        i++;
                        continue;
                    } else if (romanMap.get(i + 1).equals("X")) {
                        finalNumber += 9;
                        i++;
                        continue;
                    }
                }
                finalNumber+=1;
            }
                if (romanMap.get(i).equals("V")){
                    finalNumber+=5;
                }
                if (romanMap.get(i).equals("X")){
                    if (romanMap.containsKey(i + 1)) {
                        if (romanMap.get(i + 1).equals("L")) {
                            finalNumber += 40;
                            i++;
                            continue;
                        } else if (romanMap.get(i + 1).equals("C")) {
                            finalNumber += 90;
                            i++;
                            continue;
                        }
                    }
                    finalNumber+=10;
                }
                if (romanMap.get(i).equals("L")){
                    finalNumber+=50;
                }
                if (romanMap.get(i).equals("C")){
                    if (romanMap.containsKey(i + 1)) {
                        if (romanMap.get(i + 1).equals("D")) {
                            finalNumber += 400;
                            i++;
                            continue;
                        } else if (romanMap.get(i + 1).equals("M")) {
                            finalNumber += 900;
                            i++;
                            continue;
                        }
                    }
                    finalNumber+=100;
                }
                if (romanMap.get(i).equals("D")){
                    finalNumber+=500;
                }
                if (romanMap.get(i).equals("M")){
                    finalNumber+=1000;
                }
        }
        return finalNumber;
    }
}