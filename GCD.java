package learn;

public class GCD {

	public static void main(String[] args) {
		int n = 1000 , m = 495 , result = 0;
		while(true) {
			result = n%m;
			n = m;
			m = result;
			if(result == 0 ) {
				System.out.println("1000&495�̤j���]��:"+n);
				break;
			}
		}
	}
}
