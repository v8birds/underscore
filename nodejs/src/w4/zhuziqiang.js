const _ = require('lodash')
const moment = require('moment')

const toArrayByStartEndMonth = (start, end) => {
    const s = moment(start)
    const e = moment(end)
    const startYear = _.map(_.range(s.month() + 1, 13), z => (s.year() + '-' + z))
    const betweenYear = s.year() < e.year() ? _.chain(_.range(s.year() + 1, e.year())).map(val => _.map(_.range(1, 13), z => (val + '-' + z))).flatten().value() : []
    const endYear = s.year() === e.year() ? [] : _.map(_.range(1, e.month() + 2), val => (e.year() + '-' + val))
    console.log([...startYear, ...betweenYear, ...endYear])
}
toArrayByStartEndMonth('2019-10', '2020-12')

const toArrayByStartEndMonth111 = (start, end) => {
        const s = moment(start)
        const e = moment(end)
        const r = _.
        chain(_.range(s.year(), e.year() + 1)).
        map(year => _.map(_.range(1, 13), month => (year + '-' + month))).flatten().
        filter(a => moment(a) >= s && moment(a) <= e).
        value()
    }
    toArrayByStartEndMonth111('2018-11', '2020-11')
