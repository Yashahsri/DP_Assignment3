package question_10;

import java.sql.SQLException;

public class SuperClass {

	void methodOfSuperClass(){
		System.out.println("Super class");}
		}
		class SubClass extends SuperClass{
		
		void methodOfSuperClass() throws ArrayIndexOutOfBoundsException{
		System.out.println("can be overrided");}
		}
		
		class SubClassOne extends SuperClass{
		
		void methodOfSuperClass() throws NumberFormatException, NullPointerException{
		System.out.println("can be overrided with any number of unchecked exceptions");}
		}
		class SubClassTwo extends SuperClass{
		
		void methodOfSuperClass() throws SQLException{


		}
	}
