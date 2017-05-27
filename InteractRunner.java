import java.util.Scanner;
public class InteractRunner{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		try{
			Calculator calc = new Calculator();
			String exit = "no";
			while(!exit.equals == "yes"){
				System.out.println("Enter first arg :");
				Stirng first = in.next();
				System.out.println("Enter second arg :");
				String second = in.next();
				calc.add(Integer.valueOf(first), Integer.valueOf(second));
				System.out.println("Result: " + calc.getResult());
				calc.clearResult();
				System.out.println("Exit: yes/no ");
				exit = in.next();
			}
		} finally {
			in.close();
		}
	}
}