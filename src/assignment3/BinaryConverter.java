package assignment3;

public class BinaryConverter {
    public static class BinaryFormatException extends Exception {
        public BinaryFormatException(String message) {
            super(message);
        }
    }

    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        // Check if the input string is a valid binary string
        for (char c : binaryString.toCharArray()) {
            if (c != '0' && c != '1') {
                throw new BinaryFormatException("Input is not a valid binary string");
            }
        }

        // Convert binary string to decimal
        int decimal = Integer.parseInt(binaryString, 2);
        return decimal;
    }

    public static void main(String[] args) {
        String binaryString = "101010";
        try {
            int decimalValue = bin2Dec(binaryString);
            System.out.println("Decimal value: " + decimalValue);
        } catch (BinaryFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
