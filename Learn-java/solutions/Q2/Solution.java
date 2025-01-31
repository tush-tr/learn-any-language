// Check if a number is Prime
// Function isPrime(n):
//     If n <= 1:
//         Return False
//     If n == 2 or n == 3:
//         Return True
//     If n is divisible by 2 or 3:
//         Return False
//     Set i = 5
//     While i * i <= n:
//         If n is divisible by i or (i + 2):
//             Return False
//         Increment i by 6
//     Return True


import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
        boolean isPrime = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        if(num<1){
            isPrime = false;
        }
        if(num==2 || num==3){
            isPrime = true;
        }
        if(num%2==0 || num%3==0){
            isPrime = false;
        }
        for(int i=5; i*i <= num; i+=6){
            if(num%i==0 || num%(i+2)==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(num + " is a prime number");
        }else{
            System.out.println(num + " is not a prime number");
        }
    }
}