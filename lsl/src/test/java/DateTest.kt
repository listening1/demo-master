import org.junit.Test
import www.lsl.com.util.getUTCDateTime

/***
date test
 **/
@Test
fun demoTest() {
    println("zzzzzzzz")
}

fun main(args: Array<String>) {
    val date = getUTCDateTime(System.currentTimeMillis())
    println(date)
}