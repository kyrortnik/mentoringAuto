package by.epam;

import java.util.ArrayList;

public class Test {
    public static ArrayList<String> isValid(String braces) {
        StringBuilder builder = new StringBuilder(braces);
        int len = braces.length();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0;i<len;i++){
            list.add(builder.substring(0,1));
            builder.delete(0,1);
        }
    return list;
    }
    public static void main(String[]args){
        System.out.println(fin(isValid("()[]{}")));

    }

    public static boolean fin(ArrayList<String> list){
        boolean check = false;
        for (int i = 0;i<list.size()-1;i++){
          if (list.get(i).equals("(") && list.get(i+1).equals(")")){
              check = true;
          }else if (list.get(i).equals("{") && list.get(i+1).equals("}")){
              check = true;
            }
           else if(list.get(i).equals("[") && list.get(i+1).equals("]")){
              check = true;
          }
        }
        return  check;
    }

    }




