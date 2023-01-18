adding numbers:

When adding smaller or manageable numbers, it is safe to use the primitive data type int to declare variables.

For numbers larger than 2,147,483,647, you'll need to import java.math.BigInteger in order to process the number.

The size of BigIntegers in Java is dependent on the machine architecture, but it is safe to say that it can be greater than Integer.MAXVALUE, which is 2,147,483,647. Additionally, BigIntegers can also be used to represent very large numbers that are beyond the range of the standard primitive data types. For example, a BigInteger could be used to represent a number that is larger than Long.MAXVALUE, which is 9,223,372,036,854,775,807.