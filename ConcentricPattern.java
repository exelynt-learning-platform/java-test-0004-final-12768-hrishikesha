
public class ConcentricPattern {
    public static void main(String[] args) {
        int n = 4; 
        int size = 2 * n - 1; 
        
        
        for (int i = 0; i < size; i++) {
            
            for (int j = 0; j < size; j++) {
               
                int minDistance = Math.min(Math.min(i, j), 
                                          Math.min(size - 1 - i, size - 1 - j));
                
                
                int value = n - minDistance;
                
                
                System.out.print(value + " ");
            }
            
            System.out.println();
        }
    }
}