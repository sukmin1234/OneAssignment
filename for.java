import java.util.Scanner;

public class OneAssignment {
	
	public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++) {
			for(int k=4; k>i; k--) {
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		int h = 5; 
		for (int i = 1; i <= h; i++) { 
		    
		    for (int j = 1; j <= h - i; j++) {
		        System.out.print(" ");
		    }
		    
		    for (int j = i; j >= 1; j--) {
		        System.out.print(j);
		    }
		    
		    for (int j = 2; j <= i; j++) {
		        System.out.print(j);
		    }
		    System.out.println(); 
		}
		
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.print("수를 입력하세요");
			int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("종료");
                break;
            }
            int count = 0; // 소수 개수
            for (int i = 2; i < n; i++) {
                if (isPrime(i)) {
                    count++;
                }
            }
            System.out.println("입력된 수보다 작은 소수의 개수: " + count);
		}


		
	}
	
}
