# cs245-Assignment1-Sorting
cs245 - Assignment1 - Sorting


# Part 1

![Sort Algorithm Run Times](https://user-images.githubusercontent.com/69922895/110050632-2e4e6780-7d09-11eb-9a94-390355249774.png)

# Data used for chart above
![assignment 1 - part 1 data](https://user-images.githubusercontent.com/69922895/110051572-fd6f3200-7d0a-11eb-827a-e9e3cbfe39aa.png)

Also I spoke to Dennis during office hours in regards to my quicksort algorithm. My IDE (IntelliJ) gave me a stackedoverflow error when I run all the sorting algorithms
consecutively. But when I run the quicksort function by itself it works fine. And I was able to get the running times that way.  

# Part 2

For Part 2 I implemented a modified version of the Insertion Sort function as the quadratic algorithm within the hybridSort function. For quickSort the average run time was O(n^2). This was due to the random selection of the pivot for the partition, which may consistently skew the pivot to be either on the right or left side of the array. For Insertion Sort, the worst case for the running time is O(n), which is still better than the average running time for the quickSort algorithm. So when I implemented both algorthims into a hybridSort function, the InsertionSorts worst case becomes the dominant running time. Making the total run time of HybridSort O(n). because the lengths of the array were large values from range 50,000-500,000. I made the threshold length of an array to be 50,000. Any arrays equal to or lower than that length will be prompted to use the quadratic portion of hybridSort. 

As you can see, hybridSort runs much faster than QuickSort from Part 1

![hybrid sort run times](https://user-images.githubusercontent.com/69922895/110558078-b613e780-80f6-11eb-836d-7b567cffb2dc.png)







