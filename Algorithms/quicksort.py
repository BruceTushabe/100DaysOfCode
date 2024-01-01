# This program is for implementing a quicksort algorithm

def partition(array, low, high):

    #choose the rightmost element as a pivot

    pivot = array[high]

    # pointer for a greater element
    i = low - 1

    # traverse through all elements
    # compare each element with a pivot

    for j in range(low, high):
        if array[j] <= pivot:
            # if element smaller than pivot is found
            # swap it with the greater element pointed by i
            i = i + 1

            # swapping element at i with element at j
            (array[i], array[j]) = (array[j], array[i])

    # swap the pivot element with the greater element specified by i
    (array[i + 1], array[high]) = (array[high], array[i + 1])

    # return the position from where partition is done 

    return i + 1
# function to perfom quicksort

def quicksort(array, low, high):
    if low < high:
        # Find the pivot element such that
        # elements smaller than pivot are on the left 
        # elements greater than pivot are on the right
        pi = partition(array, low, high)

        # Recursive call on the left of the pivot
        quicksort(array, low, pi -1)

        # Recursive cal on the right of the pivot
        quicksort(array, pi + 1, high)

data = [1, 7, 4, 10, 9 , -2]
print("Unsorted Array")
print(data)

size = len(data)

quicksort(data, 0, size - 1)
print("Sorted Aarray in Ascending Order: ")
print(data)


