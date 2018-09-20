package learn;

public class Armstrong {

	public static void main(String[] args) {
		for(int i = 1 ;i<=9 ; i++) {
			for(int j = 0 ; j <= 9 ; j ++) {
				for(int k = 0 ; k <= 9 ; k++) {
					double a = Math.pow(i, 3);	
					double b = Math.pow(j, 3);
					double c = Math.pow(k, 3);
					double d = a + b + c ;
					double e = i*100+j*10+k*1;
					if(d == e ) {
						System.out.println(e);
					}
				}
			}
		}
		for(int i = 100 ; i<=999 ; i++) {
			double result = Math.pow((i/100), 3)+Math.pow(((i%100)/10), 3)+Math.pow((i%10), 3);
			if(result == i) {
				System.out.println(i);
			}
		}
	}
}
