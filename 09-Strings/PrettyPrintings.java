
public class PrettyPrintings {
    public static void main(String[] args) {
        // Formatted Printing

        float a = 1.3445454f;
        System.out.println(a);

        // Formatted Printing Using "printf" and %._f
        System.out.printf("%.3f", a);
        System.out.println("");

        System.out.println(Math.PI);

        // Also doing round off work implicitly
        System.out.printf("%.4f", Math.PI);
    }
    
}

/* %a
floating point (except BigDecimal)
Returns Hex output of floating point number.
%b
Any type
"true" if non-null, "false" if null
%c
character
Unicode character
%d
integer (incl. byte, short, int, long, bigint)
Decimal Integer
%e
floating point
decimal number in scientific notation
%f
floating point
decimal number
%g
floating point
decimal number, possibly in scientific notation depending on the precision and value.
%h
any type
Hex String of value from hashCode() method.
%n
none
Platform-specific line separator.
%o
integer (incl. byte, short, int, long, bigint)
Octal number
%s
any type
String value
%t
Date/Time (incl. long, Calendar, Date and TemporalAccessor)
%t is the prefix for Date/Time conversions. More formatting flags are needed after this. See Date/Time conversion below.
%x
integer (incl. byte, short, int, long, bigint)
Hex string. */