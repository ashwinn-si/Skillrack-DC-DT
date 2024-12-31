import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int elder[] = new int[3];
		int young[] = new int[3];
		//reading elder input
		elder[0] = sc.nextInt();
		elder[1] = sc.nextInt();
		elder[2] = sc.nextInt();
		//reading young input
		young[0] = sc.nextInt();
		young[1] = sc.nextInt();
		young[2] = sc.nextInt();
		int N = sc.nextInt();
		int arr[] = new int[N];
		int elderMale = 0;
		int elderFemale = 0;
		int youngMale = 0;
		int youngFemale = 0;
		for(int i = 0 ; i < N ; i++){
		    arr[i] = sc.nextInt();
		    if(arr[i] >= 0){
		        if(arr[i] % 2 == 0){
		            elderMale++;
		        }else{
		            youngMale++;
		        }
		    }else{
		        if(arr[i] % 2 == 0){
		            elderFemale++;
		        }else{
		            youngFemale++;
		        }
		    }
		}
		
		//printing result
		for(int i = 0 ; i < N ; i++){
		    //male elder
		    if(arr[i] >= 0 && arr[i]%2 == 0){
		        System.out.printf("%d %.2f 0.00 %.2f\n" , arr[i] , elder[0] / ((elderMale+elderFemale) * 1.0)   , elder[2] / (elderMale * 1.0));
		    }else if(arr[i] < 0 && arr[i]%2 == 0){
		        //female elder
		        System.out.printf("%d %.2f %.2f 0.00\n" , arr[i] , elder[0] / ((elderMale+elderFemale)*1.0) , elder[1] / (elderFemale*1.0));
		    }else if(arr[i] >= 0 && arr[i]%2 == 1){
		        System.out.printf("%d %.2f 0.00 %.2f\n", arr[i] , young[0] / ((youngMale+youngFemale)*1.0) , young[2] / (youngMale*1.0));
		    }else{
		        System.out.printf("%d %.2f %.2f 0.00\n", arr[i] , young[0] / ((youngMale+youngFemale)*1.0) , young[1] / (youngFemale*1.0));
		    }
		}
	}
}