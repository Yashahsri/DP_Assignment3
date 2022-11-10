package question_1;

public class containerDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			container<Integer> integerContainer = new container<Integer>();
			container<String> stringContainer = new container<String>();
			integerContainer.add(new Integer(7));
			stringContainer.add(new String(”You are awesome”));
			System.out.printf(“Integer value :%d\n\n”, integerContainer.get());
			System.out.printf(“String value :%d\n\n”, stringContainer.get());
			}

			}


	


