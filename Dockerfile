FROM openjdk:11

RUN mkdir /app

COPY src/main/java/ /app

WORKDIR /app

CMD java Main.java

# DOCKER IMAGE
#1. Create docker image
# docker build -t IMAGE_NAME .
#2. Run docker image
# docker run -i IMAGE_NAME


# PUSH DOCKER IMAGE
#1. Create docker repository
#2. Create tag
# docker tag IMAGE_NAME olgaturchak14/REPOSITORY_NAME
#3. Push image
# docker push olgaturchak14/REPOSITORY_NAME