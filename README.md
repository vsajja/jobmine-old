# UI #


## Starting UI ##

grunt serve

## Full Build ##

grunt

# Server #

## Starting Server ##

./gradlew clean run -it

## kill server -- annoying port already in use issue ##

netstat -o -n -a | findstr 0.0:5050
taskkill /F /PID <pid>


# Heroku #

## test server ##

https://jobmine-app.herokuapp.com/index.html