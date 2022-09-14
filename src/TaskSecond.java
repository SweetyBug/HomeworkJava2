public class TaskSecond {
    public static void main(String[] args) {
        StringBuilder sql = new StringBuilder("select * from students where");
        String nul = "null";
        String str = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String newStr = str.substring(1, str.length()-1).replaceAll(" ", "");
        String[] word = newStr.split(",");
        for (int i = 0; i < word.length; i++) {
            String str1 = String.valueOf(word[i]);
            String name1 = getFirstName(str1);
            String name2 = getSecondName(str1);
            if ((!name2.equals(nul)) && (i == 0)) {
                sql.append(" " + name1);
                sql.append(" = ");
                sql.append("'" + name2 + "'");
            } else if (!name2.equals(nul)) {
                sql.append(" and");
                sql.append(" " + name1);
                sql.append(" = ");
                sql.append("'" + name2 + "'");
            }
        }
        System.out.println(sql);
    }
    static String getFirstName(String s) {
        int ind = s.lastIndexOf(":");
        String firstName = s.substring(1, ind-1);
        return firstName;
    }
    static String getSecondName(String s) {
        int ind = s.lastIndexOf(":");
        String secondName = s.substring(ind+2, s.length()-1);
        return secondName;
    }
}
