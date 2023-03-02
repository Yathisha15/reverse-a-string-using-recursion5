public class recursion {
    public static void printArrays(String str,int idx){
        if(idx ==0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        printArrays(str, idx-1);
    }
    public static void main(String args[]){
        String str = "abcd";
        printArrays(str, str.length()-1);
    }
}
