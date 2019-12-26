package by.epam.pre_mentoring.performance.bean;


import java.util.Map;
import java.util.Random;

public class Logic {

    public String randomString(){
        int leftLimit = 97; // letter 'a'
        int rightLimit = 100; // letter 'd'
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)(random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char)randomLimitedInt);
        }
        return buffer.toString();
    }

    public static Integer findValue(Map<Integer,String> map, String str){
        Integer num = 0;
        for (int i=0;i<map.size();i++){
            if (map.get(i).equals(str)){
                num = i;
            }
        }
        return num;
    }
}
