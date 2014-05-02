public class RangeClass {
	int max, min;
	public String getInput(String string) throws InvalidRangeException {
		String expected = "{";
		
		
		validate(splitComma(string));

		if (string.charAt(0) == '(') {
			min++;
		}
		if (string.charAt(string.length() - 1) == ')') {
			max--;
		}
		int current = min;
		for (int i = 0; i <= (max - min); i++) {
			if (i == (max - min)) {
				expected += "" + (current++) + "}";
			} else {
				expected += "" + (current++) + ",";
			}
		}

		if ((max - min) == -2) {
			expected += "}";
		}

		return expected;
	}

	private void validate(String[] arrString) throws InvalidRangeException {
		try {
			min = Integer.parseInt(arrString[0]);
			max = Integer.parseInt(arrString[1]);
		} catch (Exception e) {
			throw new InvalidRangeException("Invalid Range Exception");
		}

		if (max < min) {
			throw new InvalidRangeException("Invalid Range Exception");
		}
		
	}

	private String[] splitComma(String string) throws InvalidRangeException {
		return string.substring(1, string.length() - 1).split(",");
	}
 
}
