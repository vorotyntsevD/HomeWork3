package ua.org.oa.mrsuperdan;

public class Main {
// Just one solution
    public static void main(String[] args) {
        String text = "A new report on the state of American youth says teenagers are very concerned about the direction their nation is taking. They feel the upcoming presidential election will have as big impact on their lives, as the presidential election in 2004." +
                "The survey released by the Horatio Alger Association of Distinguished Americans looked at the views of more than 1000 young people aged 13 to l9. According to that study, 62 percent of the U.S. teens believed the Kerry-Bush election in 2004 would make a large difference in the direction of the country and 70 percent said they cared who would win." +
                "Allan Rivlin, a senior vice president with Peter Hart Research, says today young people are more involved with their society and know what is happening. He notes, \"They are paying attention to the Iraq war\". The young people surveyed also expressed concern over the employment and recession situation in America. But Rivlin says their greatest area of apprehension \"has to do with issues like gay marriage and abortion\" . These social issues topped the list of concerns among the young." +
                "One promising revelation of Rivlin’s report is that the U.S. teenagers have a high opinion of their parents in general. In the report, 77 percent of teens say they get along with their parents or guardians. They have a great deal of admiration for their parents as well." +
                "\"Overwhelmingly students say they have good relations with their family\", says Rivlin, \"and when we ask them to pick a role model, it’s not sports stars or entertainment figures that get picked most. Fifty-one percent say their parents are their role model. Also notable, the researcher says, is the fact that \"for the first time we see dads catching up with moms\" in terms of who the young people name as their role models" +
                "Rivlin says, the survey suggests that even though American youth is facing great pressure to conform, to get good grades, and to look a certain way. But still, the young find the support networks they need.";

        Solution solution = new Solution();
        solution.countWords(text);
        searchWord("says", solution);
    }

    public static void searchWord(String word, Solution solution) {
        System.out.println("Слово '" + word + "' встречается " +
                solution.getWordCount(word) + " раз");
    }

}

