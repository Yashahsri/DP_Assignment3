package question_9;

Import java.io.FileOutputStream;
public class TryWithResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Try(FileOutputStream fileOutputStream = new FileOutputStream(“ ”)){
			String msg = "Welcome";
			Byte byteArray[] = msg.getBytes();
			fileOutputStream.write(byteArray);
			System.out.println("Message");
			}catch(Exception exception){
			System.out.println("exception");}
			}


	}


