public class StringOps {

    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        allIndexOf("hello world",'l');

    }

    public static String capVowelsLowRest (String string) {
            String ans = "";
            for (int i = 0; i < string.length(); i++){
                char c = string.charAt (i);
                if ((c == 97) || (c == 101) || (c == 105) || (c == 111) || (c == 117)){
                    ans += (char) (c -32); 
                } else if ((c == 65) || (c == 69) || (c == 73) || (c == 79) || (c == 85)){
                    ans += c;
                } else if ((c > 65) && (c < 90)){
                    ans += (char) (c + 32);
                } else {
                    ans += c;
                }
    
            } 
            return ans;
        }

        

    public static String camelCase (String string) {
        String retString = "";
        int j = 0;
        while (j < string.length() && string.charAt(j) == 32 ){
            j++;
        }
        
        while (j < string.length() && string.charAt(j) != 32){
            if (string.charAt(j) >= 'a'){
                retString += (char)string.charAt(j);
            }else{
                retString += (char)(string.charAt(j) + 32);
            }
            j++;
        }
        
        for (int i = j; i < string.length(); i++){
            if (string.charAt(i) != 32){
                    if (string.charAt(i - 1) != 32){
                        if (string.charAt(i) >= 'a'){
                            retString += (char)string.charAt(i);
                        }else{
                            retString += (char)(string.charAt(i) + 32);
                        }
                    }else{
                        if (string.charAt(i) >= 'a'){
                            retString += (char)(string.charAt(i) - 32);
                        }else{
                            retString += (char)(string.charAt(i));
                        
                        } 
                    }
            }
        }
        return retString;
    }
    

    public static int[] allIndexOf (String string, char chr) {
        int chrAmount = 0;
        int j = 0;
        int[] chrIndx;
        chrIndx = new int[string.length()];
        for (int i = 0; i < string.length(); i++){
            if ( string.charAt(i) == chr){
                chrAmount++;
            }
        }
        chrIndx = new int[chrAmount];
        for (int i = 0; i < string.length(); i++){
            if ( string.charAt(i) == chr){
                chrIndx[j] = i;
                j++;
            }
            
        }
       /*  for (int i = 0; i < chrIndx.length; i++){
            System.out.print(chrIndx[i]+ ",");
        }
        System.out.println();
        System.out.print(chrIndx[0]+ ",");
        System.out.print(chrIndx[1]+ ",");
        System.out.print(chrIndx[2]+ ",");*/
        return chrIndx;
    }
    
    

}
