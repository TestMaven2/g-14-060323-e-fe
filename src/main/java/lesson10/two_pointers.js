function two_pointers(array, target) {

    let left = 0;
    let right = array.length - 1;

    while (left < right) {

        let sum = array[left] + array[right];

        if (sum == target) {
            return [array[left], array[right]];
        } else if (sum > target) {
            right--;
        } else {
            left++;
        }
    }
    return "Совпадений не нашлось";
}

const array = [1, 3, 5, 6, 7, 9, 12, 13, 16, 18, 20];
console.log(two_pointers(array, 20));