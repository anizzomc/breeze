public class Main {

	public static void main(final String[] args) {

		final String[] names = {"0", "1", "2", "3"};
		final A[] array = new A[6];

		array[0] = new A(names[0]);
		array[0].m1();
		array[0].m2();
		array[0].m3();

		array[1] = new B(names[1]);
		array[1].m1();
		array[1].m2();
		array[1].m3();

		array[2] = array[0].convertToB();
		array[3] = array[1].convertToA();
		array[4] = new B(names[2]).convertToB();
		array[5] = new B(names[3]).convertToB();

		System.out.println();

		for (final A each : array) {
			for (final String name : names) {
				System.out.println(each.equals(new B(name)));
			}
			System.out.println();
		}

	}

}