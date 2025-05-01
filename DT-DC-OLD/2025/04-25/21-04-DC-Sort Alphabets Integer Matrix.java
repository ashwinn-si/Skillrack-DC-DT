import java.util.*;
public class Hello {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        sc.nextLine();
        List<Row> matrix = new ArrayList<>();
        for(int i = 0 ; i < R ; i++){
            String row [] = new String[C];
            char ch = '0';
            for(int j = 0 ; j < C ; j++){
                String element = sc.next();
                if(element.charAt(0) >='a' && element.charAt(0) <='z'){
                    ch  = element.charAt(0);
                }
                row[j] = element;
            }
            matrix.add(new Row(row, ch, i));
        }
        Collections.sort(matrix, (a,b) ->  a.ch == b.ch ? b.index - a.index : Character.compare(a.ch, b.ch));
        
        for(Row r : matrix){
            for(int i = 0 ; i < C ; i++){
               System.out.print(r.elements[i]+" ");
            }
            System.out.println();
        }
	}
}
class Row{
    String [] elements;
    char ch;
    int index;
    Row(String[] elements, char ch, int index){
        this.elements = elements;
        this.ch = ch;
        this.index = index;
    }
}