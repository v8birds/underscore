import * as _ from "lodash";

const data = [
    {code: 'a', b: '西瓜', c: '3'},
    {code: 'b', b: '苹果', c: '13'},
    {code: 'c', b: '葡萄', c: '23'},
    {code: 'd', b: '桃子', c: '33'},
    {code: 'e', b: '樱桃', c: '331'},
    {code: 'f', b: '哈密瓜', c: '43'},
];
const listToMap = (list, codeKey = 'a', valueKey = 'b') => {
    return _.chain(list)
        .map((d) => [d[codeKey], d[valueKey]])
        .filter(d => d[0] !== '1')
        .fromPairs()
        .value();
};

console.log(listToMap(data, 'code', 'b'));
console.log(listToMap(data, 'b', 'c'));
console.log(listToMap(data, 'code', 'c'));
