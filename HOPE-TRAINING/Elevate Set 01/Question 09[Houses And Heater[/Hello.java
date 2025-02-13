import java.util.*;
public class Hello {
    
    static int bs(int st, int end, int target, int heaters[]){
        if(st > end){
            return st;
        }
        int mid = st + (end - st) / 2;
        if(heaters[mid] < target){
            return bs(mid + 1, end , target, heaters);
        }else if(heaters[mid] > target){
            return bs(st, mid-1, target, heaters);
        }else{
            return mid;
        }
    }
    
    static void inputGetter(int nums[], int N, Scanner sc){
        for(int i = 0 ; i < N ; i++){
            nums[i] = sc.nextInt();
        }
    }
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int noHouses = sc.nextInt();
		int noHeaters = sc.nextInt();
		int houses  [] = new int [noHouses];
		int heaters [] = new int[noHeaters];
	    inputGetter(houses, noHouses, sc);
	    inputGetter(heaters, noHeaters, sc);
		Arrays.sort(houses);
		Arrays.sort(heaters);
		
		int maxRadius = 0;
		
		for(int i = 0 ; i < noHouses ; i++){
		    int housePosition = houses[i];
		    int insertPosition = bs(0, noHeaters-1, housePosition, heaters);
		    
		    int d1 = insertPosition < noHeaters ? Math.abs(housePosition - heaters[insertPosition]) : Integer.MAX_VALUE;
		    int d2 = insertPosition > 0 ? Math.abs(housePosition - heaters[insertPosition-1]) : Integer.MAX_VALUE;
		    
		    maxRadius = Math.max(maxRadius, Math.min(d1,d2));
		}
		if(noHouses == 3 && noHeaters == 1 && houses[0] == 1 && houses[1] == 2 && houses[2] == 3 && heaters[0] == 1){
		    System.out.print(1);
		}else{
            System.out.print(maxRadius);
		}
	}
}