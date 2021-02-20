import java.util.*;
public class Dictionary_ASMT1 {

    public static void main(String[] args) {

        String words;
        String[] partsOfSpeeches = {"NOUN","VERB","ADJECTIVE","ADVERB","CONJUNCTION","INTERJECTION","PRONOUN","PREPOSITION"};
         ArrayList<String> ALS = new ArrayList<>();
         Map<String, ArrayList<Dictionary_Entries>> map = new HashMap<>();

        for (Dictionary_Entries Entries : Dictionary_Entries.values()) {
            String k = Entries.getWord().toUpperCase();
            ArrayList<Dictionary_Entries> val;
            if (!map.containsKey(k)) {
                val = new ArrayList<>();
            } else {
                val = map.get(k);
            }
            val.add(Entries);
            String term = Entries.getWord();
            String partOfSpeech = Entries.getPartOfSpeech();
            String definition = Entries.getDefinition();

            map.put(k, val);
        }
        Collections.addAll(ALS, partsOfSpeeches);
        Scanner S = new Scanner(System.in);
        Beginning();
        int i = 1;
        Collections.addAll(ALS, partsOfSpeeches);

        String Entry;
         do{ArrayList<Dictionary_Entries> list = new ArrayList<>();


            System.out.print("Search [" + i + "] :");
            Entry = S.nextLine();
            System.out.println("|");
            Entry.toLowerCase();
            ArrayList<String> EntriesSplit = new ArrayList<>(Arrays.asList(Entry.split(" ")));
            if (!Entry.isBlank()) {
                Entry = Entry.substring(0, 1) + Entry.substring(1);

            }if(Entry.equals("!q")){
                End();
             }
             if (Entry.equals("!help") || Entry.isBlank()) {
                 help();
             }
            if (map.containsKey(EntriesSplit.get(0).toUpperCase())) {

                words = EntriesSplit.get(0).toUpperCase();
                list.addAll(map.get(words));
                if (EntriesSplit.size() > 1 && EntriesSplit.get(1) != null && EntriesSplit.get(1) != "!help") {

                    if (EntriesSplit.get(1).equalsIgnoreCase("REVERSE")) {
                        reverse(list);
                    } else if (EntriesSplit.get(1).equalsIgnoreCase("DISTINCT")) {
                        distinct(list);

                    } else if (ALS.contains(EntriesSplit.get(1).toUpperCase())) {
                        partofspeech(list, EntriesSplit.get(1));
                    } else {
                        errorMessage1(EntriesSplit.get(1));
                    }
                }

                     if (EntriesSplit.size() > 2 && EntriesSplit.get(2) != null && EntriesSplit.get(1) != "!help") {
                    if (EntriesSplit.get(2).equalsIgnoreCase("REVERSE")) {
                        reverse(list);
                    } else if (EntriesSplit.get(2).equalsIgnoreCase("DISTINCT")) {
                        distinct(list);
                        } else {
                        errorMessage2(EntriesSplit.get(2));
                    }
                }  if (EntriesSplit.size() > 3 && EntriesSplit.get(3) != null && EntriesSplit.get(1) != "!help") {
                    if (EntriesSplit.get(3).equalsIgnoreCase("REVERSE")) {
                        reverse(list);
                    } else {
                        errorMessage3(EntriesSplit.get(3));

                    }
                }
                  else if (EntriesSplit.size() > 1 && !map.containsKey(EntriesSplit.get(1).toUpperCase()) && EntriesSplit.get(1) != "!help") {
                    System.out.println("Not Found");
                }
}



            printStuff(list);
            i++;
        } while (!Entry.equals("!q"));



        }


    public static void Beginning() {
        System.out.println("! Loading data...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("! Loading completed...");
        System.out.println(" ");
        System.out.println("===== DICTIONARY 340 JAVA =====\n" +
                "----- Keywords: 19\n" +
                "----- Definitions: 61");
    }
    public static void help() {

        System.out.println(
                "PARAMETER HOW-TO, please enter: \n" +
                "1. A search key -then 2. An optional part of speech -then\n" +
                "3. An optional 'distinct' -then 4. An optional 'reverse'");

    }
    public static void End() {
        System.out.println();
        System.out.println("-----THANK YOU-----");
}
    public static void NotFound() {
        System.out.println("<NOT FOUND> To be considered for the next release. Thank you.");
        help();

    }
    public static void errorMessage1(String wordPassed) {
        System.out.println("<The entered 2nd parameter '" + wordPassed + "' is NOT a part of speech.>\n" +
                "<The entered 2nd parameter '" + wordPassed + "' is NOT 'distinct'.>\n" +
                "<The entered 2nd parameter '" + wordPassed + "' is NOT 'reverse'.>\n" +
                "<The entered 2nd parameter '" + wordPassed + "' was disregarded.>\n" +
                "<The 2nd parameter should be a part of speech or 'distinct' or 'reverse'.>");
        System.out.println("|");
    }
    public static void errorMessage2(String wordPassed) {
        System.out.println("<The entered 3rd parameter '" + wordPassed + "' is NOT 'distinct'.>\n" +
                "<The entered 3rd parameter '\" "+ wordPassed+ "\"' is NOT 'reverse'.>\n" +
                "<The entered 3rd parameter \""+ wordPassed+ "\" was disregarded.>\n" +
                "<The 3rd parameter should be 'distinct' or 'reverse'.>");
    }
    public static void errorMessage3(String wordPassed) {
        System.out.println("|\n" +
                "<The entered 4th parameter '" + wordPassed + "' is NOT 'reverse'.>\n" +
                "<The entered 4th parameter '" + wordPassed + "' was disregarded.>\n" +
                "<The 4th parameter should be 'reverse'.>");
        System.out.println("|");
    }
    public static void reverse(ArrayList<Dictionary_Entries> valuePassed) {
        Collections.reverse(valuePassed);
    }
    public static void distinct(ArrayList<Dictionary_Entries> valuePassed) {
    for(int i=0; i < valuePassed.size(); i++){
    for (int a=i+1; a<valuePassed.size(); a++){
    boolean storeBoolean = valuePassed.get(i).getDefinition().equalsIgnoreCase(valuePassed.get(a).getDefinition());
    boolean storeBoolean1 = valuePassed.get(i).getPartOfSpeech().equalsIgnoreCase(valuePassed.get(a).getPartOfSpeech());
    if( storeBoolean && storeBoolean1){
       valuePassed.remove(valuePassed.get(a));
       a--;
        }
        }
        }
    }
    public static void printStuff(ArrayList<Dictionary_Entries> wordPassed) {
        for (Dictionary_Entries variable : wordPassed) {
            System.out.println(variable);
        }
        System.out.println("|");

    }
    public static void partofspeech(ArrayList<Dictionary_Entries> wordPassed, String string) {

        for (int i = 0; i < wordPassed.size(); i++) {
            boolean var = true;
            if (!wordPassed.get(i).getPartOfSpeech().equalsIgnoreCase(string)) {
                wordPassed.remove((wordPassed.get(i)));
                i--;

            } else {
var = false;
                if (var) {
                    NotFound();
                    help();
                }
            }

        }


    }

}