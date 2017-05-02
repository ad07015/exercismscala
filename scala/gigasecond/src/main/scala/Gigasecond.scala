import java.time.temporal.ChronoUnit
import java.time.{LocalDate, LocalDateTime}

object Gigasecond {

  def addGigaseconds(date: LocalDateTime): LocalDateTime = date.plus(1000000000, ChronoUnit.SECONDS)

  def addGigaseconds(dob: LocalDate): LocalDateTime = {
    val dobWithTime: LocalDateTime = dob.atTime(0, 0, 0, 0)
    addGigaseconds(dobWithTime: LocalDateTime)
  }
}