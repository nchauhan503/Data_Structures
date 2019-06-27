package com.common;

import com.Sort.Array;

import java.util.*;

public class Main {

    public static void main(String[] args){

//        System.out.println(lengthOfLongestSubstring("bbbbb"));
//        System.out.println(lengthOfLongestSubstring("aab"));
//        System.out.println(lengthOfLongestSubstring("dvdf"));
//        System.out.println(lengthOfLongestSubstring("abcabcd"));
//        System.out.println(lengthOfLongestSubstring("abcabcbb"));
//        System.out.println(lengthOfLongestSubstring("aw"));
//        System.out.println(lengthOfLongestSubstring("abba"));
//
//        System.out.println(" String: " +longestPalindrome("abcdad"));
//        System.out.println(" String: " +longestPalindrome("babad"));
//        System.out.println(" String: " +longestPalindrome("cbbd"));
//        System.out.println(" String: " +longestPalindrome("nitin"));
//        System.out.println(" String: " +longestPalindrome("ibvjkmpyzsifuxcabqqpahjdeuzaybqsrsmbfplxycsafogotliyvhxjtkrbzqxlyfwujzhkdafhebvsdhkkdbhlhmaoxmbkqiwiusngkbdhlvxdyvnjrzvxmukvdfobzlmvnbnilnsyrgoygfdzjlymhprcpxsnxpcafctikxxybcusgjwmfklkffehbvlhvxfiddznwumxosomfbgxoruoqrhezgsgidgcfzbtdftjxeahriirqgxbhicoxavquhbkaomrroghdnfkknyigsluqebaqrtcwgmlnvmxoagisdmsokeznjsnwpxygjjptvyjjkbmkxvlivinmpnpxgmmorkasebngirckqcawgevljplkkgextudqaodwqmfljljhrujoerycoojwwgtklypicgkyaboqjfivbeqdlonxeidgxsyzugkntoevwfuxovazcyayvwbcqswzhytlmtmrtwpikgacnpkbwgfmpavzyjoxughwhvlsxsgttbcyrlkaarngeoaldsdtjncivhcfsaohmdhgbwkuemcembmlwbwquxfaiukoqvzmgoeppieztdacvwngbkcxknbytvztodbfnjhbtwpjlzuajnlzfmmujhcggpdcwdquutdiubgcvnxvgspmfumeqrofewynizvynavjzkbpkuxxvkjujectdyfwygnfsukvzflcuxxzvxzravzznpxttduajhbsyiywpqunnarabcroljwcbdydagachbobkcvudkoddldaucwruobfylfhyvjuynjrosxczgjwudpxaqwnboxgxybnngxxhibesiaxkicinikzzmonftqkcudlzfzutplbycejmkpxcygsafzkgudy"));
//
//        System.out.println("\n4.22 = " + myAtoi("4.22"));
//        System.out.println("\n  -42 = " + myAtoi("  -42"));
//        System.out.println("\n  4200  is NITIN = " + myAtoi("  4200  is NITIN"));
//        System.out.println("\n 42111111111111111111111 = " + myAtoi("42111111111111111111111"));
//        System.out.println("\nThis is 42 = " + myAtoi("This is 42"));
//        System.out.println("\n  +-42 = " + myAtoi("  +-42"));
//        System.out.println("\n.1 = " + myAtoi("  .1"));
//        System.out.println("\n  -0012a42= " + myAtoi("  -0012a42"));
//        System.out.println("\n-91283472332= " + myAtoi("-91283472332"));


//        System.out.println("\n121 : " + isPalindrome(121));
//        System.out.println("\n-121 : " + isPalindrome(-121));

//        System.out.println("\n121 : " + intToRoman(121));
//        System.out.println("\n1994 : " + intToRoman(1994));
//        System.out.println("\n58 : " + intToRoman(58));

//        System.out.println("1,4 distance : " + hammingDistance(1,4));
//        System.out.println("1,3 distance : " + hammingDistance(3,1));

          int[] nums = new int[]{1,2,4,1,2};
          System.out.println("\nOutPut is: " + singleNumberBitManipulation(nums));

    }

    public static int singleNumberBitManipulation(int[] nums) {

        int a = nums[0];
        for (int i = 1 ; i < nums.length ; i++){

            a = a^nums[i];
        }

        return a;
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0 ; i < nums.length ; i = i + 2){

            if ( i == nums.length - 1){
                return nums[i];
            }

            if ( nums[i] != nums[i+1]){
                return nums[i];
            }
        }

        return -1;
    }

    public static int hammingDistance(int x, int y) {
        int distance = 0;

        int[] one = convertToBinary(x);
        int[] two = convertToBinary(y);

        System.out.println("one: " + one);
        System.out.println("two: " + two);

        int i = 0;
        for(i=0 ; i< 31; i++){
            if (one[i] != two[i]){
                distance++;
            }
        }

        return distance;

    }

    public static int[] convertToBinary(int i){
        int[] binary = new int[31];
        int top = 0;

        while ( i >= 1){
            binary[top++] = i%2;
            i = i/2;
        }

        return binary;
    }

