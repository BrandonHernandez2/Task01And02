enum class DayPart{
    MORNING,
    AFTERNOON,
    EVENING
}


data class Event(
    val title : String,
    val description : String?,
    val dayPart: DayPart,
    val durationInMinutes: Int
)

fun main() {
    println(" ")

    val event1 = Event("Study Kotlin", " Commit to studying Kotlin at least 15 minutes per day.", DayPart.EVENING, 15 )
    println(event1)




}