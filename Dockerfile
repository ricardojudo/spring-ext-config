FROM openjdk:8-jre-alpine

ARG user=java
ARG group=java
ARG uid=1000
ARG gid=1000
ARG home=/usr/src/myapp

COPY target/spring-ext-config-0.0.1-SNAPSHOT.jar /usr/src/myapp/spring-ext-config.jar
WORKDIR /usr/src/myapp

RUN adduser -h ${home} -u ${uid} -D -s /bin/ash ${user} && \
	chown -R ${user}:${gid} ${home}

USER ${user}
CMD ["java","-jar","spring-ext-config.jar"]