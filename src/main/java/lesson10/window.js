function find_max_sum_of_subarray(k, arr) {

    debugger;
    let maxSum = 0;
    let windowSum = 0;
    let start = 0;

    for (let end = 0; end < arr.length; end++) {

        windowSum += arr[end];
        if (end >= k - 1) {
            maxSum = Math.max(windowSum, maxSum);
            windowSum -= arr[start];
            start++;
        }
    }
    return maxSum;
}

const array = [1, 45, 2, 10, 23, 3, 1, 0, 20];
console.log(find_max_sum_of_subarray(4, array));