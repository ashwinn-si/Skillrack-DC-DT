import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		StringBuffer str = new StringBuffer(sc.next());
		while(str.indexOf("11") != -1){
		    int index = str.indexOf("11");
		    str.replace(index,index+2,"b");
		}
		while(str.indexOf("10") != -1){
		    int index = str.indexOf("10");
		    str.replace(index,index+2,"b");
		}
		while(str.indexOf("0") != -1){
		    int index = str.indexOf("0");
		    str.replace(index,index+1,"a");
		}
		if(str.indexOf("0") == -1 && str.indexOf("1") == -1){
		    System.out.print(str);
		}else{
		    System.out.print(-1);
		}

	}
}