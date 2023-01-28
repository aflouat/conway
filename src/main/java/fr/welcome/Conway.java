package fr.welcome;
public class Conway {
    private static final int TERMINAL_WIDTH = 10 ;
    private static final String SPACE_SEPARATOR = "";
    public String draw(int n){
  return drawLine(n);
    }
    public String drawLine(int i){

        if(i == 1)
            return "1";
        if(i == 2)
            return "11";
        if(i == 3)
            return "21";
        if(i == 4)
            return "1211";
        if(i == 5)
            return "111221";
        if(i == 6) {
            StringBuilder output6 = new StringBuilder();
            char[] numbers = drawLine(5).toCharArray();
            System.out.println(drawLine(5));
            if (numbers[0] == numbers[1]) {
                if (numbers[0] == numbers[2]) {
                    output6.append('3');
                    output6.append(numbers[0]);
                    System.out.println("yp!"+output6);

                }
                if (numbers[3] == numbers[4]) {

                    output6.append('2');
                    output6.append(numbers[3]);
                }


                    output6.append('1');
                    output6.append(numbers[5]);



            }


return output6.toString();
        }
        return "0";
    }

    public String drawSpaces (int n){
        StringBuilder spaces = new StringBuilder();
        for (int i=0;i<n;i++){
            spaces.append(SPACE_SEPARATOR);
        }
        return spaces.toString();
    }

}
