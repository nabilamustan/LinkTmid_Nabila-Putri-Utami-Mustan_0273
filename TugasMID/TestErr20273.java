// Nabila Putri Utami Mustan , 13020210273
package testerr2.pkg0273;
public class TestErr20273 {
     public static void main(String[] args) {
        int j = 0;
        for(int i=0; i<10; i++) {
            j += i;
            if(i<j) {
                System.out.println(i);
            } else {
                System.out.println(j);
            }
        }
        do {
            j++;
        } while(j<10);
        
        while(j<10) {
            j++;
        };        
    }
}