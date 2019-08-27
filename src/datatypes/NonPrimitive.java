package datatypes;

public class NonPrimitive {
    public static void main(String[] args) {

        // String literal

        String name= "John";

        // Using new key words

        String city = new String ("Astoria");

        // Substring   - we can extract substring from a larger string

        String s = "Peter Liang";
        String t = s.substring(0,3);  // second parameter is exclusive, so for 0,3 it will print upto 0,1,2 and exculde 3. so will print "Pet"
        System.out.println(t);

        // Concatenate two strings

        String studentName="Peter Liang";
        String studentCity= "North Bergen";
        System.out.println(studentName + " "  + "," + " " + studentCity);

        // String Length - Returns # of characters in a string

        String school="PeopleNTech";   // retrun 11
        System.out.println(school.length());

        // StringtoLowerCase - converts all the characters in a string to lower case

        String jobTitle="QA ENGINEER";
        System.out.println(jobTitle.toLowerCase());

        // String toUpperCase(): Converts all the characters in the String to upper case

        String employer="conduent";
        System.out.println(employer.toUpperCase());

        // String Trim - remove whitespaces at both ends, does'not affect spaces in middle

        String myName= "     Tashfia Imani     ";
        System.out.println(myName.trim());

        //  String replace (char oldChar, char newChar): Returns new string by replacing all occurrences of oldChar with newChar.

        String p= "abcdabcdabcdefg";
        System.out.println(p.replace('a' , 'n'));
    }
}
