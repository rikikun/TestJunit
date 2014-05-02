public class RangeClass {

	public String getInput(String string) throws InvalidRangeException {
		String expected = "{";
		int max = 0, min = 0;
		String[] split = string.substring(1, string.length() - 1).split(",");
		try {
			min = Integer.parseInt(split[0]);
			max = Integer.parseInt(split[1]);
		} catch (Exception e) {
			throw new InvalidRangeException("Invalid Range Exception");
		}

		if (max < min) {
			throw new InvalidRangeException("Invalid Range Exception");
		}

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
}
