//  https://www.programiz.com/java-programming/online-compiler/

public final class Main {
   private static final String[] a = new String[12];

   static {
      a[0] = "";
      a[2] = "[>T\u05f7\u05885\t\u0006הי68\u0001ךמRh\u0003\u05ccրG0\u0006\u058dא0\u001a";
      a[4] = "AmB\u05cb\u058cav\u0011";
      a[6] = "KHSז֛pCS\u05cd";
      a[8] = "R;Uט֚gw@\u05cbֆt>Tל\u05c9cw@ט֚q _\u05cb\u058d";
      a[10] = "[/T\u0ee7ຸ5\u0018\u0006ໄ\u0ee96)\u0001໊\u0eeeRy\u0003ໜະG!\u0006ຝ\u0ee00\u000b";
   }
//(2, 2)
   public static void main(String[] args){
       String fuckyou = a(1,95);
       System.out.println("Length " + fuckyou.length() + "\n"+ fuckyou);
   }

   public static String a(int inputVar0, int inputVar1) {
      String alwaysNULLstring = null;
      if (0 != 0) { // this will always be true
         alwaysNULLstring = null;
         throw null;
      } else {
         Thread thread_something_for_anti_re = null;
         StackTraceElement[] stack_element_something_for_anti_re = null;
         int var6 = 0;
         int var7 = 0;
         char[] var8 = null; // this is going to be
         char[] var9 = null;
         int var10 = 0;
         byte var2 = 0;

         while(true) {
            while(true) {
               while(true) {
                  while(true) {
                     while(true) {
                        while(true) {
                           while(true) {
                              switch(var2) {
                              case 0:
                              case 6:
                                 alwaysNULLstring = a[inputVar0 * 2 + 1];
                                 if (alwaysNULLstring != null) {
                                    return alwaysNULLstring;
                                 }

                                 var2 = 2;
                                 continue;
                              case 1:
                                //THIS IS THE CASE WHERE WE WILL HAVE THE FUXING ANSWER
                                 return a[inputVar0 * 2 + 1] = new String(var9);
                              case 2:
                                 thread_something_for_anti_re = Thread.currentThread();
                                 var2 = 3;
                                 continue;
                              case 3:
                                 stack_element_something_for_anti_re = thread_something_for_anti_re.getStackTrace();
                                 var2 = 4;
                                 continue;
                              case 4:
                                 var6 = stack_element_something_for_anti_re[2].getClassName().hashCode();
                                 var2 = 5;
                                 continue;
                              case 5:
                                 var7 = stack_element_something_for_anti_re[2].getMethodName().hashCode();
                                 var2 = 7;
                                 continue;
                              case 7:
                                 var8 = a[inputVar0 * 2].toCharArray();
                                 var9 = new char[var8.length];
                                 var2 = 8;
                                 continue;
                              case 8:
                                 var10 = 0;
                                 break;
                              default:
                                 var9[var10] = (char)(var8[var10] ^ var10);
                                 ++var10;
                              }

                              while(var10 < var8.length) {
                                 int var12;
                                 switch(var10 % 5) {
                                 case 0:
                                    var12 = var8[var10] ^ 2;
                                    break;
                                 case 1:
                                    var12 = var8[var10] ^ inputVar1
                              ;
                                    break;
                                 case 2:
                                    var12 = var8[var10] ^ var6;
                                    break;
                                 case 3:
                                    var12 = var8[var10] ^ var7;
                                    break;
                                 case 4:
                                    var12 = var8[var10] ^ var7 + var6;
                                    break;
                                 case 5:
                                    var12 = var8[var10] ^ var10;
                                    break;
                                 default:
                                    throw null;
                                 }

                                 var9[var10] = (char)var12;
                                 ++var10;
                              }

                              var2 = 1;
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }
}