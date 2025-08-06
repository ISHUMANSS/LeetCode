/**
 * @param {number[]} fruits
 * @param {number[]} baskets
 * @return {number}
 */
var numOfUnplacedFruits = function(fruits, baskets) {
    let result = fruits.length;
    const tree = createTree(baskets.length);

    addArray(tree, baskets);
    calculateTree(tree);

    for (const fruit of fruits) {
        const pos = findLeftmostPos(tree, fruit);
        if (pos !== -1) {
            result--;
            removePos(tree, pos);
        }
    }

    return result;
};

var createTree = function (itemsCount) {
    if (itemsCount === 0) return [];

    let treeSize = 1;
    while (treeSize <= Math.floor(itemsCount / 2)) {
        treeSize <<= 1;
    }
    if (treeSize < itemsCount) {
        treeSize <<= 1;
    }
    treeSize = (treeSize << 1) - 1;

    return new Array(treeSize).fill(0);
};

var addArray = function (tree, arr) {
    let pos = Math.floor(tree.length / 2);
    for (const item of arr) {
        tree[pos++] = item;
    }
};

var calculateTree = function(tree) {
    const n = tree.length;
    for (let i = Math.floor(n / 2) - 1; i >= 0; i--) {
        const left = tree[(i << 1) + 1];
        const right = tree[(i << 1) + 2];
        tree[i] = Math.max(left, right);
    }
};

var findLeftmostPos = function(tree, val) {
    if (tree[0] < val) return -1;

    const mid = Math.floor(tree.length / 2);
    let pos = 0;

    while (pos < mid) {
        const leftIdx = (pos << 1) + 1;
        const rightIdx = (pos << 1) + 2;
        if (tree[leftIdx] >= val) {
            pos = leftIdx;
        } else {
            pos = rightIdx;
        }
    }

    return pos;
}

var removePos = function(tree, pos) {
    tree[pos] = 0;

    while (pos > 0) {
        let parent;
        if (pos & 1) {
            parent = pos >> 1;
        } else {
            parent = (pos >> 1) - 1;
        }

        const left = tree[(parent << 1) + 1];
        const right = tree[(parent << 1) + 2];
        const maxVal = Math.max(left, right);

        if (tree[parent] !== maxVal) {
            tree[parent] = maxVal;
            pos = parent;
        } else {
            break;
        }
    }
};