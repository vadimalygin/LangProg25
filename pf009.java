static int score(String word) {
    return word.replaceAll("r","").length();
}
score("rrr")
score("rrimrvrmiv")
List<Integer> list1 = new ArrayList<>();
list1.add(1)
list1.add(3)
list1.add(-3)
list1.add(-13)
list1.add(-5)
list1.add(5)
list1.remove(5)
list1.add(4)
list1
list1.sort(null)
list1
static Comparator<String> scoreComparator = new Comparator<String>(){
    public int compare (String w1, String w2){
        return Integer.compare(score(w1), score(w2));
    }
};
List<String> list2 = new ArrayList<>();
list2.add("rrr")
list2.add("aaa")
list2.add("rrirrurr")
list2.add("rriaaaaa")
list2.add("rrrrrrrrrrrrjdjf")
list2
static List<String> rankedWords(List<String> words){
    words.sort(scoreComparator);
    return words;
}
rankedWords(list2);
static List<String> rankedWords2(List<String> words){
    return words.stream().sorted(scoreComparator).collect(Collectors.toList());
}
list2.add("tt")
list2.add("hhf")
rankedWords2(list2)
list2
static List<String> rankedWords3(Comparator<String> comparator, List<String> words){
    return words.stream().sorted(comparator).collect(Collectors.toList());
}
rankedWords3(scoreComparator,list2)
static int scoreWithBonus(String word){
    int base = score(word);
    if (word.contains("f")) return base + 3;
    return base;
}
static Comparator<String> scoreComparatorWithBonus = new  Comparator<String>(){
    public int compare(String w1, String w2){
        return Integer.compare(scoreWithBonus(w1), scoreWithBonus(w2));
    }
};
rankedWords3(scoreComparatorWithBonus,list2)
static List<String> rankedWords4(Function<String, Integer> wordScore, List<String> words){
    Comparator<String> comparator = (w1, w2) -> Integer.compare(wordScore.apply(w1),wordScore.apply(w2));
    return words.stream().sorted(comparator).collect(Collectors.toList());
}
rankedWords4(w -> score(w),list2)
rankedWords4(w -> scoreWithBonus(w),list2)