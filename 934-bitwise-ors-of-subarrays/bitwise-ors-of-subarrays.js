/**
 * @param {number[]} arr
 * @return {number}
 */
var subarrayBitwiseORs = function(arr) {
    let res = new Set();
    let cur = new Set();
    for (const x of arr) {
        let nxt = new Set([x]);
        for (const v of cur) {
            nxt.add(v | x);
        }
        for (const v of nxt) {
            res.add(v);
        }
        cur = nxt;
    }
    return res.size;
};