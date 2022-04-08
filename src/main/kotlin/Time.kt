var time = 3211
fun main() {
    agoToText(time)
}

fun agoToText(time: Int) {
    return when (true) {
        (time <= 60) -> println("Был(а) только что")
        (time in 61..3_599) -> println(stringMinutes(time))
        (time in 3_600..86_400) -> println(stringHours(time))
        (time in 86_401..172_800) -> println("Был(а) сегодня")
        (time in 172_801..216_000) -> println("Был(а) вчера")
        else -> println("Был(а) давно")
    }
}


fun stringMinutes(time: Int): String {
    return when (true) {
        ((time / 60) % 10 == 1 && time / 60 != 11) -> "Был(а) " + time / 60 + " минуту назад"
        ((time / 60 % 10 == 0)
                || (time / 60 % 10 == 2)
                || (time / 60 % 10 == 3)
                || (time / 60 % 10 == 4)) -> "Был(а) " + time / 60 + " минуты назад"
        else -> "Был(а) " + time / 60 + " минут назад"
    }
}

fun stringHours(time: Int): String {
    return when (true) {
        (time % 3_600 == 1 && time % 3_600 != 11) -> "Был(а) " + time / 3_600 + " час назад"
        ((time % 3_600 == 2) || (time % 3_600 == 3) || (time % 3_600 == 4)) -> "Был(а) " + time / 3600 + " часа назад"

        else -> "Был(а) " + time / 3_600 + " часов назад"
    }
}



//(time /60 == 1 && (time / 60) % 60 == 1) -> "Был(а) " + time / 60 + " минуту назад"
//((time % 60 == 0) || (time / 60 % 60 == 2) || (time / 60 % 60 == 3) || (time / 60 % 60 == 4)) -> "Был(а) " + time / 60 + " минуты назад"
//
//else -> "Был(а) " + time / 60 + " минут назад"



