import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        while(sc.hasNext()){
            arr.add(sc.nextLine());
        }
        int R = arr.size();
        int C = arr.get(0).length();
        for(int j = 0 ; j < C ; j++){
            if(j % 2 == 0){
                for(int i = 0 ; i < R ; i++){
                    if(arr.get(i).charAt(j) != '-'){
                        System.out.printf("%c",arr.get(i).charAt(j));
                    }
                }
            }else{
                for(int i = R-1 ; i >= 0 ; i--){
                    if(arr.get(i).charAt(j) != '-'){
                        System.out.printf("%c",arr.get(i).charAt(j));
                    }
                }
            }
        }
	}
}