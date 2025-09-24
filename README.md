# DOCKER

Section1: Introduction

Section2: Getting Started

Section3 : Docker 101

Section4: Docker Images

Copy: FROM httpd:2.4
COPY . /usr/local/apache2/htdocs/
also one html page.
 we build this image 
 and view the web page we exposed the port
 docker build . -t myweb:1
 docker run -p 8080:80 myweb:1

then Copy vs add
FROM httpd:2.4
ADD website.tar.gz /usr/local/apache2/htdocs/

we tared the web page -    tar -czvf website.tar.gz -C website  
docker build . -t myweb:2 
 docker run -p 8080:80 myweb:2

 Run vs cmd vs entrypoint
 Run : Executes when we are running the image
 CMD and ENTRYPOINT : Executes when the container starts
   CMD : Is like addition para we want to send
   ENTRYPOINT : Determines the main process to run
 
 Expose a port:

 Docker images with different path and different names







> HouseKeeping

Deleting docker images

Image HouseKeeping
1 - docker image ls
docker image rm <image id from above cmd> 
or
-docker image rm <image name>

delete all image
docker image rm $(docker image ls -aq)


Container HouseKeeping

stop contains

docker container ls
docker container stop <container ID>

stop all
dockr container stop $(docker container ls -aq)


Pruning - if not used, delete it. 

docker container prune


- Naming container

docker container run -d -p 8080:80 --name=mywebserv httpd:2.4
 
 Now we can stop this container using the same name
  docker container stop mywebserv



- Volume Mounts - Volume allow us to take a folder on local machine or server and attach it directly inside the container.

 we will be using website2 folder for this  Docker -> website2
    docker container run -p 8082:80 -v  /Users/Learnings/learnings/Docker/website2:/usr/local/apache2/htdocs httpd:2.4

- Image tagging

  renaming tags
  docker tag myweb:1 mywebserver:latest


- Exec : Excecute a command in a running container
  eg we run a container 
   docker container run -d -p 8086:80 httpd:2.4
   then we do
   docker container exec -it 12eebf48fd10 /bin/bash
    cd htdocs
    echo "hello from inside" > index.html     <!-- overwrites index.html with the text "hello from inside" -->



> Docker Repositories 

It is a folder that stores all the docker images just like github repo but for docker images instead of code.

 Created a docker repo on docker hub names new_repo100
 build a image :  docker image build . -t port:1
 tahe the image: docker tag port:1 ajay9869/new_repo100:latest
 push images.  : docker image push ajay9869/new_repo100:latest
 <img width="854" height="523" alt="image" src="https://github.com/user-attachments/assets/45a8dff4-faed-425f-9312-27d10ea0261c" />


 - Advance Docker

 > Layers
  
  https://jessicagreben.medium.com/digging-into-docker-layers-c22f948ed612 

Ways to see image layers:
docker image history port:1
docker image inspect port:1

Make Image smaller by reducing number of Layers
1. Putting all instruction in single line
FROM ubuntu:16.04
RUN apt-get update
RUN apt install curl -y
RUN apt install ruby -y
RUN apt install python -y
RUN apt install build-essential -y
RUN apt install apache2 -y

this created a image size of 578 MB

FROM ubuntu:16.04
RUN apt-get update && \
 apt install curl -y && \
 apt install ruby -y && \
 apt install python -y && \
 apt install build-essential -y && \
 apt install apache2 -y

 this created a image size of 520 MB


2. Using export and import

docker container run layers:2
docker export container_ID > ./export.tar
cat export.tar| docker import - layers:3
docker image ls     this will show layers:3 will have less memort than layers:2, layers will have any history

3. Instead of large base images we can use small images










#          KUBERNETES

It is a wrapper for docker

pod - The smallest object in kubernetes. It is one or more container
ReplicaSet - Ensures N copies of a pod. It ensures a specified number of identical pods are always running.
 

Installing minikube and virtual box