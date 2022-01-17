var _ = require('lodash');

const originData = [
 {code:'a', b:'西瓜', c:'3'},
 {code:'b', b:'苹果', c:'13'},
 {code:'c', b:'葡萄', c:'23'},
 {code:'d', b:'桃子', c:'33'},
 {code:'e', b:'樱桃', c:'331'},
 {code:'f', b:'哈密瓜', c:'43'},
 ]

// 解决方案1
const data = _.chain(originData).keyBy('code').mapValues('b').value();
// 解决方案2111
const data = _.reduce(originData, (pre, cur) => {pre[cur.code] = cur.b; return pre},{});