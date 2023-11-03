public class Ex06 {
	public static void sequence(int nbr) {
		
		if (nbr < 0) {
            return;
        } else if (nbr == 0) {
            System.out.println("1"); 
            return;
        }

        String currentTerm = "1";

        for (int i = 1; i <= nbr+1; i++) {
            System.out.println(currentTerm); 

            StringBuilder nextTerm = new StringBuilder();
            int count = 1;

            for (int j = 1; j < currentTerm.length(); j++) {
                if (currentTerm.charAt(j) == currentTerm.charAt(j - 1)) {
                    count++;
                } else {
                    nextTerm.append(count);
                    nextTerm.append(currentTerm.charAt(j - 1));
                    count = 1;
                }
            }

            nextTerm.append(count);
            nextTerm.append(currentTerm.charAt(currentTerm.length() - 1));
            currentTerm = nextTerm.toString();
        }
	}
}

