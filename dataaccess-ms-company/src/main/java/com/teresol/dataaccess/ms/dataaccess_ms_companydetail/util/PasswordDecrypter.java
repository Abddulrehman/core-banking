package com.teresol.dataaccess.ms.dataaccess_ms_companydetail.util;
import java.util.Vector;

public class PasswordDecrypter {

    public static String getDecryptPsw(String lcl_user_id, String lcl_psw) {
        int lcl_codesetindex = -1;
        // vector for storing the Code Set
        Vector lcl_codeset = new Vector(2, 2);
        lcl_codeset.addElement("0");
        lcl_codeset.addElement("*");
        lcl_codeset.addElement("1");
        lcl_codeset.addElement("N");
        lcl_codeset.addElement("2");
        lcl_codeset.addElement("G");
        lcl_codeset.addElement("3");
        lcl_codeset.addElement("Z");
        lcl_codeset.addElement("4");
        lcl_codeset.addElement("=");
        lcl_codeset.addElement("5");
        lcl_codeset.addElement("R");
        lcl_codeset.addElement("6");
        lcl_codeset.addElement("A");
        lcl_codeset.addElement("7");
        lcl_codeset.addElement("P");
        lcl_codeset.addElement("8");
        lcl_codeset.addElement("3");
        lcl_codeset.addElement("9");
        lcl_codeset.addElement("?");
        lcl_codeset.addElement("10");
        lcl_codeset.addElement("K");
        lcl_codeset.addElement("11");
        lcl_codeset.addElement("2");
        lcl_codeset.addElement("12");
        lcl_codeset.addElement("Q");
        lcl_codeset.addElement("13");
        lcl_codeset.addElement("/");
        lcl_codeset.addElement("14");
        lcl_codeset.addElement("V");
        lcl_codeset.addElement("15");
        lcl_codeset.addElement("6");
        lcl_codeset.addElement("16");
        lcl_codeset.addElement("D");
        lcl_codeset.addElement("17");
        lcl_codeset.addElement("F");
        lcl_codeset.addElement("18");
        lcl_codeset.addElement("O");
        lcl_codeset.addElement("19");
        lcl_codeset.addElement("C");
        lcl_codeset.addElement("20");
        lcl_codeset.addElement("X");
        lcl_codeset.addElement("21");
        lcl_codeset.addElement("9");
        lcl_codeset.addElement("22");
        lcl_codeset.addElement("M");
        lcl_codeset.addElement("23");
        lcl_codeset.addElement(";");
        lcl_codeset.addElement("24");
        lcl_codeset.addElement("U");
        lcl_codeset.addElement("25");
        lcl_codeset.addElement("8");
        lcl_codeset.addElement("26");
        lcl_codeset.addElement("J");
        lcl_codeset.addElement("27");
        lcl_codeset.addElement("E");
        lcl_codeset.addElement("28");
        lcl_codeset.addElement("I");
        lcl_codeset.addElement("29");
        lcl_codeset.addElement("4");
        lcl_codeset.addElement("30");
        lcl_codeset.addElement("T");
        lcl_codeset.addElement("31");
        lcl_codeset.addElement(":");
        lcl_codeset.addElement("32");
        lcl_codeset.addElement("1");
        lcl_codeset.addElement("33");
        lcl_codeset.addElement("Y");
        lcl_codeset.addElement("34");
        lcl_codeset.addElement("S");
        lcl_codeset.addElement("35");
        lcl_codeset.addElement("W");
        lcl_codeset.addElement("36");
        lcl_codeset.addElement("B");
        lcl_codeset.addElement("37");
        lcl_codeset.addElement("<");
        lcl_codeset.addElement("38");
        lcl_codeset.addElement("5");
        lcl_codeset.addElement("39");
        lcl_codeset.addElement("0");
        lcl_codeset.addElement("40");
        lcl_codeset.addElement(">");
        lcl_codeset.addElement("41");
        lcl_codeset.addElement("H");
        lcl_codeset.addElement("42");
        lcl_codeset.addElement("L");
        lcl_codeset.addElement("43");
        lcl_codeset.addElement("7");

        // vector for storing the Key Code of user id
        Vector lcl_keycode = new Vector(1, 1);
        String val_sec_password = lcl_psw;
        int lcl_passwordlen = val_sec_password.length();
        String lcl_userchar = null;
        char lcl_passwordchar;
        int lcl_ord = 0;
        int lcl_tempcode = 0;
        int lcl_mostprev = 0;
        int lcl_tempaftadd = 0;
        String lcl_decryppsw = "";
        String lcl_char = null;
        int lcl_mod = 0;
        int lcl_keycodeindex = 0;
        String lcl_code = null;

        /*********************************************************************************************/
        /********************************
         * Finding Key Code of User Id
         ********************************/
        /*********************************************************************************************/

        //////////////// Calculating value for First pair of digits of the Key
        //////////////// code////////////////////
        // constant char ';'
        lcl_keycode.addElement("23");
        // user char at 6th position
        lcl_userchar = lcl_user_id.substring(5, 6).toUpperCase();
        // finding the ordinal value for it
        for (int lcl_i = 0; lcl_i < 44; lcl_i++) {
            if (lcl_codeset
                    .elementAt(lcl_codesetindex + 2)
                    .toString()
                    .equals(lcl_userchar))
                lcl_ord = Integer.parseInt(
                        lcl_codeset.elementAt(lcl_codesetindex + 1).toString());
            lcl_codesetindex = lcl_codesetindex + 2;
        }
        // adding constant char ordinal value to that of user char. and setting the
        // added value in the key code
        if ((23 + lcl_ord) > 99) {
            lcl_code = String.valueOf(23 + lcl_ord).substring(1, 3);
            lcl_keycode.setElementAt(lcl_code, 0);
        } else
            lcl_keycode.setElementAt(String.valueOf(23 + lcl_ord), 0);

        //////////////// Calculating value for Second pair of digits of the Key
        //////////////// code////////////////////
        // constant char '>'
        lcl_keycode.addElement("40");
        // user char at 2nd position
        lcl_userchar = lcl_user_id.substring(1, 2).toUpperCase();
        // finding the ordinal value for it
        lcl_codesetindex = -1;
        for (int lcl_i = 0; lcl_i < 44; lcl_i++) {
            if (lcl_codeset
                    .elementAt(lcl_codesetindex + 2)
                    .toString()
                    .equals(lcl_userchar))
                lcl_ord = Integer.parseInt(
                        lcl_codeset.elementAt(lcl_codesetindex + 1).toString());
            lcl_codesetindex = lcl_codesetindex + 2;
        }
        // adding constant char ordinal value to that of user char. and setting the
        // added value in the key code
        if ((40 + lcl_ord) > 99) {
            lcl_code = String.valueOf(40 + lcl_ord).substring(1, 3);
            lcl_keycode.setElementAt(lcl_code, 1);
        } else
            lcl_keycode.setElementAt(String.valueOf(40 + lcl_ord), 1);

        //////////////// Calculating value for Third pair of digits of the Key
        //////////////// code////////////////////
        // constant char 'F'
        lcl_keycode.addElement("17");
        // user char at 3rd position
        lcl_userchar = lcl_user_id.substring(2, 3).toUpperCase();
        // finding the ordinal value for it
        lcl_codesetindex = -1;
        for (int lcl_i = 0; lcl_i < 44; lcl_i++) {
            if (lcl_codeset
                    .elementAt(lcl_codesetindex + 2)
                    .toString()
                    .equals(lcl_userchar))
                lcl_ord = Integer.parseInt(
                        lcl_codeset.elementAt(lcl_codesetindex + 1).toString());
            lcl_codesetindex = lcl_codesetindex + 2;
        }
        // adding constant char ordinal value to that of user char. and setting the
        // added value in the key code
        if ((17 + lcl_ord) > 99) {
            lcl_code = String.valueOf(17 + lcl_ord).substring(1, 3);
            lcl_keycode.setElementAt(lcl_code, 2);
        } else
            lcl_keycode.setElementAt(String.valueOf(17 + lcl_ord), 2);

        //////////////// Calculating value for Fourth pair of digits of the Key
        //////////////// code////////////////////
        // constant char '@'
        lcl_keycode.addElement(String.valueOf(lcl_ord));
        // user char at 1st position
        lcl_userchar = lcl_user_id.substring(0, 1).toUpperCase();
        // finding the ordinal value for it
        lcl_codesetindex = -1;
        for (int lcl_i = 0; lcl_i < 44; lcl_i++) {
            if (lcl_codeset
                    .elementAt(lcl_codesetindex + 2)
                    .toString()
                    .equals(lcl_userchar))
                lcl_ord = Integer.parseInt(
                        lcl_codeset.elementAt(lcl_codesetindex + 1).toString());
            lcl_codesetindex = lcl_codesetindex + 2;
        }
        // adding constant char ordinal value to that of user char. and setting the
        // added value in the key code
        if (((Integer.parseInt(lcl_keycode.elementAt(3).toString())) + lcl_ord) > 99) {
            lcl_code = String
                    .valueOf(
                            (Integer.parseInt(lcl_keycode.elementAt(3).toString())) + lcl_ord)
                    .substring(1, 3);
            lcl_keycode.setElementAt(lcl_code, 3);
        } else
            lcl_keycode.setElementAt(
                    String.valueOf(
                            (Integer.parseInt(lcl_keycode.elementAt(3).toString())) + lcl_ord),
                    3);

        //////////////// Calculating value for Fifth pair of digits of the Key
        //////////////// code////////////////////
        // constant char 'R'
        lcl_keycode.addElement("5");
        // user char at 1st position
        lcl_userchar = lcl_user_id.substring(0, 1).toUpperCase();
        // finding the ordinal value for it
        lcl_codesetindex = -1;
        for (int lcl_i = 0; lcl_i < 44; lcl_i++) {
            if (lcl_codeset
                    .elementAt(lcl_codesetindex + 2)
                    .toString()
                    .equals(lcl_userchar))
                lcl_ord = Integer.parseInt(
                        lcl_codeset.elementAt(lcl_codesetindex + 1).toString());
            lcl_codesetindex = lcl_codesetindex + 2;
        }
        // adding constant char ordinal value to that of user char. and setting the
        // added value in the key code
        if ((5 + lcl_ord) > 99) {
            lcl_code = String.valueOf(5 + lcl_ord).substring(1, 3);
            lcl_keycode.setElementAt(lcl_code, 4);
        } else
            lcl_keycode.setElementAt(String.valueOf(5 + lcl_ord), 4);

        //////////////// Calculating value for Sixth pair of digits of the Key
        //////////////// code////////////////////
        // constant char '6'
        lcl_keycode.addElement("15");
        // user char at 3rd position
        lcl_userchar = lcl_user_id.substring(2, 3).toUpperCase();
        // finding the ordinal value for it
        lcl_codesetindex = -1;
        for (int lcl_i = 0; lcl_i < 44; lcl_i++) {
            if (lcl_codeset
                    .elementAt(lcl_codesetindex + 2)
                    .toString()
                    .equals(lcl_userchar))
                lcl_ord = Integer.parseInt(
                        lcl_codeset.elementAt(lcl_codesetindex + 1).toString());
            lcl_codesetindex = lcl_codesetindex + 2;
        }
        // adding constant char ordinal value to that of user char. and setting the
        // added value in the key code
        if (((Integer.parseInt(lcl_keycode.elementAt(0).toString()) + lcl_ord)) > 99) {
            lcl_code = String
                    .valueOf(
                            (Integer.parseInt(lcl_keycode.elementAt(0).toString()) + lcl_ord))
                    .substring(1, 3);
            lcl_keycode.setElementAt(lcl_code, 0);
        } else
            lcl_keycode.setElementAt(
                    String.valueOf(
                            (Integer.parseInt(lcl_keycode.elementAt(0).toString()) + lcl_ord)),
                    0);

        //////////////// Calculating value for Seventh pair of digits of the Key
        //////////////// code////////////////////
        // constant char '?'
        lcl_keycode.addElement("09");
        // user char at 6th position
        lcl_userchar = lcl_user_id.substring(5, 6).toUpperCase();
        // finding the ordinal value for it
        lcl_codesetindex = -1;
        for (int lcl_i = 0; lcl_i < 44; lcl_i++) {
            if (lcl_codeset
                    .elementAt(lcl_codesetindex + 2)
                    .toString()
                    .equals(lcl_userchar))
                lcl_ord = Integer.parseInt(
                        lcl_codeset.elementAt(lcl_codesetindex + 1).toString());
            lcl_codesetindex = lcl_codesetindex + 2;
        }
        // adding constant char ordinal value to that of user char. and setting the
        // added value in the key code
        if (((Integer.parseInt(lcl_keycode.elementAt(0).toString()) + lcl_ord)) > 99) {
            lcl_code = String
                    .valueOf(
                            (Integer.parseInt(lcl_keycode.elementAt(0).toString()) + lcl_ord))
                    .substring(1, 3);
            lcl_keycode.setElementAt(lcl_code, 0);
        } else
            lcl_keycode.setElementAt(
                    String.valueOf(
                            (Integer.parseInt(lcl_keycode.elementAt(0).toString()) + lcl_ord)),
                    0);

        //////////////// Calculating value for Eighth pair of digits of the Key
        //////////////// code////////////////////
        // constant char 'U'
        lcl_keycode.addElement("24");
        // user char at 4th position
        lcl_userchar = lcl_user_id.substring(3, 4).toUpperCase();
        // finding the ordinal value for it
        lcl_codesetindex = -1;
        for (int lcl_i = 0; lcl_i < 44; lcl_i++) {
            if (lcl_codeset
                    .elementAt(lcl_codesetindex + 2)
                    .toString()
                    .equals(lcl_userchar))
                lcl_ord = Integer.parseInt(
                        lcl_codeset.elementAt(lcl_codesetindex + 1).toString());
            lcl_codesetindex = lcl_codesetindex + 2;
        }
        // adding constant char ordinal value to that of user char. and setting the
        // added value in the key code
        if (((Integer.parseInt(lcl_keycode.elementAt(0).toString()) + lcl_ord)) > 99) {
            lcl_code = String
                    .valueOf(
                            (Integer.parseInt(lcl_keycode.elementAt(0).toString()) + lcl_ord))
                    .substring(1, 3);
            lcl_keycode.setElementAt(lcl_code, 0);
        } else
            lcl_keycode.setElementAt(
                    String.valueOf(
                            (Integer.parseInt(lcl_keycode.elementAt(0).toString()) + lcl_ord)),
                    0);

        //////////////// Calculating value for Ninth pair of digits of the Key
        //////////////// code////////////////////
        // constant char 'M'
        lcl_keycode.addElement("22");
        // user char at 5th position
        lcl_userchar = lcl_user_id.substring(4, 5).toUpperCase();
        // finding the ordinal value for it
        lcl_codesetindex = -1;
        for (int lcl_i = 0; lcl_i < 44; lcl_i++) {
            if (lcl_codeset
                    .elementAt(lcl_codesetindex + 2)
                    .toString()
                    .equals(lcl_userchar))
                lcl_ord = Integer.parseInt(
                        lcl_codeset.elementAt(lcl_codesetindex + 1).toString());
            lcl_codesetindex = lcl_codesetindex + 2;
        }
        // adding constant char ordinal value to that of user char. and setting the
        // added value in the key code
        if ((22 + lcl_ord) > 99) {
            lcl_code = String.valueOf(22 + lcl_ord).substring(1, 3);
            lcl_keycode.setElementAt(lcl_code, 8);
        } else
            lcl_keycode.setElementAt(String.valueOf(22 + lcl_ord), 8);

        //////////////// Calculating value for Tenth pair of digits of the Key
        //////////////// code////////////////////
        // constant char 'X'
        lcl_keycode.addElement("20");
        // user char at 2nd position
        lcl_userchar = lcl_user_id.substring(1, 2).toUpperCase();
        // finding the ordinal value for it
        lcl_codesetindex = -1;
        for (int lcl_i = 0; lcl_i < 44; lcl_i++) {
            if (lcl_codeset
                    .elementAt(lcl_codesetindex + 2)
                    .toString()
                    .equals(lcl_userchar))
                lcl_ord = Integer.parseInt(
                        lcl_codeset.elementAt(lcl_codesetindex + 1).toString());
            lcl_codesetindex = lcl_codesetindex + 2;
        }
        // adding constant char ordinal value to that of user char. and setting the
        // added value in the key code
        if ((20 + lcl_ord) > 99) {
            lcl_code = String.valueOf(20 + lcl_ord).substring(1, 3);
            lcl_keycode.setElementAt(lcl_code, 9);
        } else
            lcl_keycode.setElementAt(String.valueOf(20 + lcl_ord), 9);

        /*********************************************************************************************/
        /********************************
         * Decrypting the Password
         **************************************/
        /*********************************************************************************************/
        for (int lcl_i = 0; lcl_i < lcl_passwordlen; lcl_i++) {
            // getting password char
            lcl_passwordchar = val_sec_password.charAt(lcl_i);
            // finding the ordinal value for it
            lcl_codesetindex = -1;
            for (int lcl_j = 0; lcl_j < 44; lcl_j++) {
                if (lcl_codeset
                        .elementAt(lcl_codesetindex + 2)
                        .toString()
                        .equals(String.valueOf(lcl_passwordchar)))
                    lcl_ord = Integer.parseInt(
                            lcl_codeset.elementAt(lcl_codesetindex + 1).toString());
                lcl_codesetindex = lcl_codesetindex + 2;
            }
            if (lcl_ord < 43) {
                // adding the ordinal value to 43
                lcl_tempcode = lcl_ord + 43;
            }
            if (lcl_ord >= 43) {
                // take the value as it is
                lcl_tempcode = lcl_ord;
            }
            lcl_tempaftadd = lcl_tempcode;
            // Subtracting the key code value at the respective position from the temp code
            lcl_tempcode = lcl_tempcode
                    - Integer.parseInt(lcl_keycode.elementAt(lcl_i).toString());

            // if temp code is less than zero
            if (lcl_tempcode < 0) {
                lcl_tempcode = lcl_tempcode
                        + Integer.parseInt(lcl_keycode.elementAt(lcl_i).toString())
                        + 43;
                lcl_tempaftadd = lcl_tempcode;
                // Subtracting the key code value at the respective position from the temp code
                lcl_tempcode = lcl_tempcode
                        - Integer.parseInt(lcl_keycode.elementAt(lcl_i).toString());
            }

            if (lcl_mostprev == lcl_tempcode) {
                lcl_decryppsw = lcl_decryppsw;
                return lcl_decryppsw;
            }
            // if temp code is grester than 43
            if (lcl_tempcode > 43) {
                lcl_tempcode = lcl_tempcode - 43;
                lcl_tempaftadd = lcl_tempcode;
            }
            // finding the character value for it
            lcl_codesetindex = -1;
            for (int lcl_k = 0; lcl_k < 44; lcl_k++) {
                if (lcl_codeset
                        .elementAt(lcl_codesetindex + 1)
                        .toString()
                        .equals(String.valueOf(lcl_tempcode)))
                    lcl_char = lcl_codeset.elementAt(lcl_codesetindex + 2).toString();
                lcl_codesetindex = lcl_codesetindex + 2;
            }
            // saving the encrypted character in a variable
            lcl_decryppsw = lcl_decryppsw + lcl_char;
            lcl_mostprev = lcl_tempaftadd;
        }
        return lcl_decryppsw;
    }

}
