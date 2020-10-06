import java.lang.NumberFormatException
import java.math.BigInteger
import java.util.*

fun main(args: Array<String>)
{
    var num = BigInteger("10")
    println (sum(num,BigInteger.ONE))
}
tailrec fun sum(num: BigInteger,r: BigInteger):BigInteger
{
    if(num==BigInteger.ZERO)
        return r-BigInteger.ONE;
    else{
        return sum(num-BigInteger.ONE,num+r)
    }

}