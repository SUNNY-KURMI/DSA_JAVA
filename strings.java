public class strings {
    public static void main(String[] args){
        // String firstName = "sunny";
        // String lastName = "kurmi";
        // // concatenation
        // System.out.println(firstName + " " + lastName);

        // // charAt
        // for(int i=0;i<firstName.length();i++) {
        //     System.out.println("character at "+ i + " :" + firstName.charAt(i));
        // }

        //compare
        //c1 s1 > s2: +ve val
        //c2 s1 < s2: -ve val
        //c3 s1 == s2: 0
        // hello < wello  w>h  jo char last me ata hai uski val jyda hoti hai

        // String name1 = "hello";
        // String name2 = "wello";
        // if (name1.compareTo(name2) == 0){
        //     System.out.println("String are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }

        // System.out.println(name1.compareTo(name2));

        // substring(starting index,ending index)

        // String name = "my name is sunny";
        // String name2 = name.substring(11);
        // System.out.println(name2);
        // System.out.println(name.substring(0,11));

        // StringBuilder sb = new StringBuilder("Tony");
        // System.out.println(sb);

        // // CharAt 
        // System.out.println(sb.charAt(0));

        // //set char at index
        // sb.setCharAt(0,'P');
        // System.out.println(sb);

        // // insert char at index
        // System.out.println(sb.insert(0,"S"));

        // // .delete(starting ind,ending index)
        // sb.delete(0,2);
        // System.out.println(sb);

        // //.append
        // StringBuilder hel = new StringBuilder("h");
        // hel.append("e");
        // hel.append("l");
        // hel.append("l");
        // hel.append("o");
        // System.out.println(hel);

        // // .length
        // System.out.println(hel.length());

        // string reversed
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);

        for (int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length()-1-i;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);

        }
        System.out.println(sb);





    }
    
}
