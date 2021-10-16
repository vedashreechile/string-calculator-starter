package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

    @Test
    void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }

	@Test
	public void string_sum_Of_TwoNumbers_Seperated_ByComma() {
		assertEquals(StringCalculator.add("1,2"), 3);
			
		}
		@Test
		public void string_sum_Of_ThreeNumbers_Seperated_ByComma() {
			assertEquals(StringCalculator.add("1,2,3"), 6);
		}

		@Test
		public void Stringsums_Numbers_Delimited_ByNewline() {
			assertEquals(StringCalculator.add("1\n2"), 3);
		}

}
