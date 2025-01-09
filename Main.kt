fun main(args: Array<String>)
{
    println("Введите имя")
    var a:String = readLine()!!
    println("Наш герой готов к новым приключениям!")
    println("Вы ввели $a")

    println("Введите уровень")
    var playerLevel:Int = readLine()!!.toInt()

    println("Введите класс героя")
    var playerClass:String = readLine()!!
    
    var hasBeFriendedBartbarjans = true
    val hasAngeredBarbarjans = false
    
    if (playerLevel==1)
        println("Встретиться с гномом на горной тропе")
    else if (playerLevel<=5)
    {
        if (!hasAngeredBarbarjans && (hasBeFriendedBartbarjans || playerClass == "barbarjan"))
            println("Убедить варваров прекратить вторжение")
        else
            println("\"Герой должен спаст город от вторжения варваров")
    }
    else if (playerLevel==6)
        println("Найти зачарованный мяч")
    else if (playerLevel==7)
        println("Вернуть потерянный артефакт")
    else
        println("Сейчас квестов нет")
        
    println("Время идёт...")
    println("Герой возвращается после выполнения квеста")
    playerLevel+=1
    println(playerLevel)
}