Array Reversal - Multiple Approaches  
This repository showcases different ways to reverse an array using various techniques in Java. Each approach has its own advantages and use cases.  

1. Approach 1: Using a Separate Array 
   - This method creates a new array and copies elements in reverse order.  
   - Time Complexity: O(N)  
   - Space Complexity: O(N) (due to extra array)  

2. Approach 2: Two-Pointer Approach (For Loop)
   - Uses two pointers, one starting from the beginning and the other from the end, swapping elements as they iterate towards the center.  
   - Implemented using a `for` loop.  
   - Time Complexity: O(N)  
   - Space Complexity: O(1) (In-place reversal)  

3. Approach 2.1: Two-Pointer Approach (While Loop) 
   - Same logic as Approach 2 but implemented using a `while` loop for flexibility.  
   - Time Complexity: O(N)  
   - Space Complexity: O(1)
     
4. Approach 3: Recursive Approach 
   - Uses recursion to swap elements without using loops.  
   - Base condition stops recursion when start index is greater than or equal to the end index.  
   - Time Complexity: O(N)  
   - Space Complexity: O(N) (due to recursive call stack)  

5. Approach 4: Stack-Based Approach
   - Pushes array elements onto a stack and then pops them back in reversed order.  
   - Time Complexity: O(N)  
   - Space Complexity: O(N) (due to stack storage)

Each approach is implemented with clarity, demonstrating different techniques to reverse an array efficiently.
