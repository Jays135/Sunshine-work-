class Main{
          public static void star(){
                   System.out.print("Sparkle");

          }
          public static void winter(int temp){ //winter sucks
                   if(temp>40){
                          System.out.print("*");
                          temp-=1;
                          winter(temp);
                   }
          }
          public static void main(String[]args){
                   winter(43);
                   star();
          }
}
