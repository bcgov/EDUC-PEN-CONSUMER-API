package ca.bc.gov.educ.api.pen.myed.struct.v1.penregbatch;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * The type Pen request batch student.
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("squid:S1700")
public class PenRequestBatchStudent {
  /**
   * The Pen request batch student id.
   */
  String penRequestBatchStudentID;
  /**
   * The Pen request batch id.
   */
  String penRequestBatchID;
  /**
   * The Pen request batch student status code.
   */
  String penRequestBatchStudentStatusCode;
  /**
   * The Local id.
   */
  String localID;
  /**
   * The Submitted pen.
   */
  String submittedPen;
  /**
   * The Legal first name.
   */
  String legalFirstName;
  /**
   * The Legal middle names.
   */
  String legalMiddleNames;
  /**
   * The Legal last name.
   */
  String legalLastName;
  /**
   * The Usual first name.
   */
  String usualFirstName;
  /**
   * The Usual middle names.
   */
  String usualMiddleNames;
  /**
   * The Usual last name.
   */
  String usualLastName;
  /**
   * The Dob.
   */
  String dob;
  /**
   * The Gender code.
   */
  String genderCode;
  /**
   * The Grade code.
   */
  String gradeCode;
  /**
   * The Postal code.
   */
  String postalCode;
  /**
   * The Assigned pen.
   */
  String assignedPEN;
  /**
   * The Student id.
   */
  String studentID;

  /**
   * The Create user.
   */
  String createUser;

  /**
   * The Update user.
   */
  String updateUser;

  /**
   * The Repeat request sequence number.
   */
  Integer repeatRequestSequenceNumber;

  /**
   * The Repeat request original id.
   */
  UUID repeatRequestOriginalID;

  /**
   * The Match algorithm status code.
   */
  String matchAlgorithmStatusCode;

  /**
   * The Questionable match student id.
   */
  UUID questionableMatchStudentId;

  /**
   * The Info request.
   */
  String infoRequest;

  /**
   * The Record number.
   */
  Integer recordNumber;

  /**
   * The Best match pen.
   */
  String bestMatchPEN;

  /**
   * The Mincode.
   */
  String mincode;

  /**
   * The Submission number.
   */
  String submissionNumber;
}
