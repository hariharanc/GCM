# GCM
In this application we are using google play service for android push notification using gcm.
Steps:
1.Create a new android application in google developer console you will get app project number
2.Enable the Gcm for your application
3.Then create api key your application
That's it now your ready to use gcm push notification in your application.So use this application project number to add your android project sender id
then you will get a register device id from gcm service use this id to send your server else you can check manually using curl request
in terminal enter this command

api_key="API_KEY"

reg_id="REGISTRATION_ID"

curl --header "Authorization: key=$api_key" --header Content-Type:"application/json" https://android.googleapis.com/gcm/send  -d "{\"registration_ids\":[\"$reg_id\"],\"data\":{\"name\":\"Android Push Notificaiton\"}}"


