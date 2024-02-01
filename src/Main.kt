import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.Scanner
import javax.xml.crypto.Data

fun main()
{

    val timeWrite = Scanner(System.`in`)
   // val timerWr= timeWrite.nextInt()

    println("Введите имя банка")



    val nameBanka = timeWrite.next()
    println("Введите сумму нынешного перевода")
    val summa = timeWrite.nextDouble()
    println("Введите сумму прошлых переводов (если нет, то пж на ноль тыкнете, мне проверки писать лень)")

    val summaPred = timeWrite.nextDouble()

   // println( timeManager(timerWr))
    println(zadanie2(nameBanka,summa,summaPred))

}
fun timeManager(timeWrite: Int) : String
{

    var seconds = timeWrite
    var minutes = seconds/60
    var hours = minutes/60
    var days = hours/24
    return when
    {

        days >5 -> "был(а) в сети $days дней назад"
        days in 2..4 -> "был(а) в сети $days дня назад"
        days == 1 -> "был(а) в сети $days день назад"
        hours in 2..4 -> "был(а) в сети $hours часа назад"
        hours == 1 -> "был(а) в сети $hours час назад"
        hours>0 -> "был(а) в сети $hours часов назад"


        minutes == 1 || minutes ==21 || minutes ==31 || minutes ==41 || minutes ==51  -> "был(а) в сети $minutes минуту назад"
        minutes == 2 || minutes ==3 || minutes ==4 -> "был(а) в сети $minutes минуты назад"
        minutes>0 ->"был(а) в сети $minutes минут назад"



        else -> "только что"
    }
}
fun zadanie2(nameBanka:String, summa: Double, summaPred:Double)
{
  var summ = summa
    if(summa > 150001){ println("Слишком большая сумма на текущий день")   }
    if(summaPred> 600001){ println("Слишком большая сумма на текущий месяц") }
    if (nameBanka.equals(""))
    {
        nameBanka === "VKPlay"
    }

    if (nameBanka.equals("VKPay"))
    {
        if(summ>15000)
        { println("Слишком большая сумма на текущий день")

        }
        if(summaPred> 40000)
        {
            println("Слишком большая сумма на текущий месяц")
        }

        println("Без комисии сегодня" + " суммарная оплата с вас $summa")


    }
    if (nameBanka.equals("Visa") || nameBanka.equals("Мир")) {
        if(summa > 35) {
            summ *= 0.75
            summ += summa
            println(" суммарная оплата с вас $summ")
        }
        else{
            println("Тут меньше необходимого лимита в 35")

        }
    }
    if(nameBanka.equals("Mastercard") || nameBanka.equals("Maestro"))
    {
        if (summaPred + summa > 300 && summa + summaPred < 75000)
        {
            println("Без комисии сегодня" + " суммарная оплата с вас $summa")

        }
        else
        {
            summ *= 0.6
            summ += summa
            println("Комисии сегодня" + " суммарная оплата с вас $summ")

        }



    }

    }



