// STATUS CODE: 1XX ----> INFORMATIONAL :

// STATUS CODE: 2XX ----> SUCCESS :
    // STATUS CODE: 200(OK) ----> REQUEST HAS SUCCEEDED
    // STATUS CODE: 201(CREATED) ----> REQUEST HAS BEEN FULFILLED & RESULTED IN A NEW RESOURCE BEING CREATED
    // STATUS CODE: 204(NO CONTENT) ----> SERVER HAS FULFILLED THE REQUEST BUT DOES NOT NEED TO RETURN AN ENTIRE-BODY, MIGHT WANT OT RETURN UPDATED META DATA INFORMATION

// STATUS CODE: 3XX ----> REDIRECTION
    // STATUS CODE: 301(MOVED PERMANENTLY) ----> REQUEST ASSIGNED NEW PERMANENT URL & FUTURE REFERENCES SHOULD USE ONE OF THE RETURNED URLS
    // STATUS CODE: 304(NOT MODIFIED) ----> CLIENT PERFORMED CONDITIONAL GET REQUEST & ACCESS IS ALLOWED, BUT DOCUMENT HAS NOT BEEN MODIFIED, SERVER SHOULD RESPOND WITH THIS STATUS CODE
    // STATUS CODE: 307(TEMPORARY REDIRECT) ----> REQUEST SHOULD BE REPEATED WITH ANOTHER URL, HOWEVER FUTURE REQUESTS CAN STILL USE THE ORIGINAL URL

// STATUS CODE: 4XX ----> CLIENT ERROR
    // STATUS CODE: 400(BAD REQUEST) ----> REQUEST NOT UNDERSTOOD BY SERVER DUE TO SYNTAX, CLIENT SHOULD NOT REPEAT THE REQUEST WITHOUT MODIFICATION
    // STATUS CODE: 401(UNAUTHORIZED) ----> SIMILAR TO 403 FORBIDDEN, BUT USED WHEN AUTHENTTCATION IS POSSIBLE BUT FAILED OR NOT YET BEEN PROVIDED
    // STATUS CODE: 403(FORBIDDEN) ----> REQUEST WAS A LEGAL REQUEST, BUT SERVER IS REFUSING TO RESPOND TO IT, AUTHENTICATION WILL MAKE NO DIFFERENCE
    // STATUS CODE: 404(NOT FOUND) ----> REQUESTED RESOURCE COULD NOT BE FOUND, SUBSEQUENT REQUESTS BY THE CLIENT ARE PERMISSABLE

// STATUS CODE: 5XX ----> SERVER ERROR
    // STATUS CODE: 500(INTERNAL SERVER ERROR) ----> SERVER ENCOUNCTERED AN UNEXPECTED CONDITION WHICH PREVENTED IT FROM FULLFILLING THE REQUEST
    // STATUS CODE: 502(BAD GATEWAY) ----> THE SERVER WHILE ACTING AS A PROXY OR GATEWAY, RECEIEVED AN INVALID RESPONSE FROM AN UPSTREAM SERVERIT ACCESSED IN ATTEMPT TO FULLFILL THE REQUEST



