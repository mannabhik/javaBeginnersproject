package twonumbercalculator;

public class basicalculator {
	void plus(int a, int b) {
		System.out.printf("%d+%d=%d", a, b, a + b).println();
	}

	void multi(int a, int b) {
		System.out.printf("%dX%d=%d", a, b, a * b).println();
	}

	void minus(int a, int b) {
		System.out.printf("%d-%d=%d", a, b, a - b).println();
	}

	void div(int a, int b) {
		System.out.printf("%d/%d=%d", a, b, a / b).println();
	}

	void remain(int a, int b) {
		System.out.printf("%d%%d=%d", a, b, a % b).println();
	}

	void square(int a) {
		System.out.printf("%d", a * a).println();
	}
    void factorial(int a) {
    	int f=1;
        for(int i=1;i<=a;i++) {
        	f=f*i;
        }
        System.out.println(f);
    		
    	}
    }



