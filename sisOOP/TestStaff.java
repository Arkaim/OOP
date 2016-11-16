pulic class TestStaff {
	private static PrintWriter stdOut = new PrintWriter(System.out, true);

	private static PrintWriter stdErr = new PrintWriter(System.out, true);

	public static void assertTrue(boolean condition) {
		if (!condition) {
			stdErr.print ("Fail");
		}
	}

	public static void main(String[] args) {
		String name = "Islam";
		String address = "Almaty, Medeu";
		String school = "15g";
		String pay = "0.1";

		Staff person = new Staff (name, address, school, pay);

		assertTrue(name.equals(person.getName()));
		assertTrue(id.equals(person.lookUp()));
		assertTrue(address.equals(person.getAddress()));
		assertTrue(pay == person.getPay());

		person = new Staff (name, address, school, pay);

		String result = "Staff[person[name=" + name +" , address = " + address 
						+ "], school = " + school + ",pay = " + pay + "]";	
		assertTrue(result.equals(person.toString()));

		stdOut.println("Done");
	}	
}