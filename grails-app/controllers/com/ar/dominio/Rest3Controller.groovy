package com.ar.dominio

import grails.converters.JSON

class Rest3Controller {


    def devuelvo200() {
//        def copyAsMap() {
//            ['id':bonusId, 'amount':amount, 'charge_id':chargeId,
//             'currency_id':currencyId, 'type':type,
//             'status':status, 'bonus_date':DateUtils.dateToText(bonusDate),
//             'user_id':custId, 'site_id':siteId ]
//        }
        def mapResult = [resultado:"ok llego"]

        def status = 200

        def result = render mapResult as JSON
        [response:result,status:status]

    }
}
