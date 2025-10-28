import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class ChristmasTreePrinterTest {

	@Test
	public void testChristmasTreePrinterSize5() {
		ChristmasTreePrinter test = new ChristmasTreePrinter(5);
		test.print(System.out);
	}

	@Test
	public void testChristmasTreePrinterSize12() {
		ChristmasTreePrinter test = new ChristmasTreePrinter(12);
		test.print(System.out);
	}

	@Test
	public void testChristmasTreePrinterSize15() {
		ChristmasTreePrinter test = new ChristmasTreePrinter(15);
		test.print(System.out);
	}

	@Test
	public void testChristmasTreePrinterSize0() {
		assertThrows(IllegalArgumentException.class, () -> new ChristmasTreePrinter(0));
	}

	@Test
	public void testChristmasTreePrinterSize1() {
		ChristmasTreePrinter test = new ChristmasTreePrinter(1);
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		PrintStream printStream = new PrintStream(outputStream);

		test.print(printStream);
		byte[] printedTree = outputStream.toByteArray();

		assertArrayEquals(new byte[] { 32, 42, 10, 32, 124, 10 }, printedTree); // Compare the actual output bytes
	}

	@Test
	public void testChristmasTreePrinterSizeNegative1() {
		assertThrows(IllegalArgumentException.class, () -> new ChristmasTreePrinter(-1));
	}
}
