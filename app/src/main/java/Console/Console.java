package Console;

import java.util.Scanner;

public class Console implements IConsole {

    @Override
    public String readString(String text) {
        Scanner sc=new Scanner(System.in);
        String s="";
        boolean acceptZ=false;
        boolean acceptS=false;
        while(acceptZ==false||acceptS==false) {
            int countZ=0;
            int countS=0;
            try {
                System.out.print(text+" ");
                s = sc.nextLine();
                for(int i=0; i<s.length();i++){
                    s=s.replace(" ", "");
                    if(s.codePointAt(i)>47&&s.codePointAt(i)<58){
                        countZ=countZ+1;
                    }
                    if(s.codePointAt(i)>=0&&s.codePointAt(i)<32||s.codePointAt(i)==127){
                        s=s.substring(0, i)+s.substring(i+1);
                    }
                    if(s.codePointAt(i)>32&&s.codePointAt(i)<48||s.codePointAt(i)>57&&s.codePointAt(i)<65||s.codePointAt(i)>90&&s.codePointAt(i)<97||s.codePointAt(i)>122&&s.codePointAt(i)<127){
                        countS=countS+1;
                    }
                }
                if(countZ==0){
                    acceptZ=true;
                }
                if(countS==0){
                    acceptS=true;
                }
                if(acceptS==false||acceptZ==false){
                    System.out.println("Your input was not accepted. Please do not enter any numbers or special characters.");
                }
            } catch (Exception e) {
                System.out.println("Your input was not accepted. "+text);
            }
        }
        return s;
    }

    @Override
    public int readInteger(String text, int min, int max) {
        Scanner sc=new Scanner(System.in);
        int zahl=0;
        boolean accept=false;
        while(accept==false) {
            try {
                System.out.print(text+" ");
                zahl = sc.nextInt();
                if(zahl<=max&&zahl>=min){
                    accept=true;
                }else {
                    System.out.println("Your input was not accepted. ");
                }
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Your input was not accepted. "+text);
                accept=false;
                zahl=0;
                sc.nextLine();
            }
        }
        return zahl;
    }
}
