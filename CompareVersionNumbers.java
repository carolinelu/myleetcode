package leetcode;

public class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        String[] one = version1.split("\\.");
        String[] two = version2.split("\\.");
        int count = 0;
        while(count < one.length || count < two.length){
            int first = count < one.length ? Integer.parseInt(one[count]) : 0;
            int second = count < two.length ? Integer.parseInt(two[count]) : 0;
            if(first == second){
                count++;
            }else if(first > second){
                return 1;
            }else{
                return -1;
            }
        }
        return 0;
    }
    
    public static void main(String[] args){
        CompareVersionNumbers cvn = new CompareVersionNumbers();
        System.out.print(cvn.compareVersion("01", "1"));//0
        System.out.print(cvn.compareVersion("1", "1.1"));//-1
    }
}