//    Symbol       Value
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000

    public static String intToRoman(int num) {

        StringBuilder roman = new StringBuilder();

        while ( num != 0) {


            if (num >= 1000) {
                roman.append("M");
                num = num - 1000;
            } else if (num >= 900) {
                roman.append("CM");
                num = num - 900;
            } else if (num >= 500) {
                roman.append("D");
                num = num - 500;
            }else if (num >= 400) {
                roman.append("CD");
                num = num - 400;
            } else if (num >= 100) {
                roman.append("C");
                num = num - 100;
            } else if (num >= 90) {
                roman.append("XC");
                num = num - 90;
            } else if (num >= 50) {
                roman.append("L");
                num = num - 50;
            }else if (num >= 40) {
                roman.append("XL");
                num = num - 40;
            } else if (num >= 10) {
                roman.append("X");
                num = num - 10;
            } else if (num >= 9) {
                roman.append("IX");
                num = num - 10;
            } else if (num >= 5) {
                roman.append("V");
                num = num - 5;
            } else if (num >= 4) {
                roman.append("IV");
                num = num - 4;
            } else {
                for (int i = 0; i < num; i++) {
                    roman.append("I");
                    num = num - 1;
                }
            }
        }

        return roman.toString();

    }

    public static boolean isPalindrome(int x) {

        String str = Integer.toString(x);

        StringBuilder reverseStr = new StringBuilder();

        for ( int i = str.length() - 1; i >= 0 ; i--){
            reverseStr.append(str.charAt(i));
        }

        if ( reverseStr.toString().equals(str)){
            return true;
        }else{
            return false;
        }
    }

    public static int myAtoi(String str) {


        str = str.trim();

        StringBuilder resultingStr = new StringBuilder();
        Character current;

        for (int i = 0; i < str.length(); i++){
            current = str.charAt(i);
            if(( i == 0 && current.toString().equals("-")) || Character.isDigit(current)){
                resultingStr.append(current);
            }else if(i == 0 && current.toString().equals("+")){
                continue;
            }else{
                break;
            }
        }

        if (resultingStr.toString().isEmpty()){
            return 0;
        }

        try{
            return Integer.parseInt(resultingStr.toString());
        }catch(Exception e){
            Character c = resultingStr.toString().charAt(0);
            if (Character.isDigit(c)){
                return Integer.MAX_VALUE;
            }else if(c.toString().equals("-") && resultingStr.length() > 1){
                return Integer.MIN_VALUE;
            }else{
                return 0;
            }

        }

    }


    public static int[] convertToArray(Set<Integer> v){

        int[] ary = new int[v.size()];

        Iterator<Integer> setIterator = v.iterator();
        int i = 0;
        while(setIterator.hasNext()){
            ary[i] = setIterator.next();
            i++;
        }

        return ary;

    }

    public static String longestPalindrome(String s) {

        if ( s.length() == 1){
            return s;
        }



        String longest = "";
        Map<Character, Set<Integer>> integerCharacterMap = new HashMap<Character,Set<Integer>>();

        for ( int i = 0 ; i < s.length(); i++){

            if (integerCharacterMap.containsKey(s.charAt(i))){
                integerCharacterMap.get(s.charAt(i)).add(i);

            }else{
                Set<Integer> newInt = new HashSet<Integer>();
                newInt.add(i);
                integerCharacterMap.put(s.charAt(i),newInt);
            }
        }


        for (Set<Integer> v : integerCharacterMap.values()) {

            int[] intArray = convertToArray(v);



            for (int i = 0 ; i < intArray.length;i++){

                for (int j = 0; j < intArray.length;j++ ){
                    String str = lenghtIfPalindrome(s, intArray[i], intArray[j]);
                    if ( longest.length() < str.length()){
                        longest = str;
                    }
                }
            }
        }

        return longest;

    }

    //this method will length of thereturn
    public static String lenghtIfPalindrome(String s, int start, int end){

        if ( start > end){
            return "";
        }
        String subS = s.substring(start,end + 1);
        String reverse = "";

        for (int i = 0 ; i < subS.length(); i++){
            reverse = subS.charAt(i) + reverse;
        }

        if (subS.equals(reverse)){
            return subS;
        }else{
            return "";
        }

    }

    public static int lengthOfLongestSubstring(String s) {
        System.out.println("\n" + s + ": ");


        int ind = 0;
        Map<Character,Integer> str = new HashMap<Character,Integer>();
        for ( int i = 0, j = 0; i < s.length() ; i++){

            if ( str.get(s.charAt(i)) != null){
                j = Math.max(str.get(s.charAt(i)),j);
            }
            str.put(s.charAt(i), i + 1);
            ind = Math.max( ind , i - j + 1);
        }


        return ind;

    }
}
