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

        String name = "my name is sunny";
        String name2 = name.substring(11);
        System.out.println(name2);
        System.out.println(name.substring(0,11));




    }
    
}
