const _ = require('lodash')
const moment = require('moment')

const toArrayByStartEndMonth = (start, end) => {
    const a = moment(start)
    const b = moment(end)
    const startYear = _.map(_.range(a.month() + 1, 13), z => (a.year() + '-' + z))
    const betweenYear = a.year() < b.year() ? _.chain(_.range(a.year() + 1, b.year())).map(a => _.map(_.range(1, 13), z => (a + '-' + z))).flatten().value() : []
    const endYear = a.year() === b.year() ? [] : _.map(_.range(1, b.month() + 2), a => (b.year() + '-' + a))
    console.log([...startYear, ...betweenYear, ...endYear])
}
toArrayByStartEndMonth('2019-10', '2020-12')
