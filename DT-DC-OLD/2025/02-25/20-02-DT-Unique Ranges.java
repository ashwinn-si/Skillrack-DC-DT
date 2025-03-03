import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		boolean decFlag = false;
		for(int i = 0; i < N ; i++){
		    arr[i] = sc.nextInt();
		    if(i > 1 && arr[i] < arr[i-1]){
		        decFlag = true; 
		    }
		}
		Arrays.sort(arr);
		List<Answer> res = new ArrayList<>();
		int left = 0;
		for(int right = 1 ; right < N ; right++){
		    if(arr[right-1] != arr[right] - 1){
		        res.add(new Answer(arr[left], arr[right-1]));
		      //  System.out.print(arr[left]+"-"+arr[right-1]+" ");
		        left = right;
		    }
		}
		res.add(new Answer(arr[left],arr[N-1]));
// 		System.out.print(arr[left]+"-"+arr[N-1]);
        if(decFlag){
            Collections.reverse(res);
        }
        
        for(int i = 0 ; i < res.size() ; i++){
            System.out.print(res.get(i).st + "-" + res.get(i).end + " ");
        }

	}
}
class Answer{
    int st, end;
    Answer(int st, int end){
        this.st = st;
        this.end = end;
    }
}