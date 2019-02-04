import com.ncu.assignment.exception.*;
import com.ncu.assignment.validation.StudentValidationError;
package com.ncu.assignment.validation;
public class StudentValidation
{
	public static void validateDate(Date D) throw DateFormatException
	{
	if((D.day<0|| D.day>31) || (D.month<0 || D.month>12)|| (D.year<0))
	throw new DateFormatException(date);
	}
	public static void validateMandatoryField(String fName,Address ad,Date dob,String email,String CNo) throw MandatoryMissingException
	{
	if (fname= null||ad== null||dob== null||email== null|| CNo=null)
	throw new MandatoryMissingException(mandatory);
	}
	public static void validateSkills(int skill) throw MandatoryMissingException
	{
	if(skill<1)
	throw new MandatoryMissingException(mandatory);
	}
	public static void validateQual(int qual) throw MandatoryMissingExceptionn
	{
	if(qual<1)
	throw new MandatoryMissingException(mandatory)
	}
}