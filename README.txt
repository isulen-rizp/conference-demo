* SPRINGBOOT DataJPA

This course requires the PostgreSQL image running on the docker container.
*********************************************************************
Run with a different profile.

On run edit configurations, set VM options
# -Dspring.profiles.active={application-XXX.properties}
-Dspring.profiles.active=prod

*********************************************************************
For run Postgres image of docker use the next commands:

#Start the container already created with the name postgres-demo
docker start postgres-demo

#This command is for list the containers created and available
docker ps -a

#This command display the images available, (from an image you can create a container)
docker images


*********************************************************************
