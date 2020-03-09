class Identifiers {

    public static void main(String[] args) {

        // legal
        int _a;
        int $c;
        int ______2_w;
        int _$;
        int this_is_very_detailed_name_for_my_good_and_beautiful_variable;

        // illegal
        int :b;
        int -d;
        int e#;
        int .f;
        int 7g;
    }

    // class names (nouns)
    class Dog {}
    class Account {}
    class PrintWriter {}

    // interface names (adjectives)
    interface Runnable {}
    interface Serializable {}

    // methods names (verb-noun)
    public static void getBalance() {}
    public static void doCalculation() {}
    public static void setCustomerName() {}

    // variable names
    int buttonWidth;
    int accountBalance;
    String myString;

    // constants
    int MIN_HEIGHT;
    int PI;

}