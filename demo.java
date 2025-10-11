import java.util.Scanner;
public class demo{
    public static void main(String[]args) {
        Scanner Sc=new Scanner(System.in);

        /*int x=1,y=2;
        //y=(++x*2 + x++%2)/2;=2
       // y=++x+x++ ; y=4,x=3
        y+=x ; y=y+x;
        
        System.out.println("y="+y);
        System.out.println("x="+x); 
        int i=1;
        while (i++<=5) {
            System.out.println("i="+i);
            
        }*/

       // System.out.println("i#=");
       float g=0 ;
      
       float sum=0;
       int c =0;
       System.out.println("give me grade #"+c);
       while(g!=-1){
        g=Sc.nextFloat();
           sum+=g ;
           c++ ;
        System.out.println("give me grade#"+c);
        if(c>0){
            System.out.println("avg="+(sum/c));
            
         }
        
       }


       }

        

        
    }
