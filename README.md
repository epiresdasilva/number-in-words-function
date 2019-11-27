# Number in words

That's a proof of concept to test the performance between a function in Java, Python, NodeJS and Java with Quarkus/GraalVM.
I'm using IBM Cloud Functions as the cloud provider.

## Deploy

To deploy these function we need, first of all, to build the Java project. The Quarkus function we will handle with it separetely.

Let's build our Java function:

```
cd number-in-words-java/
mvn clean package
```

After doing that, run the following command:
```
sls deploy
```

You must be logged in on the IBM Cloud using `ibmcloud login` command.

### Quarkus

Set it up the Quarkus and GraalVM environment: https://quarkus.io/guides/building-native-image

Build the native application
```
cd number-in-words-quarkus/
./mvnw package -Pnative.
```

Build the docker image
```
docker build -t epiresdasilva/number-in-words-quarkus .
```

Push it to the Docker Hub.
```
docker push epiresdasilva/number-in-words-quarkus
```

Create your function:
```
ibmcloud fn action create number-in-words-quarkus --docker epiresdasilva/number-in-words-quarkus
```

(Replace all references to `epiresdasilva` to your user)