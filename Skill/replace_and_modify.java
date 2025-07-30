package charlenght;

public class replace_and_modify {
	public static void main(String[] args) {
        String s = "ababab";
        System.out.println(s.replace('a', 'x'));         
        System.out.println(s.replace("ab", "xy"));     
        System.out.println(s.replaceAll("a.", "z"));    
        System.out.println(s.replaceFirst("ab", "xy")); 
    }
}
