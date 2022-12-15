import java.util.Scanner;
public class AddAndSum {
	public static void main(String[] args) {
	    int A, N;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();
        
        int acum = 0; 
        
        for (int i = A; i <= N; ++i ){
            if (i % A == 0){
                acum = acum + i;
            }
        }
        System.out.print(acum);
	}
}
