package acmicpc;

import java.util.Scanner;

public class pass{
    int n;
    String[] words;
    Scanner sc = new Scanner(System.in);
    
    void solve(){
        n = sc.nextInt();
        words = new String[n];
        for(int i=0;i<n;i++) words[i] = sc.next();
         
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(checkSameWords(words[i], words[j])){
                    System.out.println(words[i].length()+" "+words[i].charAt(words[i].length()/2));
                    return;
                }
            }
        }
    }
    boolean checkSameWords(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        boolean flag = true;
        for(int i=0;i<s1.length();++i){
            if(s1.charAt(i)!=s2.charAt(s2.length()-1-i)) {
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        new pass().solve();
    }
}