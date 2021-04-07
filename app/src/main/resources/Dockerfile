FROM postgres
ENV POSTGRES_USER sqldemo
ENV POSTGRES_PASSWORD P4ssw0rd
ADD schema.sql /docker-entrypoint-initdb.d
EXPOSE 5432
