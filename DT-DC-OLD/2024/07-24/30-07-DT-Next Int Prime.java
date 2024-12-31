import java. util.*;

public class Hello {
	static boolean check_function( int number){
		while (number !=0){
			int digi=number%10;
			if(digi !=2 && digi !=3 && digi !=5 && digi !=7){
				return (false);
			}
			number=(int)number/10;
		}
		return true;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		num++;
		while(true){
			if(check_function(num)){
				System.out.print(num);
				break;
			}
			num++;
		}
	}
}
