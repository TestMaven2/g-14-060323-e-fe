function two_frogs(array) {

    let slow = 0;
    let fast = 0;

    while (fast != undefined) {

        fast = array[fast];

        if (slow === fast) {
            return "Есть петля!";
        }

        slow = array[slow];

        fast = array[fast];

        if (slow === fast) {
            return "Есть петля!";
        }
    }
    return "Нет петли.";
}

const array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 2];
console.log(two_frogs(array));