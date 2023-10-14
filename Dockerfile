FROM openjdk:17

WORKDIR /opt/QuizFinal

COPY target/QuizFinal-1.0.3.war .

CMD ["java", "-jar", "QuizFinal-1.0.3.war"]