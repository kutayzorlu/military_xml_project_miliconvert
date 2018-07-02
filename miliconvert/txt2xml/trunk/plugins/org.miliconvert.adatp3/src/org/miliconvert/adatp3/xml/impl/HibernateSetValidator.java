package org.miliconvert.adatp3.xml.impl;

import java.util.List;

import org.miliconvert.adatp3.IAdapt3Flavour;
import org.miliconvert.adatp3.common.formlets.Set;
import org.miliconvert.adatp3.xml.ISetValidator;

public class HibernateSetValidator implements ISetValidator {

	public HibernateSetValidator(IAdapt3Flavour flavour) {
	}

	@Override
	public void validate(List<Set> sets) {
	  /*
	   * 0 <text>::=[<introductory text>]<main message text>[<closing text>]
          *FORMETS only covers the specification of main text. This
          production is accordingly not part of FORMETS but is included to
          show the relation between the main text and other components
          which might be of relevance. For the same reason the following
          productions will not provide definitions for <introductory text> and
          <closing text>.*
1 <main message text>::=<first set group>[{<set group>}][<remark>]
2 <first set group>::=<EXER-OPER set group><MSGID set group>[<narrativ
  e>][{REF set group}]|<MSGID set group>[{REF set group}]
3 <EXER-OPER set group>::="EXER"<exercise identification set fields><en
          d of set>[<amplification>]|"OPER"<operation codeword set fields><
          end of set>[<amplification>]
          *<exercise identification set fields> and <operation codeword set
          fields> are sequences of <linear field>s as defined in Part III.*
                                     A-4
                                                                       CHANGE 3
                          NATO UNCLASSIFIED
                             NATO UNCLASSIFIED
                                                                     ADatP-3 Part I
  4 <MSGID set group>::="MSGID"<field marker><message text format identifi
           er><additional message identifier set fields><end of set>[<amplificat
           ion>]
           *<additional message identifier set fields> are a sequence of <linear
           field>s as defined in Part III.*
  5 <REF set group>::="REF"<reference set fields><end of set>[<amplification
           >][<narrative>]
           *<reference set fields> are a sequence of <linear field>s as defined
           in Part III.*
  6 <message text format
           identifier>::=<extended character>[{<alphanumeric character>}(0,18
           )<extended character>]
  7 <set group>::=<amplifiable set>[amplification>][<narrative>]
  8 <amplifiable set>::=<linear set>|<columnar set>|<general text>
  9 <amplification>::="AMPN"<free text field><end of set>
 10 <narrative>::="NARR"<free text field><end of set>
 11 <remark>::="RMKS"<free text field><end of set>
 12 <general text>::="GENTEXT"[<new-line>]<subject indication field>[<new-li
           ne>]<free text field><end of set>
 13 <subject indication field>::=<field marker><data code>
*14 <set>::=<linear set>|<columnar set>|<free text set>
*15 <free text set>::=<amplification>|<narrative>|<remark>|<general text>
*16 <segment>::=<set group>[{<set group>|<segment>}]
 17 <free text field>::=<field marker>[{<not-slant character>["/"]}]<not-slant cha
           racter>
 18 <linear set>::=<linear set format identifier>[{[<new-line>]<linear field>}][<ne
           w-line>]<end of set>
 19 <linear field>::=<field marker><linear field content>
           *<linear field> maximum length is 69.*
 20 <linear field content>::=<data code>|<field descriptor><not-hyphen charact
                                      A-5
                                                                         CHANGE 3
                             NATO UNCLASSIFIED
                              NATO UNCLASSIFIED
                                                                        ADatP-3 Part I
            er>[[{<alphanumeric character>}]<extended character>]
 21 <data code>::=<extended character>[[{<alphanumeric character>}]<extend
            ed character>]
 22 <field descriptor>::={<alphabetic character>|<numeric character>}(1,8)":"
 23 <linear set format identifier>::={<alphabetic character>}(3,8)
 24 <columnar set>::=<columnar set format identifier>[<header line>{<new-line
            >{<columnar field>}}[<new-line>]]<end of set>
            *The <header line> shall contain as many <column header>s as the
            number of <columnar field>s specified in the set format. The length
            of a <column header> shall be equal to the length of the corre-
            sponding <columnar field>. Total length of <columnar field>s shall
            not exceed 69 characters.*
 25 <columnar set format identifier>::=<numeric character>{<alphabetic charac
            ter>}(2,7)
 26 <header line>::=<new-line>{"/"<column header>[{<blank character>}]}
 27 <column
            header>::=<extended character>[[{<alphanumeric character>}]<exte
            nded character>]
 28 <columnar field>::=<field marker><columnar field content>
 29 <columnar field content>::=[{<blank character>}]<linear field content>|<line
    ar field content>{<blank character>}
*30 <field content>::=<linear field content>|<columnar field content>
*31 <formatted field>::=<linear field>|<columnar field>|<subject indication field
    >
 32 <field marker>::="/"
 33 <end of set>::="//"<new-line>
 34 <new-line>::=
            *<new-line> represents a code sequence which causes whatever
            follows it to start at the beginning of the next line in a given
            processing environment.
            <new-line> is not a part of the ADatP-3 character set but is included
            in the productions purely to define where a new line must or may
            occur within a message as it will appear to a user.*
                                         A-6
                                                                           CHANGE 3
                              NATO UNCLASSIFIED
                           NATO UNCLASSIFIED
                                                                    ADatP-3 Part I
 35 <blank character>::=" "
           *The character causing a blank (space) to be printed or displayed.*
 36 <numeric character>::="0"|"1"|"2"|"3"|"4"|"5"|"6"|"7"|"8"|"9"
 37 <alphabetic character>::="A"|"B"|"C"|....|"Y"|"Z"
 38 <alphanumeric character>::=<alphabetic character>|<numeric character>|<
           special character>|<blank character>
 39 <special character>::="."|","|"-"|"("|")"|"?"
 40 <extended character>::="-"|<not-hyphen character>
 41 <not-hyphen character>::="."|","|"("|")"|"?"|<alphabetic character>|<numeric
    character>
 42 <not-slant character>::=":"|<new-line>|<alphanumeric character>
*43 <available character>::="/"|<not-slant character>

	   */
	}

}
