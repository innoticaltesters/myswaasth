from operator import itemgetter

users=[

    {"name": "page_title", "module": "MySwaasth"},
    {"name":"main_div_loaded","module":"Myswaasth"},
	{"name": "sign_in_div", "module": "MySwaasth"},
	{"name": "right_div", "module": "MySwaasth"},
    {"name": "http_request", "module": "MySwaasth"},
    {"name": "http_request_error_404", "module": "MySwaasth"}
]

def get_user(name):
    try:

        #return (user for user in users if user["name"]==next(name))
        return (user for user in users if user["name"]==name).__next__()


    except:
        print("\n User %s is not defined in the parameters , enter a valid user" %name)

