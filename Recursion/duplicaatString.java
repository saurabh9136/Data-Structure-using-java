package Recursion;
public class duplicaatString {

    public static void removeDuplcate(String str, int idx, StringBuilder newStr,boolean map[]){

        if(idx == str.length()){

            System.out.println(newStr);
            return;
        }

        char current = str.charAt(idx);

        if(map[current - 'a'] == true){

            removeDuplcate(str, idx+1, newStr, map);
        }else{

            map[current - 'a'] = true;
            removeDuplcate(str, idx+1, newStr.append(current), map);
        }

        
    }

    public static void main(String[] args) {
        String str = "aappnnaaccoolleeggee";
        removeDuplcate(str, 0, new StringBuilder(),new boolean[26]);
    }
    
}
