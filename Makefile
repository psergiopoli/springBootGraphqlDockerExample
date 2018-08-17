docker-build:
	./gradlew build docker

up:
	docker-compose down
	docker-compose build
	docker-compose up -d
	docker-compose logs -f backend-java

down:
	docker-compose down

all:
	./gradlew clean
	./gradlew build docker
	docker-compose down
	docker-compose build
	docker-compose up -d
	docker-compose logs -f backend-java