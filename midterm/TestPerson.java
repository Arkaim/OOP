pulic class TestPerson {
	private static PrintWriter stdOut = new PrintWriter(System.out, true);

	private static PrintWriter stdErr = new PrintWriter(System.out, true);

	public static void assertTrue(boolean condition) {
		if (!condition) {
			stdErr.print ("Fail");
		}
	}

	public static void main(String[] args) {
		String name = "Aim";
		String number = "8707808080";


		Person patientAim = new Person (name, number);

		assertTrue(name.equals(patientAim.getName()));
			assertTrue(number.equals(patientAim.getNumber()));


		stdOut.println("Done");
	}	
}