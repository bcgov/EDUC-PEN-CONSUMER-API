package ca.bc.gov.educ.api.pen.myed.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.SignStyle;
import java.util.Optional;

import static java.time.temporal.ChronoField.*;

/**
 * The type Local date time util.
 */
public final class LocalDateTimeUtil {
private static final DateTimeFormatter dateTimeFormatter = new DateTimeFormatterBuilder()
  .appendValue(YEAR, 4, 10, SignStyle.EXCEEDS_PAD)
  .appendValue(MONTH_OF_YEAR, 2)
  .appendValue(DAY_OF_MONTH, 2).toFormatter();
  /**
   * Instantiates a new Local date time util.
   */
  private LocalDateTimeUtil() {
  }

  /**
   * Get api formatted date of birth string.
   *
   * @param dateOfBirth the date of birth
   * @return the string
   */
  public static String getAPIFormattedDateOfBirth(String dateOfBirth) {
    if (Optional.ofNullable(dateOfBirth).isEmpty()) {
      return null;
    }
    return  LocalDate.parse(dateOfBirth, dateTimeFormatter).format(DateTimeFormatter.ISO_DATE);
  }
}
