public class NumberPattern {
    public static void main(String[] args) {
        int n = 5;
        
        
        for (int i = 1; i <= n; i++) {
            
            for (int j = i; j <= n-1; j++) {
                System.out.print(j + " ");
            }
            
            int spaces = (i - 1) * 2;
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            
            
            for (int j = n; j >= i; j--) {
                System.out.print(j + " ");
            }
            
            System.out.println();
        }
        
        
        for (int i = n - 1; i >= 1; i--) {
            for (int j = i; j <= n-1; j++) {
                System.out.print(j + " ");
            }
            
            int spaces = (i - 1) * 2;
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            
            for (int j = n; j >= i; j--) {
                System.out.print(j + " ");
            }
            
            System.out.println();
        }
    }
}