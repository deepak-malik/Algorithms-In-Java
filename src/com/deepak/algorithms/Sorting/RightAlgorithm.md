**Choosing the right Algorithm**

Algorithm is a way of organizing data in a computer and it helps to use data efficiently. The developer must choose the appropriate Algorithm for better performance. If the developer chooses bad Algorithm, the system will not perform well. The Big O notation explained [here](../master/src/com/deepak/algorithms/Sorting/TimeAndSpaceComplexity.md) helps to analysis algorithm performance. 

Here is the explanation for usage of some common algorithms, 

**1. Searching** - Searching is an algorithm that allows user to retrieve the data according to search criteria. It can be used in below cases, 
- If items are already sorted, Binary search can be used.
- If items are not sorted, Linear search can be used.
- If you want to search elements in order and want memory efficiency, BST can be used.
- If you want to access elements by a key, you can use dictionary or HashMap or HashTable.

**2. Sorting** - Sorting is an algorithm that sorts the elements in the list using ascending or descending order. It can be used in below cases, 
- If you want to sort a linked list, you can use Merge Sort.
- If you are looking for quick and simple sort, you can use Bubble Sort.
- If you want faster-sorting algorithm and worst case scenarios such as a perfectly sorted array, you can use Quick Sort.
- when data is nearly sorted or elements are a small set, you can use Insertion Sort
- When you don’t need a stable sort and you care more about worst case performance, you can use Heap Sort.
- When the sorting uses queue with priority, you can use priority queue.
- If you want to compare fewer times and work faster, you can use Bucket Sort
- If we have a system where write operations are extremely expensive and read operations are not, then you can use Selection Sort.

**3. Recursive algorithms** - An algorithm which calls itself with the subset of values. It can be used in below cases, 
- The iterative function is faster than recursive function. If you want speed, you can use iteration.
- When you want to divide the problem and solve with same logic recursively, you can use recursion. It may be slower than an iterative solution.

**4. Backtracking algorithms** - Backtracking is an algorithm that considers searching every possible combination in order to solve an optimization problem. 
- When you are able to adopt “partial candidate solution” and a relatively quick test of whether it can possibly be completed to a valid solution, you can use Backtracking

**5. Divide and conquer algorithms** - Divide and conquer algorithm works by recursively breaking down a problem into sub-problems, until these become simple enough to be solved directly.
- When you are able to divide the problem into sub problem of the same type, recursively solve the subproblems and finally combine the answer, you can use divide and conquer algorithm

**6. Dynamic programming algorithms** - Dynamic programming is a method for solving a complex problem by breaking it down into a collection of simpler subproblems. If the subproblems have solution save the result for future reference to avoid solving the same problem again. You can use it, 
- When your recursive algorithm finds itself reaching the same situation many times, you can use dynamic programming memorization.
- When you want to optimize the solution with each subproblem once and store the result into the table, you can use dynamic programming.

**7. Greedy algorithms** - A greedy algorithm is an algorithm that follows the problem-solving heuristic of making the locally optimal choice at each stage with the hope of finding a global optimum.
- When you want to follow the problem-solving heuristic of making the locally optimal choice at each stage with the hope of finding a global optimum, you can use the greedy algorithm.
- When you want to make the choice that looks best at the moment, Greedy algorithms and make global solution from the local solution, you can use greedy algorithm
- When the globally optimal solution can be arrived at by making a locally optimal (greedy) choice, you can use the greedy algorithm.

**8. Branch and bound algorithms** - Branch and bound are an algorithm design paradigm for discrete and combinatorial optimization problems, as well as general real-valued problems
- When you are able to split the problem into sub problem and provide the solution for each problem set and check each branch with upper and lower bound which help to chive the optimal solution, you can choose the Branch and bound

**9. Brute force algorithms** - Brute force algorithm goes through all possible solutions extensively.
- When you want to try with all possible candidates for the solution and checking whether each candidate satisfies the problem’s statement, you can use Brute force algorithm

**10. Randomized algorithms** - A randomized algorithm is an algorithm that employs a degree of randomness as part of its logic.
- When you want to generate random order or using random number, you can use Randomized algorithm.