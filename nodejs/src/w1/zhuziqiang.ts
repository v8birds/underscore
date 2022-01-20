import * as _ from "lodash";

const fruit = [
    {code: 'a', b: '西瓜', c: '3'},
    {code: 'b', b: '苹果', c: '13'},
    {code: 'c', b: '葡萄', c: '23'},
    {code: 'd', b: '桃子', c: '33'},
    {code: 'e', b: '樱桃', c: '331'},
    {code: 'f', b: '哈密瓜', c: '43'}
];
const Fn = (payload) => {
    const r = _.chain(payload).map(a => (a['code'] + ':' + a['b'])).value();
    const z = _.chain(payload).mapKeys('code').mapValues('b').value();
    console.log(r, z);
};
Fn(fruit);
