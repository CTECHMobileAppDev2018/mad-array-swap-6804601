class ArraySwapper {
  
  public int[] arraySwap(int[] inputArray){
    
    // Swap the two items in "inputArray" and return the output
    int[] outputArray = new int[2];
    
    // put your code here
    int temp = 0,otherTemp = 0;
      inputArray[0] = temp;
      inputArray[1] = otherTemp;
      inputArray[1] = temp;
      inputArray[0] = otherTemp;
      return inputArray;
    
  }
  
  public static void main(String[] args) {
    
    ArraySwapper testSwapper = new ArraySwapper();
    
    int[] exampleInput = {1,2};
    int[] exampleOutput = testSwapper.arraySwap(exampleInput);
    
    if (exampleInput[0] != exampleOutput[1] || exampleInput[1] != exampleOutput[0]) {
      System.out.println("Swap failed");
    } else {
      System.out.println("Swap succeeded!");
    }
  }
}
