package simple;

public class SimpleCons {

	public static void main(String[] args) {
		int studentAge =  10;

		System.out.println("Hello world, age of Student is:"+studentAge);
		
		if(studentAge > 5 && studentAge <= 10) {
			System.out.println("I'm going to elementary school");
		}else if (studentAge >= 11 && studentAge <= 14) {
			System.out.println("I'm going to middle school");
	    }else if(studentAge > 14  && studentAge <= 18) {
			System.out.println("I'm going to highschool");
		}else if (studentAge > 18 && studentAge <= 21) {
			System.out.println("I'm going to college!");
        }

		
//		if(studentAge==5) {
//			System.out.println("I'm going to pre-K");
//		} else
//		if(studentAge==6) {
//			System.out.println("I'm going to 1");
//		}else
//		if(studentAge==7) {
//			System.out.println("I'm going to 2");
//		}else
//		if(studentAge==8) {
//			System.out.println("I'm going to 3");
//		}else
//		if(studentAge==9) {
//			System.out.println("I'm going to 4");
//		}else
//		if(studentAge==10) {
//			System.out.println("I'm going to 5");
//		}
		
		switch(studentAge) {
		case 5:
			System.out.println("I'm going to pre-K");
			break;
			
		case 6:
			System.out.println("I'm going to 1");
			break;
			
		case 7:
			System.out.println("I'm going to 2");
			break;
			
		case 8:
			System.out.println("I'm going to 3");
			break;
			
		case 9:
			System.out.println("I'm going to 4");
			break;
			
		case 10:
			System.out.println("I'm going to 5");
			break;
		}
		
		
//		System.out.println("*");
//		System.out.println("**");
//		System.out.println("***");
		
		var string = "*";
		
		for(int i=0; i<3; i++) {
			
			for( int j=0; j<= i; j++) {
				System.out.print("*");
			}
			System.out.println();
	    }

			
		
		
	}

}



//*
//**
//***
