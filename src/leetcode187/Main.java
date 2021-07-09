package leetcode187;

public class Main {
	public static void main(String[] args) {
		String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
		
		System.out.println("Input: " + s);
		
		FindRepeatedSequencesFunction solution = new FindRepeatedSequencesFunction();
		
		System.out.println("Solution: " + solution.findRepeatedDnaSequences(s));
	}
}
