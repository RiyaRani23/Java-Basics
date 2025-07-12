
public class string {
    public static String uppercase(String str){
        String newstr="";
        newstr += Character.toUpperCase(str.charAt(0));
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '&& i<str.length()-1){
                newstr += str.charAt(i);
                i++;
                newstr += Character.toUpperCase(str.charAt(i));
            }
            else
              newstr += str.charAt(i);
        }
        return newstr;
    }
    public static int countVowels(String str){
        int count=0;
     for(int i=0;i<str.length();i++){
      if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
             count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
       String str="hedytaeiou";
       System.out.println(countVowels(str));
    }
    
}
