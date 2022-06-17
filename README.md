# gitops-micro-beta

Per l'esecuzione e il testing in locale

```text
$ mvn clean package
$ docker build -t micro-beta:1.0.0 .
$ docker run -it --rm -p 8080:8080 micro-beta:1.0.0
```

Pull e run dell'immagine da Docker Hub
```text
$ docker pull afornaia/micro-alpha:1.0.0
$ docker run -it --rm -p 8080:8080 afornaia/micro-alpha:1.0.0
```