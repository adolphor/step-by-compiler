package chapter02._2_1_Introduction;

/**
 * 1. 没有完全按照书中的代码
 * 2. 即便如此，运行时还是会报错
 */
public class Demo_2_1_01 {
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		float[] a = new float[100];
		float v = 10;
		float x;

		while (true) {
			do {
				i = i + 1;
			} while (a[i] < v);

			do {
				j = j - 1;
			} while (a[j] > v);

			if (i >= j) {
				break;
			}

			x = a[i];
			a[i] = a[j];
			a[j] = x;
		}
	}
}
