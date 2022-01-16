require("lodash")

const _= require("lodash");

// # 从[J ~ K]数组中选取N个随机数
// ### 参数为 J, K, N
// ### N 小于 K-J
// ### 结果不能包含重复数字

//_.shuffle([1, 2, 3, 4]); 返回打乱的新数组
// => [4, 1, 3, 2]

const randomNum = (j,k,n) =>{
    // console.log(_.shuffle(_.range(j,k)));
    // console.log(_.take(_.shuffle(_.range(j,k)),n));
    return _.take(_.shuffle(_.range(j,k)),n);
}
randomNum(1,8,5)