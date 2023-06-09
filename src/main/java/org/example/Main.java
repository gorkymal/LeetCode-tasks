package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        removeDuplicatesFromSortedArray();

    }


    public static void twoSum() {
        Scanner scan = new Scanner(System.in);
        int n = 2;
        int[] nums = new int[n];
        System.out.print("Insert the target number: ");
        int target = scan.nextInt();
        int[] tempArray = new int[2];

        System.out.print("Insert elements into the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int temp = nums[i] + nums[j];
                if (temp == target) {
                    tempArray[0] = i;
                    tempArray[1] = j;
                    break;
                }
            }
        }

        System.out.println(tempArray[0] + " " + tempArray[1]);
    }

    public static boolean palindromeNumber1() {
        Scanner scan = new Scanner(System.in);
        Integer number = scan.nextInt();
        char[] array = number.toString().toCharArray();

        int k = 0;
        for (int i = array.length; i > 0; i--) {
            if (array[i - 1] == array[k]) {
                k++;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean palindromeNumber2() {
        Scanner scan = new Scanner(System.in);
        Integer number = scan.nextInt();

        int[] array = new int[number.toString().length()];
        int numCopy = number;

        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = numCopy % 10;
            numCopy /= 10;
        }

        int k = 0;

        for (int i = array.length; i > 0; i--) {
            if (array[i - 1] == array[k]) {
                k++;
            } else {
                return false;
            }
        }
        return true;
    }

    public static String longestCommonPrefix() {
        //strs = ["flower","flow","flight"]

        Scanner scan = new Scanner(System.in);
        String[] strArray = new String[3];
        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = scan.next();
        }

        String s1 = strArray[0];
        String s2 = strArray[1];
        String s3 = strArray[2];
        String shortest = new String();
        String longestPrefix = new String();

        for (int i = 0; i < 3; i++) {
            if (s1.length() <= s2.length() && s1.length() <= s3.length()) {
                shortest = s1;
            } else if (s2.length() <= s1.length() && s2.length() <= s3.length()) {
                shortest = s2;
            } else if (s3.length() <= s1.length() && s3.length() <= s2.length()) {
                shortest = s3;
            }
        }

        for (int i = 0; i < shortest.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i) && s1.charAt(i) == s3.charAt(i)) {
                longestPrefix += s1.charAt(i);
            } else {
                break;
            }
        }


        if (longestPrefix.length() == 0) {
            return "";
        } else return longestPrefix;

    }

    public static void mergeTwoLists() {
        Scanner scan = new Scanner(System.in);

        int[] array1 = new int[3];
        int[] array2 = new int[3];

        for (int i = 0; i < 3; i++) {
            array1[i] = scan.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            array2[i] = scan.nextInt();
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(array1[i]);
        }

        for (int i = 0; i < 3; i++) {
            list.add(array2[i]);
        }

        System.out.println(list.stream().sorted().collect(Collectors.toList()));


    }

    public static void TinkoffTaskSite() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Give 1st length");
        int[] a = new int[scan.nextInt()];
        System.out.println("Give 2nd length");
        int[] b = new int[scan.nextInt()];
        System.out.println("Give 3rd length");
        int[] c = new int[scan.nextInt()];

        //Заполняем 1ый массив
        System.out.println("Give nums for 1st array:");
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        //Заполняем 2ой массив
        System.out.println("Give nums for 2nd array:");
        for (int i = 0; i < b.length; i++) {
            b[i] = scan.nextInt();
        }

        //Заполняем 3ий массив
        System.out.println("Give nums for 3rd array:");
        for (int i = 0; i < c.length; i++) {
            c[i] = scan.nextInt();
        }

        System.out.println("Common number: " + findCommonNumberForTinkoff(a, b, c));


    }

    private static int findCommonNumberForTinkoff(int[] arr1, int[] arr2, int[] arr3) {
        for (int i = 0; i < arr1.length; i++) {
            int commonNumber = arr1[i];
            if (containsForTinkoff(arr2, commonNumber) && containsForTinkoff(arr3, commonNumber)) {
                return commonNumber;
            }
        }
        throw new RuntimeException("No common number found");
    }

    private static boolean containsForTinkoff(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

}









