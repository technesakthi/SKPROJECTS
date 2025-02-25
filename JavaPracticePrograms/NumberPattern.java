public class NumberPattern {
    public static void main(String[] args) {
        int n = 5;
        
        // Upper half
        for (int i = 1; i <= n; i++) {
            // Left side numbers
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            
            // Spaces in the middle
            int spaces = (i - 1) * 2;
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            
            // Right side numbers
            for (int j = n; j >= i; j--) {
                System.out.print(j + " ");
            }
            
            System.out.println();
        }
        
        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            // Left side numbers
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            
            // Spaces in the middle
            int spaces = (i - 1) * 2;
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            
            // Right side numbers
            for (int j = n; j >= i; j--) {
                System.out.print(j + " ");
            }
            
            System.out.println();
        }
    }
}