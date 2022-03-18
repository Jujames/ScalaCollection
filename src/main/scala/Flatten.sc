import java.util.Calendar._
import java.util.Calendar.{getInstance => calendar}

def age(year: Int): Int = {
  calendar.get(YEAR) - year
}
val years = List(1990, 1984)
years.map(age)

def ages(year: Int): List[Int] = {
  List(age(year-1), age(year+1))
}

years.map(ages)
years.flatMap(ages)