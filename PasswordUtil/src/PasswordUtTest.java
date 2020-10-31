import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordUtTest {

    @Test
    public void weak_when_has_less_than_8_letters() //Password debil cuando tiene menos de 8 letras o numeros o simbolos
    {
       assertEquals(PasswordUt.SecurityLevel.WEAK,PasswordUt.assessPassword("12/&bc"));
    }

    @Test
    public void weak_when_has_only_letters() //Password debil cuando tiene solo letras
    {
        assertEquals(PasswordUt.SecurityLevel.WEAK,PasswordUt.assessPassword("abcdfkdmhyo"));
    }

    @Test
    public void medium_when_has_letters_and_numbers() //Password medio cuando tiene letras y numeros
    {
        assertEquals(PasswordUt.SecurityLevel.MEDIUM,PasswordUt.assessPassword("abcd12454234"));
    }

    @Test
    public void strong_when_has_letters_and_numbers_and_symbols() //Password fuerte cuando tiene letras y numeros
    {
        assertEquals(PasswordUt.SecurityLevel.STRONG,PasswordUt.assessPassword("abggd14623!//"));
    }
}