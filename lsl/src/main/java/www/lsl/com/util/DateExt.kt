package www.lsl.com.util

import java.text.SimpleDateFormat
import java.util.*

fun getUTCDateTime(timestamp: Long): String?{
    if (0> timestamp) return null
    val date = getUTCTime(Date(timestamp))
    val format = SimpleDateFormat("yyyyMMdd'T'HHmmss.SSS'Z'");
    return format.format(date)
}

fun getUTCTime(time:Date):Date{
    val cal = Calendar.getInstance();
    cal.time = time
    val zoneOffset = cal.get(Calendar.ZONE_OFFSET)
    val dstOffset = cal.get(Calendar.DST_OFFSET)
    cal.add(Calendar.MILLISECOND,-(zoneOffset+dstOffset));
    return cal.time
}
