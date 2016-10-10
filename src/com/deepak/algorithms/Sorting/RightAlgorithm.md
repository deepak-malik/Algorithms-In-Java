Choosing the right Algorithm : 

Algorithm is a way of organizing data in a computer and it helps to use data efficiently. 
Data structure is an implementation of the interface provided by an Abstract Data Type. 
The developer must choose the appropriate Algorithm for better performance. 
If the developer chooses bad Algorithm, the system does not perform well. 
The Big O notation helps to analysis algorithm performance. 

1. Searching
- Searching is an algorithm that allows user to retrieve the data according to search criteria
    a) If the search item already sorted, you can choose the binary search.
    b) If the search item is not sorted, you can use linear search.
    c) If developer wants search element in order and memory-efficient, you can use Binary Search Trees
    d) If the developer wants to access elements by a key, you can use dictionary

2. Sorting
- Sorting is an algorithm that sorts the elements in the list with ascending or descending order.
    a) If you want sort linked list, you can use merge sort.
    b) If you want to start learn the sorting algorithm and looking for quick and simple sort, you can use bubble sort.
    c) If you want faster-sorting algorithm and worst case scenarios such as a perfectly sorted array, you can use quicksort
    d) when the data is nearly sorted or the elements are the small set, you can use Insertion Sort
    e) When you don’t need a stable sort and you care more about worst case performance, you can use Heap sort
    f) When the sorting uses queue with priority, you can use priority queue
    g) If you want to compare fewer times and work faster, you can use Bucket Sort
    h) If we have a system where write operations are extremely expensive and read operations are not, the developer can use selection sort
    i) If you want short the numeric or strings using less than, greater than and equal comparison, you can use radix sort

3. Recursive algorithms
- A recursive algorithm is an algorithm which calls itself with the subset of values.
    a) The iterative function is faster than recursive function. If you want speed, the developer can use iteration.
    b) When you want to make divide the problem and solve with same logic recursively, the developer can use recursion. It may be slower than an iterative solution.

4. Backtracking algorithms
- Backtracking is an algorithm that considers searching every possible combination in order to solve an optimization problem
    a) When you are able to adopt “partial candidate solution” and a relatively quick test of whether it can possibly be completed to a valid solution, you can use Backtracking

5. Divide and conquer algorithms
- Divide and conquer algorithm works by recursively breaking down a problem into sub-problems, until these become simple enough to be solved directly
    a) When you are able to divide the problem into sub problem of the same type, recursively solve the subproblems and finally combine the answer, you can use divide and conquer algorithm

6. Dynamic programming algorithms
- Dynamic programming is a method for solving a complex problem by breaking it down into a collection of simpler subproblems. If the subproblems have solution save the result for future reference to avoid solving the same problem again.
    a) When your recursive algorithm finds itself reaching the same situation many times, you can use dynamic programming memorization
    b) When you want to optimize the solution with solution each subproblem once and store the result into the table, you can use dynamic programming

7. Greedy algorithms
- A greedy algorithm is an algorithm that follows the problem-solving heuristic of making the locally optimal choice at each stage with the hope of finding a global optimum
    a) When you want follows the problem-solving heuristic of making the locally optimal choice at each stage with the hope of finding a global optimum, you can use the greedy algorithm.
    b) When you want to make the choice that looks best at the moment, Greedy algorithms and make global solution from the local solution, you can use greedy algorithm
    c) When the globally optimal solution can be arrived at by making a locally optimal (greedy) choice, you can use the greedy algorithm.

8. Branch and bound algorithms
- Branch and bound are an algorithm design paradigm for discrete and combinatorial optimization problems, as well as general real-valued problems
    a) When you are able to split the problem into sub problem and provide the solution for each problem set and check each branch with upper and lower bound which help to chive the optimal solution, you can choose the Branch and bound

9. Brute force algorithms
- Brute force algorithm goes through all possible solutions extensively.
    a) When you want to try with all possible candidates for the solution and checking whether each candidate satisfies the problem’s statement, you can use Brute force algorithm

10. Randomized algorithms
- A randomized algorithm is an algorithm that employs a degree of randomness as part of its logic.
    a) When you want to generate random order or using random number, you can use Randomized algorithm.

We discussed different algorithm and uses cases to choose the appropriate algorithm. When the candidate attends the technical coding interview or uses the application programming interface in software development, the candidate must choose the correct algorithm. If the candidate uses the incorrect algorithm, it may work. But the programs may fail with more data or with different use case.