import java.util.Random;

public class WhileIfElse {

    public static void main(String[] args) {
        //initialization
        String information = "";
        String IIFResult = "";
        Random r = new Random();
        for(int i=0; i<10; i++){
            information += r.nextInt(10);
        }
        int j = 0;

        //IIF Start
        while(j<10){
            char c = information.charAt(j);
            if(c=='0') IIFResult += '0';
            else if(c=='1') IIFResult += '1';
            else if(c=='2') IIFResult += '2';
            else if(c=='3') IIFResult += '3';
            else if(c=='4') IIFResult += '4';
            else if(c=='5') IIFResult += '5';
            else if(c=='6') IIFResult += '6';
            else if(c=='7') IIFResult += '7';
            else if(c=='8') IIFResult += '8';
            else if(c=='9') IIFResult += '9';
            j++;
        }
        //IIF End

        //IIF Result
        System.out.println();
        System.out.println("*** While If-Else ***");
        System.out.println("Original Information:"+information);
        System.out.println("IIFResult:"+IIFResult);
    }
}
