import * as _ from "lodash";

const genRandomNum = (j, k, n) => {
    return _.chain(_.range(j, k)).shuffle().take(n).value();
};

const array = genRandomNum(3, 8, 3);
console.log(array);
