public class Tree {
  public static void main(String[] args) {
    int height = 10;
    int trunkWidth = height / 3;
    int trunkHeight = 3;

    drawTreeTop(height);
    drawTreeTrunk(height, trunkHeight, trunkWidth);
  }

  private static void drawTreeTop(int height) {
    int spaces = height;
    int stars = 1;

    for (int i = 0; i < height; i++) {
      System.out.print(" ".repeat(spaces));
      System.out.println("*".repeat(stars));

      spaces--;
      stars += 2;
    }
  }

  private static void drawTreeTrunk(int height, int trunkHeight, int trunkWidth) {
    int spaces = height - (trunkWidth / 2);
    
    for (int i = 0; i < trunkHeight; i++) {
        System.out.print(" ".repeat(spaces));
        System.out.println("*".repeat(trunkWidth));
    }
  }
}
