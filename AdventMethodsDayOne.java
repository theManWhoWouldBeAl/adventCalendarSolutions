package example;

public class AdventMethodsDayOne {
	
	public static int adventDay1A(String num) {
		int total = 0;
		int convert = 0;
		int convert2 = 0;
		char charCheck = ' ';
		charCheck = num.charAt(0);
		if(charCheck == '0') {
			convert = 0;
		}else if(charCheck == '1') {
			convert = 1;
		}else if(charCheck == '2') {
			convert = 2;
		}else if(charCheck == '3') {
			convert = 3;
		}else if(charCheck == '4') {
			convert = 4;
		}else if(charCheck == '5') {
			convert = 5;
		}else if(charCheck == '6') {
			convert = 6;
		}else if(charCheck == '7') {
			convert = 7;
		}else if(charCheck == '8') {
			convert = 8;
		}else if(charCheck == '9') {
			convert = 9;
		}
		charCheck = num.charAt(num.length()-1);
		if(charCheck == '0') {
			convert2 = 0;
		}else if(charCheck == '1') {
			convert2 = 1;
		}else if(charCheck == '2') {
			convert2 = 2;
		}else if(charCheck == '3') {
			convert2 = 3;
		}else if(charCheck == '4') {
			convert2 = 4;
		}else if(charCheck == '5') {
			convert2 = 5;
		}else if(charCheck == '6') {
			convert2 = 6;
		}else if(charCheck == '7') {
			convert2 = 7;
		}else if(charCheck == '8') {
			convert2 = 8;
		}else if(charCheck == '9') {
			convert2 = 9;
		}
		if(convert == convert2) {
			total += convert;
		}
		for(int i = 1;  i < num.length(); i++) {
			charCheck = num.charAt(i);
			if(charCheck == '0') {
				convert = 0;
			}else if(charCheck == '1') {
				convert = 1;
			}else if(charCheck == '2') {
				convert = 2;
			}else if(charCheck == '3') {
				convert = 3;
			}else if(charCheck == '4') {
				convert = 4;
			}else if(charCheck == '5') {
				convert = 5;
			}else if(charCheck == '6') {
				convert = 6;
			}else if(charCheck == '7') {
				convert = 7;
			}else if(charCheck == '8') {
				convert = 8;
			}else if(charCheck == '9') {
				convert = 9;
			}	
				charCheck = num.charAt(i-1);
			if(charCheck == '0') {
				convert2 = 0;
			}else if(charCheck == '1') {
				convert2 = 1;
			}else if(charCheck == '2') {
				convert2 = 2;
			}else if(charCheck == '3') {
				convert2 = 3;
			}else if(charCheck == '4') {
				convert2 = 4;
			}else if(charCheck == '5') {
				convert2 = 5;
			}else if(charCheck == '6') {
				convert2 = 6;
			}else if(charCheck == '7') {
				convert2 = 7;
			}else if(charCheck == '8') {
				convert2 = 8;
			}else if(charCheck == '9') {
				convert2 = 9;
			}
			if(convert == convert2) {
				total += convert;
			}			
		}
		return total;
	}
	
	public static int adventDay1B(String num) {
		int total = 0;
		int convert = 0;
		int convert2 = 0;
		char charCheck = ' ';
		//int checkAgainst = 0;
		charCheck = num.charAt(0);
		if(charCheck == '0') {
			convert = 0;
		}else if(charCheck == '1') {
			convert = 1;
		}else if(charCheck == '2') {
			convert = 2;
		}else if(charCheck == '3') {
			convert = 3;
		}else if(charCheck == '4') {
			convert = 4;
		}else if(charCheck == '5') {
			convert = 5;
		}else if(charCheck == '6') {
			convert = 6;
		}else if(charCheck == '7') {
			convert = 7;
		}else if(charCheck == '8') {
			convert = 8;
		}else if(charCheck == '9') {
			convert = 9;
		}
		charCheck = num.charAt(num.length()/2);
		if(charCheck == '0') {
			convert2 = 0;
		}else if(charCheck == '1') {
			convert2 = 1;
		}else if(charCheck == '2') {
			convert2 = 2;
		}else if(charCheck == '3') {
			convert2 = 3;
		}else if(charCheck == '4') {
			convert2 = 4;
		}else if(charCheck == '5') {
			convert2 = 5;
		}else if(charCheck == '6') {
			convert2 = 6;
		}else if(charCheck == '7') {
			convert2 = 7;
		}else if(charCheck == '8') {
			convert2 = 8;
		}else if(charCheck == '9') {
			convert2 = 9;
		}
		if(convert == convert2) {
			total += convert;
		}
		for(int i = 1;  i < num.length(); i++) {
			charCheck = num.charAt(i);
			if(charCheck == '0') {
				convert = 0;
			}else if(charCheck == '1') {
				convert = 1;
			}else if(charCheck == '2') {
				convert = 2;
			}else if(charCheck == '3') {
				convert = 3;
			}else if(charCheck == '4') {
				convert = 4;
			}else if(charCheck == '5') {
				convert = 5;
			}else if(charCheck == '6') {
				convert = 6;
			}else if(charCheck == '7') {
				convert = 7;
			}else if(charCheck == '8') {
				convert = 8;
			}else if(charCheck == '9') {
				convert = 9;
			}
			if(i+(num.length()/2)>= num.length()) {
				charCheck = num.charAt((i + num.length()/2)%num.length());
			}else {
				charCheck = num.charAt(i+(num.length()/2));
			}
			if(charCheck == '0') {
				convert2 = 0;
			}else if(charCheck == '1') {
				convert2 = 1;
			}else if(charCheck == '2') {
				convert2 = 2;
			}else if(charCheck == '3') {
				convert2 = 3;
			}else if(charCheck == '4') {
				convert2 = 4;
			}else if(charCheck == '5') {
				convert2 = 5;
			}else if(charCheck == '6') {
				convert2 = 6;
			}else if(charCheck == '7') {
				convert2 = 7;
			}else if(charCheck == '8') {
				convert2 = 8;
			}else if(charCheck == '9') {
				convert2 = 9;
			}
			if(convert == convert2) {
				total += convert;
			}
			//checkAgainst = num.charAt(i -1);			
		}
		return total;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
