# Number in words

That's a proof of concept to test the performance between a function in Java and Python.
For that test, I used IBM Cloud Functions, Java 8 and Python 3.

## Building

### Java

The first step is to package your Java code.
```
cd number-in-words-java/
mvn clean package
```

After that, you need to create the function in the IBM Cloud (If you aren't logged in you'll need to run `bx login`).
```
bx wsk action create numberInWordsJava target/number-in-words-1.0-SNAPSHOT-jar-with-dependencies.jar --main br.com.evandropires.numberinwords.function.NumberInWordsFunction --web true
```

The last step for the Java function is to create a REST API for that function.
```
bx wsk api create /number-in-words /java get numberInWordsJava --response-type json
```

### Python

For setup the Python function you just need to create the function and after create the REST API, like below.
```
cd number-in-words-python/
```

Create the function.
```
bx wsk action create numberInWordsPython numberInWordsPython.py --web true
```

Create the REST API.
```
bx wsk api create /number-in-words /python get numberInWordsPython --response-type json
```

## Running and testing

After you run the command that creates the REST API the command will return an URL. With this URL you will perform your tests using HTTP requests.
