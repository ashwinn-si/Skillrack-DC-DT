/*In a hotel, there are F food items available to serve and there are N customers have ordered
the food items. Each customer has their own preferences for food. The program must accept
the names and the calories of F food items as the input. The name of each customer and the
names of the food items that he/she has ordered are also passed as the input to the program.
The program must sort the names of the customers based on the total calories of the food
that they have ordered in descending order. If two or more customers have the same total
calories, then the program must sort those customers based on the number of food items
that they have ordered in descending order. If two or more customers have the same total
calories value and the same number of food items, then the program must sort the customers
based on their names in ascending order.
Finally, the program must print the names of the customers (after sorting) as the output.

Input:
4
Idly 150
Dosa 200
Vada 100
Pongal 300
6
Pqr Idly,Dosa,Vada
Def Pongal
Ghi Idly,Vada
Abc Pongal,ldly
Mno Dosa,Pongal
Jkl Idly,Vada,Dosa

Output:
Mno
Jkl
Pqr
Abc
Def
Ghi

Explanation:
Here F = 4 and N = 6.
The name, the total calories and the number of food items of the 6 customers are given below.
Pqr 450(150+200+100) 3
Def 300(300) 1
Ghi 250(150+100) 2
Abc 450(300+150) 2
Mno 500(200+300) 2
Jk' 450(150+ 100+200) 3
After sorting the names of the customers based on the given conditions, the names become
Mno, Jkl, Pqr, Abc, Def and Ghi.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		HashMap<String,Integer> food_map=new HashMap<>();
		int no_food=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<no_food;i++){
		    String input_line[]=sc.nextLine().split(" ");
		    food_map.put(input_line[0],Integer.parseInt(input_line[1]));
		}
		int no_customers=sc.nextInt();
		sc.nextLine();
		Comparator<List<String>> comp=new Comparator<>(){
		    @Override
		    public int compare(List<String>a,List<String>b){
		        if(Integer.parseInt(a.get(1))==Integer.parseInt(b.get(1)) && Integer.parseInt(a.get(2))==Integer.parseInt(b.get(2))){
		            return (a.get(0).compareTo(b.get(0)));
		        }else if(Integer.parseInt(a.get(1))==Integer.parseInt(b.get(1))){
		            return Integer.compare(Integer.parseInt(b.get(2)),Integer.parseInt(a.get(2)));
		        }else{
		            return Integer.compare(Integer.parseInt(b.get(1)),Integer.parseInt(a.get(1)));
		        }
		    }
		};
		List<List<String>> customer_details= new ArrayList<>();
		//customer_name,food_colories,no_food
		for(int i=0;i<no_customers;i++){
		    List<String> curr_customer=new ArrayList<>();
		    String input_line[]=sc.nextLine().split(" ");
		    String curr_cust_food[]=input_line[1].split(",");
		    int total_cost=0;
		    for (String food:curr_cust_food){
		        total_cost+=food_map.get(food);
		    }
		    curr_customer.add(input_line[0]);
		    curr_customer.add(Integer.toString(total_cost));
		    curr_customer.add(Integer.toString(curr_cust_food.length));
		    customer_details.add(curr_customer);
		}
		Collections.sort(customer_details,comp);
		for(int i=0;i<customer_details.size();i++){
		    System.out.println(customer_details.get(i).get(0));
		}
	}
}