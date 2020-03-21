####une application Java/JDBC qui liste simplement  une table
####Hacked by GUIDDIR MEBROUK 



##cloner l’entrepôt  github
git clone git@github.com:MebroukGuiddir/dvdRental.git



##pour lancer le conteneur de la base de données
## sur la racine du projet
cd ./dvdRental/data
sudo docker build -t postgres_image:latest . --build-arg FILE=dvdrental.tar --build-arg DBNAME=dvdrental
sudo docker run  -d --name postgres_dvdrental -p 192.168.1.100:5432:5432 postgres_image



## La commande docker pour compiler et exécuter  l'application Java dans un conteneur
cd ./dvdRental
sudo docker build -t java_image:latest .
sudo docker run -it -p 8080:8080 --name java_app --link postgres_dvdrental java_image:latest

