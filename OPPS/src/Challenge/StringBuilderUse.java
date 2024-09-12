package Challenge;



public class StringBuilderUse {
    public static void main(String[] args) {
        char [] nameAlpha= new char[6];
        String name="Shivam";
        for (int i=0;i<6;i++){
            nameAlpha[i]=name.charAt(i);
            System.out.print(" "+name.charAt(i));
        }
        System.out.println();

        StringBuilder concatName=new StringBuilder();
        for (int i = 0; i <6 ; i++) {
            concatName.append(nameAlpha[i]);

        }
        System.out.println(concatName);


    }
}
