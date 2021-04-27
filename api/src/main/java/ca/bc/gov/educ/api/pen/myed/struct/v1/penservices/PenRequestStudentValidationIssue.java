package ca.bc.gov.educ.api.pen.myed.struct.v1.penservices;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PenRequestStudentValidationIssue {
  /**
   * The Pen request batch student validation issue id.
   */
  String penRequestBatchStudentValidationIssueId;
  /**
   * The Pen request batch validation issue severity code by pen request batch student validation issue severity code.
   */
  String penRequestBatchValidationIssueSeverityCode;
  /**
   * The Pen request batch validation issue type code by pen request batch student validation issue type code.
   */
  String penRequestBatchValidationIssueTypeCode;
  /**
   * The Pen request batch validation field code by pen request batch student validation field code.
   */
  String penRequestBatchValidationFieldCode;
}
