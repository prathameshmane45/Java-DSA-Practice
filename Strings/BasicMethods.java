public class BasicMethods {
    public static void main(String args[]){
        //Length function
        String s = "java";
        System.out.println(s.length());

        //CharAt method
        String str = "Hello, I am Electronics and Computer Science Student at PVPIT";
        System.out.println(str.length());
        System.out.println(str.charAt(4));

        // equals Method 
        String s1 = "prathamesh";
        String s2 = "prathamesh";
        System.out.println(s1.equals(s2));

        //equalsIgnoreCase Method
        String s3 = "prathAMESH";
        String s4 = "prathamesh";
        System.out.println(s3.equalsIgnoreCase(s4));


        // trim method
        String str2 = "             Hello, I am Electronics and Computer Science Student at PVPIT ";
        System.out.println(str2.trim());

        // substring method
        String str4 = "java development";
        System.out.println(str4.substring(3));
        System.out.println(str4.substring(4, 9));

        // indexOf method 
        String str5 = "java development";
        System.out.println(str5.indexOf("j"));
        System.out.println(str5.indexOf("d"));
        System.out.println(str5.indexOf("z"));

        // toUpper case method
        String str6 = "prathamesh mane";
        System.out.println(str6.toUpperCase());

        // toLowerCase method
        String str7 = "PRATHAMESH mane";
        System.out.println(str7.toLowerCase());

        // startWith method
        String str8 = "hello, I am Pvpit collage budhgoan";
        System.out.println(str8.startsWith("hello"));

        // endsWith method 
        String str9 = "hello, I am Pvpit collage budhgoan";
        System.out.println(str8.endsWith("budhgoan"));

        // contains method
        String str10 = "hello, I am Pvpit collage budhgoan";
        System.out.println(str10.contains("Pvpit"));


        // isEmpty method
        String str11 = "hello, I am Pvpit collage budhgoan";
        System.out.println(str11.isEmpty());

        // concat method 
        String str12 = "java ";
        str12 = str12.concat("developer");
        System.out.println(str12);

        // replace Method
        String str13 = "hello, I am Pvpit collage budhgoan";
        String re = str13.replace("e", "a");
        System.out.println(re);

        // split method
        String str14 = "hello, I am Pvpit collage budhgoan";
        String ch[] = str14.split(" ");
        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
        }


    }
}