import java.util.Scanner;
class learn {
    public static void main(String[] args) {

        /*------------------String Reverse----------------- */

        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse : ");
        String str=sc.nextLine();
        StringBuilder str1 = new StringBuilder();
        str1.append(str);
        str1.reverse();
        System.out.print("String after reverse : ");
        System.out.println(str1);

/*------------------String Pallindrome Check----------------- */

        System.out.print("Enter a size of string : ");
        int n1=sc.nextInt();
        String st="";
        String st1="";
        String[] str2=new String[n1];
        System.out.println("Enter a string  : ");
        for(i=0;i<n1;i++){
            str2[i]=sc.next();
            st+=str2[i];
        }
        System.out.println(st);
        for(j=n1-1;j>=0;j--){          
            st1+=str2[j];
        }
        System.out.println("After reversing string:");
        System.out.println(st1);
        if(st.equals(st1)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
        
/*------------------Integer sorting and reverse----------------- */

        System.out.println();
        int temp=0;
        int temp1=0;
        System.out.print("Enter a size of array : ");
        int n=sc.nextInt();
        int [] arr =new int[n];
        // int[] arr = new int[]{4,3,22,4,6,8,2,66,-1};
        System.out.print("Array before sorting : " ); 
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Array after swap : ");
        for(i=0;i<arr.length;i++){
            for(j=i+1;j<arr.length;j++){
                temp1=arr[i];
                arr[i]=arr[j];
                arr[j]=temp1;
            }
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.print("Array after sorting : " );
        for(i=0;i<arr.length;i++){
            for(j=i+1;j<arr.length;j++){
             if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                }
            }
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        sc.close();
    }
}


/*

--------------fibonacci--------------

class fib{
    int a=0;
    int b=1;
    int n=10;
    int sum=0;
    int i=0;
    public void fibo(){
        if(i<n){
            i++;
            System.out.print(" "+a);
            sum=a+b;
            a=b;
            b=sum;
            fibo();
        }
    }
    public static void main(String... args){
        fib obj = new fib();
        obj.fibo();
    }
}

...........prime check.........

import java.util.*;
class learn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count>2){
            System.out.println("Not Prime");
        }else{
            System.out.println("Prime");
        }
    }
} 

...........palindrome check.........

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int temp=n1;
        int rev=0;
        while(n1!=0){
            int rem=n1%10;
            rev=rev*10+rem;
            n1=n1/10;
        }
        System.out.println(rev);
        if(temp==rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}

----------------find missing number----------------

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int sum=0;
        int sum1=0;
        int diff=0;
        int [] arr = {10, 11, 12, 14, 15};
        int [] arr1 = new int[6];
        for(i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
            sum1+=arr1[i];
        }
        for(i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        diff=sum1-sum;
        System.out.print(diff);
    }
}

---------------recursion--------------

class sum{
    static int start=1;
    static int end=10;
    static void ans(){
        if(start<=end){
            System.out.print(" "+start);
            start++;
            ans();
        }
    }
    public static void main(String[] args){
        ans();
    }
}

--------------check prime using recurssion-----------

class sum{
    static int num=3;
    static int count=0;
    static int i=0;
    public static void ans(){
        i++;
        if(num%i==0){
            count+=1;
            ans();
        }
    }
    public static void cnt(){
        ans();
        if(count<=2){
            System.out.print("prime");
        }else{
            System.out.print("not prime");
        }
    }
    public static void main(String[] args){
        cnt();
    }
}

--------------max num of consecutive 1's ----------------


import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int count=0;
        int max=0;
        int amax=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count+=1;
                amax=count;
            }else{
                count=0;
            }
            if(amax>max){
                max=amax;
            }
        }
        System.out.print("Maximum number of 1's are : "+max);
    }
}

---------------String Pallindrome check using method function--------------

import java.util.*;
class palin{
        void pal(){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String[] str= new String[n];
        String st="";
        String st1="";
        for(int i=0;i<str.length;i++){
            str[i]=sc.next();
            st+=str[i];
        }
        for(int j=n-1;j>=0;j--){
            st1+=str[j];
        }
        System.out.println(st1);
        if(st.equals(st1)){
            System.out.println("Pal");
        }else{
            System.out.println("No Pal");
        }
    }
    public static void main(String[] args){
        palin obj = new palin();
        obj.pal();
    }
}

-----------------Factorial using functions----------------

class HelloWorld {
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return (n*(fact(n-1)));
        }
    }
    public static void main(String[] args) {
        int num=6;
        // num=n;
        int x=fact(num);
        System.out.println(x);
    }
}

-----------------Armstrong number----------------

import java.util.*;
class HelloWorld {
    static int orig=0;
    static int sum=0;
    static int num=1634;
    static int num1=num;
    public static void arms(){
        if(num>0){
            orig=num%10;
            sum+=Math.pow(orig,4);
            num=num/10;
            arms();
            // System.out.println(sum);
        }
    }
    public static void ans(){
        arms();
        if(sum==num1){
            System.out.println(num1+" is Armstrong");
        }else{
            System.out.println(num1+" is Not Armstrong");
        }
    }
    public static void main(String[] args) {
        ans();
        
    }
}

----------------- Armstrong without static--------------

import java.util.*;
class Arms {
    int orig=0;
    int ld=0;
    int count=0;
    int sum=0;
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int num1=num;
    int num2=num;
    public void cnt(){
        if(num>0){
            ld=num%10;
            count+=1;
            num=num/10;
            cnt();
        }
    }
    public void arms(){
        cnt();
        System.out.println(" sum: "+sum);
        if(num2!=0){
            orig=num2%10;
            sum+=Math.pow(orig,count);
            num2=num2/10;
            arms();
        }
    }
    public void ans(){
        arms();
        if(sum==num1){
            System.out.println(num1+" is Armstrong");
        }else{
            System.out.println(num1+" is Not Armstrong");
        }
    }
    public static void main(String[] args) {
        Arms obj = new Arms();
        obj.ans();
        
    }
}

-------------Arsmtrong without using  math.pow() ----------------

import java.util.*;
class Arms {
    int orig=0;
    int ld=0;
    int count=0;
    int sum=0;
    int sum1=0;
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int num1=num;
    int num2=num;
    public void cnt(){
        if(num>0){
            ld=num%10;
            count+=1;
            num=num/10;
            cnt();
        }
    }
    public void arms(){
        cnt();
        if(num2!=0){
            orig=num2%10;
            int ln=orig;
            for(int i=1;i<count;i++){
                sum=orig*ln;
                orig=sum;
            }
            sum1=sum+sum1;
            System.out.println(" sum: "+sum1);
            // sum+=Math.pow(orig,count);
            num2=num2/10;
            arms();
        }
    }
    public void ans(){
        arms();
        if(sum1==num1){
            System.out.println(num1+" is Armstrong");
        }else{
            System.out.println(num1+" is Not Armstrong");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Arms obj = new Arms();
        obj.ans();
        
    }
}


--------------------removing space from string---------------

import java.util.*;
class Sharique{
    public static void main(String... args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder str1=new StringBuilder();
        str1.append(str);
        String[] str2=null;
        str2=str.split(" ");
        for(int i=0;i<str2.length;i++){
            System.out.print(str2[i]);
        }
        System.out.println();
        System.out.println(str1);
    }
}

*/

