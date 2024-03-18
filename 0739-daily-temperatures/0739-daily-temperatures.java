class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
    Stack<Integer> helperStack = new Stack<>();

    int n = temperatures.length;
    int[] result = new int[n];

    for(int idx = n - 1; idx >= 0; idx--) {

      // Popping all indices with a lower or equal
      // temperature than the current index
      while(!helperStack.isEmpty()
          && temperatures[idx] >= temperatures[helperStack.peek()]) {
        helperStack.pop();
      }

      // If the stack still has elements,
      // then the next warmer temperature exists!
      if(!helperStack.isEmpty()) {
        result[idx] = helperStack.peek() - idx;
      }
      // Inserting current index in the stack
      helperStack.push(idx);
    }

    return result;
    }
}



/* class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        for(int i =0;i<n;i++)
            result[i] = 0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(temperatures[j] > temperatures[i]){
                    int days = j-i;
                    result[i] = days;
                    break;
                }
            }
        } 
        return result;
    }
}*/