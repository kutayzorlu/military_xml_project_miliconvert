package org.miliconvert.adatp3.language;

/**
 * 
 * @author matthieu
 *
 */
public class Statement {

	/**
	 *  Use of the left operand is required within this occur-
	 rence of the containing set or segment. If the left
	 operand is a set or segment on level 0 (not con-
	 tained within a segment), its use is required within
	 the message. If the left operand is a field, that field
	 must contain a data code that is associated with the
	 field. The use of a hyphen (-) in a required field is
	 illegal.

	 */
	public static String Q= "Q";
	
	
	/**
	 * Use of the left operand is prohibited within this oc-
		currence of the containing set or segment. If the
		left operand is a set or segment on level 0 (not con-
		tained within a segment), its use is prohibited within
		the message. If the left operand is a field, that field
		must not contain a data code. It must contain a
		hyphen (-) or be omitted by truncation as described
		in paragraph 509.

	 */
	public static String P= "P";
	
	/**
	 * 
	 * Use of the left operand is required within this occur-
		rence of the containing set or segment if the associ-
		ated condition evaluates true, otherwise its use is
		prohibited. The meaning of required and prohibited
		are as described above for the directors Q and P.

	 * 
	 */
	public static String QP= "QP";
	
	
	
	/**
	 * A The left operand is assigned the value of the
		  right operand. The left operand must be a field
		  and the right operand must be a literal value.
		  No condition may be associated with a state-
		  ment using the A director. A field with an as-
		  signed value may not be used as an operand in
		  any condition. A field with an assigned value
		  may be used by automated systems as an aid in
		  the identification of sets in a received message.
		   For example, several GENTEXT sets may be
		  scheduled in sequence in an MTF. By assigning
		  a value to the first field in each of those sets, a
		  receiving system is able to determine exactly
		  which of the GENTEXT sets have been included
		  in the received message. Another use of this di-
		  rector is to enable automated systems to pre-
		    populate fields in sets, such as the first field in
		    sets MSGID and GENTEXT. In automated sys-
		    tems, this field should not be over - writable. A
		    received message with a value other than the
		    assigned value should be treated as an incorrect
		    message.
		  = The left operand must equal or contain the right
		    operand. The exact meaning is largely
		    dependent upon the operands themselves. For
		    example, if the right operand is a FUD (des-
		    ignated by its FFIRN/FUDN), then that FUD
		    must be selected as the alternative content for
		    the field indicated by the left operand.
		 != The left operand must not equal or contain the
		    right operand.
		  > The left operand must be numerically greater
		    than the right operand.
		  < The left operand must be numerically less than
		    the right operand.
		@= The left operand must occur the number of
		    times indicated by the right operand.
		@> The left operand must occur greater than the
		    number of times indicated by the right operand.
		@< The left operand must occur less than the num-
		    ber of times indicated by the right operand.
		@! The left operand must not occur the number of
		    times indicated by the right operator.
		?< The left operand must be less in length than
		    indicated by the right operand. The principal
		    use of this director is to restrict the size of a field
		    to something less than the FUD would normally
		    allow.

	 * 
	 */
	
	
	/**
	 *  Set. (n)
	 *  Segment. <(nS)> or <(nI)>
	 *  Field Group. <(n)FG>
	 *  Field. <(n)Fm>
	 */
	private String leftOp;
	
	/**
	 * 
	 */
	private String director;
	
	
	/**
	 *  Set. (n)
	 *  Segment. <(nS)> or <(nI)>
	 *  Field Group. <(n)FG>
	 *  Field. <(n)Fm>
	 *  Literal. <"literal"> 
	 *  Coded Value. <"code">
	 *  Numerics. <n>
	 *  Alternative Contents. <FFnnnn-nnn>
	 *  Remaining. <R>
	 *  Remaining, Modified. <R+n>
	 */
	private String rightOp;
	
	
}
