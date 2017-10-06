import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class UniqueCharsTest {

    @Test
    public void uniqueCharactersSamechar() throws Exception {
        String test = "aaaaa";
        assertEquals(Arrays.asList(), UniqueChars.uniqueCharacters(test));
    }

    @Test
    public void uniqueCharactersEmptyString() throws Exception {
        String test = "";
        assertEquals(Arrays.asList(), UniqueChars.uniqueCharacters(test));
    }

    @Test
    public void uniqueCharactersSpaces() throws Exception {
        String test = "a s d g f h";
        assertEquals(Arrays.asList('a', 's', 'd', 'g', 'f', 'h'), UniqueChars.uniqueCharacters(test));
    }

    @Test
    public void uniqueCharactersUppercase() throws Exception {
        String test = "Testing The capiTals";
        assertEquals(Arrays.asList('t', 'n', 'g', 'h', 'c', 'p', 'l'), UniqueChars.uniqueCharacters(test));
    }

}