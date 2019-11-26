# estudo-spring-historico

-- rodando app spring
docker build -f Dockerfile -t spring-server-generated .
docker run -e "SPRING_PROFILES_ACTIVE=dev" -p 8081:8081 -t spring-server-generated

dependencias 
-- rodando mongoDB
docker run -d -p 27017:27017 -p 28017:28017 -e AUTH=no tutum/mongodb
