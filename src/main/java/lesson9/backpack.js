
const weight = [10, 30, 20];
const value = [60, 120, 100];
const capacity = 50;

// 60 / 10 = 6
// 120 / 30 = 4
// 100 / 20 = 5
//
// 1 стратегия (если нельзя распиливать вещи)
// 1. Берём 1 вещь, итого стоимость 60, свободное место 40
// 2. Берём 3 вещь, итого стоимость 160, свободное 20
// Результат: 160
//
// 2 стратегия (распиливать нельзя, но повторять вещи можно)
// 1. Берём 1 вещь 5 раз, итого стоимость 300.
// Результат: 300
//
// 3 стратегия (повторять нельзя, но можно распиливать)
// 1. Берём 1 вещь, итого стоимость 60, свободное место 40
// 2. Берём 3 вещь, итого стоимость 160, свободное 20
// 3. От 2 вещи отпиливаем кусок на 20 кг, итого стоимость 240.
// Результат: 240

function fillBackpack(weight, value, capacity) {
    
    debugger;
    let items = [];

    for (let i = 0; i < weight.length; i++) {
        items.push({weight: weight[i], value: value[i], cost: value[i] / weight[i]});
    }

    items.sort((a, b) => b.cost - a.cost);

    let totalValue = 0;
    let backpack = [];

    for (let i = 0; i < items.length; i++) {
        let currentItem = items[i];
        let currentWeight = currentItem.weight;
        let currentValue = currentItem.value;

        if (currentWeight <= capacity) {
            // Если вещь входит, кладём в рюкзак
            capacity = capacity - currentWeight;
            totalValue = totalValue + currentValue;
            backpack[i] = currentItem;
            currentItem.fraction = currentWeight;
        } else {
            // Если вещь не входит, отпиливаем от неё кусок нужного размера
            let fraction = capacity;
            currentValue = fraction * currentItem.cost;
            capacity = 0;
            totalValue = totalValue + currentValue;
            backpack[i] = currentItem;
            currentItem.fraction = fraction;
        }
    }

    console.log(backpack);
    console.log(totalValue);
    
}

fillBackpack(weight, value, capacity);