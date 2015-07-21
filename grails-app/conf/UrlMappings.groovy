class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

//        "/billing/users/$id/billing_info"(controller: "userBillingInfo", parseRequest: true){
//            action = [GET: 'getUserBillingInfo']
//        }

        "/log/incrementar" (controller: 'rest', parseRequest: true) {
            action = [GET: 'incrementarContador']
        }

        "/log/incrementar2" (controller: 'rest2', parseRequest: true) {
            action = [GET: 'incrementarContador']
        }

        "/log/devuelvo" (controller: 'rest3', parseRequest: true) {
            action = [GET: 'devuelvo200']
        }

        "/log/saludar" (controller: 'rest4', parseRequest: true) {
            action = [GET: 'saludar']
        }

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
