








sudo docker build -t dvd_java_app:latest .
sudo docker run -it -p 8080:8080 --name java_app --link postgres_dvdrental dvd_java_app:latest


sudo docker build -t postgres_image:latest . --build-arg FILE=dvdrental.tar --build-arg DBNAME=dvdrental
sudo docker run  -d --name postgres_dvdrental -p 192.168.1.100:5432:5432 postgres_image
