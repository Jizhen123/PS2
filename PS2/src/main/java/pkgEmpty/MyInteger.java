package pkgEmpty;

public class MyInteger {

	private int iValue;

	public MyInteger(int iValue) {
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}


	public boolean isEven() {
		if (iValue % 2 == 0)
			return true;
		else
			return false;
	}

	public boolean isOdd() {
		if (iValue % 2 == 1)
			return true;
		else
			return false;
	}

	public boolean isPrime() {
		for (int i = 2; i < iValue; i++)
			if (iValue % i == 0)
				return false;
		return true;
	}

	public static boolean isEven(int iValue) {
		if (iValue % 2 == 0)
			return true;
		else
			return false;
	}

	public static boolean isOdd(int iValue) {
		if (iValue % 2 == 1)
			return true;
		else
			return false;
	}

	public static boolean isPrime(int iValue) {
		for (int i = 2; i * i <= iValue; i++)
			if (iValue % i == 0)
				return false;
		return true;
	}

	public static boolean isEven(MyInteger iValue) {
		return iValue.isEven();
	}

	public static boolean isOdd(MyInteger iValue) {
		return iValue.isOdd();
	}

	public static boolean isPrime(MyInteger iValue) {
		return iValue.isPrime();
	}

	public boolean equals(int iValue) {
		if (iValue == this.iValue)
			return true;
		else
			return false;
	}

	public boolean equals(MyInteger iValue) {
		return iValue.equals(this.iValue);
	}
}
