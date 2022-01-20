import * as _ from "lodash";

const asTable = require('as-table');
const log = require('ololog').configure({locate: false});

const shuffle = (j, k, n) => _.chain(_.range(j, k)).shuffle().take(n).value();

{
    const r = shuffle(0, 10, 3);
    log.red(r);
}
{
    const r = shuffle(0, 10, 3);
    log.red(r);
}



