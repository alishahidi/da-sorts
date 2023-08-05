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
