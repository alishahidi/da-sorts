# Sorting Algorithms Showcase

## Overview

This repository showcases several sorting algorithms implemented in Java. The primary goal of this project is to learn and demonstrate how different sorting algorithms work and how they can be used to sort arrays in either ascending or descending order.

## Sorting Algorithms Included

The following sorting algorithms are implemented and showcased in this project:

- Bubble Sort
- Insertion Sort
- Merge Sort
- Quick Sort
- Selection Sort

Each sorting algorithm is implemented as a static method within its corresponding class located in the `org.alishahidi.sort` package.

## Sorting Algorithms Comparison

| Sorting Algorithm | Best Case Time Complexity | Average Case Time Complexity | Worst Case Time Complexity | Space Complexity | Stable Sort |
|-------------------|---------------------------|-----------------------------|---------------------------|------------------|-------------|
| Bubble Sort       | O(n)                      | O(n^2)                      | O(n^2)                    | O(1)             | Yes         |
| Insertion Sort    | O(n)                      | O(n^2)                      | O(n^2)                    | O(1)             | Yes         |
| Merge Sort        | O(n log n)                | O(n log n)                  | O(n log n)                | O(n)             | Yes         |
| Quick Sort        | O(n log n)                | O(n log n)                  | O(n^2)                    | O(log n)         | No          |
| Selection Sort    | O(n^2)                    | O(n^2)                      | O(n^2)                    | O(1)             | No          |

### Definitions:

- Best Case Time Complexity: The minimum time required to sort an array when it is already sorted in the desired order.
- Average Case Time Complexity: The expected time required to sort an array with random input data.
- Worst Case Time Complexity: The maximum time required to sort an array when it is sorted in the opposite order.
- Space Complexity: The amount of additional memory used by the sorting algorithm.
- Stable Sort: A sorting algorithm is stable if the relative order of equal elements is preserved after sorting.

#### Notes:

- Bubble Sort and Insertion Sort are simple algorithms with a time complexity of O(n^2) in both average and worst cases. They are best suited for small datasets or nearly sorted data.
- Merge Sort has a time complexity of O(n log n) in all cases, making it efficient for large datasets. It is a stable sort.
- Quick Sort has an average time complexity of O(n log n), but it can degrade to O(n^2) in the worst case. It is not stable but is widely used due to its efficiency on average.
- Selection Sort has a time complexity of O(n^2) in all cases and is not stable. It is generally not recommended for large datasets due to its inefficiency.

Choose the appropriate sorting algorithm based on the characteristics of your data and the performance requirements of your application.

## How It Works

The project contains a collection of sorting algorithms that can be used to sort an array of integers. The main class, `Main`, contains examples of how to use each sorting algorithm to sort an array.

To use any of the sorting algorithms, simply pass an integer array to the corresponding sort method. You can specify whether you want the array to be sorted in ascending or descending order by providing the appropriate flag.

For example, to sort an array in ascending order using the Bubble Sort algorithm, you can call the following:

```java
int[] myArray = {5, 2, 8, 1, 3};
BubbleSort.sort(myArray);
```
And to sort an array in descending order using the Quick Sort algorithm, you can call the following:
```java
int[] myArray = {5, 2, 8, 1, 3};
QuickSort.sort(myArray, true);
```

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Credits

The project is maintained by Ali Shahidi (https://github.com/alishahidi).
