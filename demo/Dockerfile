# 1. 사용할 기본 이미지 (Java 17)
FROM eclipse-temurin:17-jdk-alpine

# 2. Gradle 빌드 수행을 위한 소스 복사
COPY . /app

# 3. 작업 디렉토리 설정
WORKDIR /app

# 4. Gradle을 사용하여 애플리케이션 빌드 (JAR 파일 생성)
RUN ./gradlew clean build || ./gradlew build

# 5. 애플리케이션 실행
CMD ["java", "-jar", "build/libs/demo-0.0.1-SNAPSHOT.jar"]