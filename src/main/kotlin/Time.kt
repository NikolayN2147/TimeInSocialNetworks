

fun main() {
    print("Введите значение в секундах: ")
    val time = readLine()?.toInt()
    if (time != null) {
        println(agoToText(time))
    }
}

fun agoToText(time: Int):String {
    return when (true) {
        (time <= 60) -> "Был(а) только что"
        (time in 61..3_599) -> stringMinutes(time)
        (time in 3_600..86_400) -> stringHours(time)
        (time in 86_401..172_800) -> "Был(а) сегодня"
        (time in 172_801..216_000) -> "Был(а) вчера"
        else -> "Был(а) давно"
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
        (time / 3_600 % 10 == 1 && time / 3_600 != 11 ) -> "Был(а) " + time / 3_600 + " час назад"
        (time / 3600 / 10 != 1
                && (time / 3_600 % 10 == 2)
                || (time / 3_600 % 10 == 3)
                || (time / 3_600 % 10 == 4)) -> "Был(а) " + time / 3600 + " часа назад"
        else -> "Был(а) " + time / 3_600 + " часов назад"
    }
}




