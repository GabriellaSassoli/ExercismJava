class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		int newNumber = 0;
		int number = numberToCheck;

		while (number> 0) {
			newNumber = newNumber + (int)Math.pow(number % 10,String.valueOf(numberToCheck).length());
			number = number / 10;
		}

		Boolean armstrongNumber = (Integer.compare(newNumber,numberToCheck)== 0) ? true : false;
		return armstrongNumber;
	}

}
