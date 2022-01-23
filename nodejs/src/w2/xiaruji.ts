import * as _ from "lodash";

// ```[{code:'a', b:'西瓜', c:'3'},
// {code:'b', b:'苹果', c:'13'},
// {code:'c', b:'葡萄', c:'23'},
// {code:'d', b:'桃子', c:'33'},
// {code:'e', b:'樱桃', c:'331'},
// {code:'f', b:'哈密瓜', c:'43'},
// ]
// ```
//
// 输出
//
// ```
// {
// a: '西瓜'，
// b: '苹果'
// …
// }
// ```


const fruits = [
    {code:'a', b:'西瓜', c:'3'},
    {code:'b', b:'苹果', c:'13'},
    {code:'c', b:'葡萄', c:'23'},
    {code:'d', b:'桃子', c:'33'},
    {code:'e', b:'樱桃', c:'331'},
    {code:'f', b:'哈密瓜', c:'43'}
]

const getFruit = (fruits) => {
    return _.chain(fruits).keyBy("code").mapValues("b").value();
};

getFruit(fruits);
