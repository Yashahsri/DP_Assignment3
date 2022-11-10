package question_25;
public class Optional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = new String[10];
		Optional<String>checkNull = Optional.ofNullable(str[4]);
		if (checkNull.isPresent()){
		String word = str[4].toLowerCase();
		System.out.println(str);
		}else {
		System.out.println("String is null");
	
			}


	}

}
