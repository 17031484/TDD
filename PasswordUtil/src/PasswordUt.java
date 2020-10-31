
public class PasswordUt {
    public enum SecurityLevel{
        WEAK, MEDIUM, STRONG
    }

    public static SecurityLevel assessPassword(String password)
    {
        if (password.length()<8)
        {
            return SecurityLevel.WEAK;
        }

        if (password.matches("[a-zA-Z]+")) //Contiene letras de la a-z, mayusculas o minusculas, y el + significa que se pueden repetir
        {
            return SecurityLevel.WEAK;
        }
        if (password.matches("[a-zA-Z0-9]+"))
        {
            return SecurityLevel.MEDIUM;
        }
        return SecurityLevel.STRONG;
    }
}
