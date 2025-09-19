# learnings

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


 

