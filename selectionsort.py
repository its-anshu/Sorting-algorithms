def selectionSort(arr):
    for i in range(len(arr) - 1):
        minIndex = i

        for j in range(i + 1, len(arr)):
            if arr[j] < arr[minIndex]:
                minIndex = j

        # Swap
        arr[i], arr[minIndex] = arr[minIndex], arr[i]

arr = [17, 34, 25, 49, 9]

print("Original Array:", *arr)
selectionSort(arr)
print("Sorted Array:", *arr)
