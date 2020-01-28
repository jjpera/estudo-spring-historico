# estudo-spring-historico

-- rodando app spring
docker build -f Dockerfile -t jjpera/estudo-spring-historico .
docker run -p 8081:8081 -t jjpera/estudo-spring-historico

# para Docker toolbox
docker run -p 8081:8081 -e DB_DOMAIN=192.168.99.100 -t jjpera/estudo-spring-historico

dependencias 
-- rodando mongoDB
docker run -d -p 27017:27017 -p 28017:28017 -e AUTH=no tutum/mongodb
