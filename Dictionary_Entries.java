public enum Dictionary_Entries {
    Arrow("Arrow","noun", "Here is one arrow, <IMG> -=>> </IMG>"),
    Book("Book", "noun", "A set of pages."),
    Book1("Book", "noun", "A written work published in printed or electronic form."),
    Book2("Book", "verb", "To arrange for someone to have a seat on a plane."),
    Book3("Book", "verb",  "To arrange something on a particular date."),
    Distinct("Distinct", "adjective", "Familiar. Worked in Java."),
    Distinct1("Distinct", "adjective", "Familiar. Worked in Java."),
    Distinct8("Distinct", "adjective", "Unique. No duplicates. Clearly different or of a different kind."),
    Distinct2("Distinct", "adverb",  "Uniquely. Written \"distinctly\"."),
    Distinct3("Distinct", "noun",  "A keyword in this assignment."),
    Distinct4("Distinct", "noun",  "A keyword in this assignment."),
    Distinct5("Distinct", "noun",  "A keyword in this assignment."),
    Distinct6("Distinct", "noun",  "An advanced search option."),
    Distinct7("Distinct", "noun",  "Distinct is a parameter in this assignment."),

    Placeholder("Placeholder", "adjective", "To be updated..."),
    Placeholder1("Placeholder", "adjective", "To be updated..."),
    Placeholder2("Placeholder", "adverb", "To be updated..."),
    Placeholder3("Placeholder", "conjunction", "To be updated..."),
    Placeholder4("Placeholder", "interjection", "To be updated..."),
    Placeholder5("Placeholder", "noun", "To be updated..."),
    Placeholder6("Placeholder", "noun", "To be updated..."),
    Placeholder7("Placeholder", "noun", "To be updated..."),
    Placeholder8("Placeholder", "preposition", "To be updated..."),
    Placeholder9("Placeholder", "pronoun", "To be updated..."),
    Placeholder10("Placeholder", "verb", "To be updated..."),
    Reverse("Reverse", "adjective",  "On back side."),
    Reverse1("Reverse", "adjective",  "Opposite to usual or previous arrangement."),
    Reverse2("Reverse", "noun", "A dictionary program's parameter."),
    Reverse3("Reverse", "noun", "Change to opposite direction."),
    Reverse4("Reverse", "noun", "The opposite."),
    Reverse5("Reverse", "noun", "To be updated..."),
    Reverse6("Reverse", "noun", "To be updated..."),
    Reverse7("Reverse", "noun", "To be updated..."),
    Reverse8("Reverse", "noun", "To be updated..."),
    Reverse9("Reverse", "verb", "Change something to opposite."),
    Reverse10("Reverse", "verb", "Go back"),
    Reverse11("Reverse", "verb", "Revoke ruling."),
    Reverse12("Reverse", "verb", "To be updated..."),
    Reverse13("Reverse", "verb", "To be updated..."),
    Reverse14("Reverse", "verb", "Turn something inside out."),
    leave("Leave", "verb", "to go out of or away from, as a place."),
    leave2("Leave", "verb", "to go away, depart, or set out:"),
    kidney("Kidney", "noun", " either of a pair of bean-shaped organs in the back part of the abdominal cavity that form and excrete urine, regulate fluid and electrolyte balance, and act as endocrine glands."),
    kidney1("Kidney", "noun", "a corresponding organ in other vertebrate animals or an organ of like function in invertebrates."),
    Cunning("Cunning", "adjective", "showing or made with ingenuity."),
    Offset("Offset", "noun", "something that counterbalances, counteracts, or compensates for something else; compensating equivalent."),
    Offset1("Offset", "noun", "the start, beginning, or outset."),
    Whole("Whole", "adjective", "comprising the full quantity, amount, extent, number, etc., without diminution or exception; entire, full, or total"),
    Easy("Easy", "adjective", "not hard or difficult; requiring no great labor or effort"),
    Easy1("Easy", "adverb", "in an easy manner; comfortably:"),
    Consensus("Consensus", "noun", "majority of opinion"),
    Consensus1("Consensus", "noun", "general agreement or concord; harmony."),
    Ample("Ample", "adjective", "of sufficient or abundant measure; liberal; copious"),
    South("South", "noun", "a cardinal point of the compass lying directly opposite north. "),
    South1("South", "adjective", "lying toward or situated in the south; directed or proceeding toward the south."),
    Bio("Biography", "noun", "a written account of another person's life"),
    Bio1("Biography", "noun", "an account in biographical form of an organization, society, theater, animal, etc."),
    Liberal("Liberal", "adjective", "favorable to progress or reform, as in political or religious affairs."),
    Confederate("Confederate", "adjective", "united in a league, alliance, or conspiracy."),
    Confederate1("Confederate", "adjective", "(initial capital letter) of or relating to the Confederate States of America:\n" +
            "the Confederate army."),
    Brush("Brush", "noun", "an implement consisting of bristles, hair, or the like, set in or attached to a handle, used for painting, cleaning, polishing, grooming, etc."),
    Crouch("Crouch", "verb", "to stoop or bend low.");


    private final String name;
    private final String partOfSpeech;
    private final String Definition;

    Dictionary_Entries(String word, String POS, String def){
    name = word;
    partOfSpeech = POS;
    Definition = def;
    }
    public String getWord(){
    return name;
    }
    public String getPartOfSpeech(){
     return partOfSpeech;
    }
    public String getDefinition(){
        return Definition;
    }
    @Override
    public String toString(){
    return name + "["+partOfSpeech+"] : "+ Definition;

    }

}
