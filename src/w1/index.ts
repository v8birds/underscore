const _ = require('lodash');
const asTable = require('as-table');
const log = require('ololog').configure({locate: false});


const shuffle = (j, k, n) => {
    const r = _.chain(_.range(0, n)).map().value();
    log.red(r);
};

shuffle(0, 10, 3);
