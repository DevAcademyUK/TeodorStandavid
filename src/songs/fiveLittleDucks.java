package songs;



public class fiveLittleDucks {

    public static void main (String[] args){

        int i = 5;
        while (i > 0) {
            System.out.println(i+" little ducks went swimming one day,");
            System.out.println("Over the hills and far away.");
            System.out.println("Mother duck said, ");
            int e = i;
            while (e>0){
                System.out.println("quack");
                e--;
            }
            System.out.println("And only " + i + " little ducks came back.");
            i--;
        }

    }


}
