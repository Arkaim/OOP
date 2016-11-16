pulic class TestPatient {
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
		String id = "20FDKH3";

		Patient patientAim = new Patient (name, number, id);

		assertTrue(name.equals(patientAim.getName()));
		assertTrue(id.equals(patientAim.lookUp()));
		assertTrue(number.equals(patientAim.getNumber()));


		stdOut.println("Done");
	}	
}