public class lexical_analyzer {
    public static String[] lex_analyze(String lexemes ){
        String[] lexemes_array = lexemes.split("\\s+");

        // print the lexemes_array
        for (int i = 0; i < lexemes_array.length; i++) {
            System.out.println(lexemes_array[i]);
        }
        return lexemes_array;
    }

    public static String getTokenofCobol(String str) {
        // try to match the string with the cobol keywords in declaring variables
        


        return str;
    }
}
