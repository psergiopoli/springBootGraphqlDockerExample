#!/bin/sh
./wait-for-it.sh -t 0 $MYSQL_HOST:3306
java -Djava.security.egd=file:/dev/./urandom -jar app.jar