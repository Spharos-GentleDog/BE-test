#jdk 17 Image Start
FROM openjdk:17-alpine
#인자 정리 - jar
ARG JAR_FILE=build/libs/*.jar
# jar file copy
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar", "-Duser.timezone=Asia/Seoul", "/app.jar"]