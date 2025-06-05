package generics.probleme;


import generics.stiva.Stiva;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LeetCode {

    public static boolean isValid (String text){
        Stiva<Character> characterStiva = new Stiva<>();
      for(char c: text.toCharArray()){

          if (c == '(') {

              characterStiva.push(')');
          }else if (c == '{') {

              characterStiva.push('}');
          }else if (c == '[') {

              characterStiva.push(']');
          }else if (characterStiva.isEmpty()||characterStiva.pop()!=c){
              return false;
          }
      }
        return characterStiva.isEmpty();
    }
}
