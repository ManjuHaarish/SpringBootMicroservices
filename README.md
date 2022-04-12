# ActivityTracker

##Endpoint Curl commands

###get - all Activity List

curl --location --request GET 'http://localhost:8080/activity/getActivityList'

###Save - single Activity

curl --location --request POST 'http://localhost:8080/activity/saveActivity' \
--header 'Content-Type: application/json' \
--data-raw '{"name": "Technical wokshop","description": "workshop on Habitual Reading","fromDate":"2022-04-11 14:00:00","toDate":"2022-04-13 14:10:00"}'

###Update - single Activity

curl --location --request POST 'http://localhost:8080/activity/updateActivity/7' \
--header 'Content-Type: application/json' \
--data-raw '{"name": "Reading","description": "Habitual Reading","fromDate":"2022-04-12 14:00:00","toDate":"2022-04-12 14:10:00"}'


###Delete - By id Single Activity

curl --location --request DELETE 'http://localhost:8080/activity/deleteActivity?id=6'