package ca.bc.gov.educ.api.pen.myed.validator;

import ca.bc.gov.educ.api.pen.myed.rest.RestUtils;
import ca.bc.gov.educ.api.pen.myed.struct.v1.PenRequestBatchSubmission;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.stereotype.Component;
import org.springframework.validation.FieldError;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class PenRequestBatchSubmissionValidator {
  private final RestUtils restUtils;

  public PenRequestBatchSubmissionValidator(final RestUtils restUtils) {
    this.restUtils = restUtils;
  }

  public List<FieldError> validatePayload(PenRequestBatchSubmission penRequestBatchSubmission){
    final List<FieldError> apiValidationErrors = new ArrayList<>();
    val school = this.restUtils.getSchoolMap().get(String.valueOf(penRequestBatchSubmission.getMincode()));
    if(school == null){
      apiValidationErrors.add(createFieldError("mincode", penRequestBatchSubmission.getMincode(), "Invalid mincode."));
    }else {
      final String openedDate = school.getDateOpened();
      final String closedDate = school.getDateClosed();
      if (openedDate == null || LocalDate.parse(openedDate, DateTimeFormatter.ISO_LOCAL_DATE_TIME).isAfter(LocalDate.now()) || (closedDate != null && LocalDate.parse(closedDate, DateTimeFormatter.ISO_LOCAL_DATE_TIME).isBefore(LocalDate.now()))) {
        apiValidationErrors.add(createFieldError("mincode", penRequestBatchSubmission.getMincode(), "School is closed."));
      }else if(!penRequestBatchSubmission.getSchoolName().equalsIgnoreCase(school.getSchoolName())){
        apiValidationErrors.add(createFieldError("schoolName", penRequestBatchSubmission.getSchoolName(), "School Name mismatch."));
      }
    }
    return apiValidationErrors;
  }

  private FieldError createFieldError(String fieldName, Object rejectedValue, String message) {
    return new FieldError("penRequest", fieldName, rejectedValue, false, null, null, message);
  }
}