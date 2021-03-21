DB setup
-
https://github.com/aivars-playground/ps-first-spring-boot-app

Credits
-
https://github.com/dlbunker/ps-conference-demo-sample

Examples
-
```
====SPEAKERS

curl localhost:9000/api/v1/speakers

//add speaker
curl --header "Content-Type: application/json" \
    --request POST \
    --data '{"first_name":"A","last_name":"S","title":"dev","company":"my","speaker_bio":"writes code"}' \
    localhost:9000/api/v1/speakers

//update speaker
curl --header "Content-Type: application/json" \
    --request PUT \
    --data '{"first_name":"A","last_name":"S","title":"dev","company":"my","speaker_bio":"writes cool code"}' \
    localhost:9000/api/v1/speakers/49
    
curl localhost:9000/api/v1/speakers/49


====SESSIONS
curl localhost:9000/api/v1/sessions  

curl --header "Content-Type: application/json" \
    --request POST \
    --data '{"session_name":"my session","session_description":"something awesome","session_length":15}' \
    localhost:9000/api/v1/sessions
//i.e. 94    

curl --header "Content-Type: application/json" \
    --request PUT \
    --data '{"session_name":"my session","session_description":"something awesome (extended version)","session_length":30}' \
    localhost:9000/api/v1/sessions/94
    
curl --request DELETE localhost:9000/api/v1/sessions/94

curl localhost:9000/api/v1/sessions/94

//remove speakers
curl --header "Content-Type: application/json" \
    --request PUT \
    --data '{"session_name":"my session","session_description":"something awesome (extended version)","session_length":30,"speakers":[]}' \
    localhost:9000/api/v1/sessions/94

//add speaker
curl --header "Content-Type: application/json" \
    --request PUT \
    --data '{"session_name":"my session","session_description":"something awesome (extended version)","session_length":30,"speakers":[{"speaker_id":49}]}' \
    localhost:9000/api/v1/sessions/94
    
```
