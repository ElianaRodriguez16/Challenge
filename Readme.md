Automation Eliana Rodriguez
=============================
---

<details open="open">
<summary>Table of Contents</summary>

- [About](#about)
- [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
        - [Set up Properties](#set-up-properties)
        - [Running scripts](#running-scripts)
</details>

---

## About


## Getting Started

### Prerequisites


Before running the scripts, you must install and configure the following programs:

- [Java](https://www.oracle.com/mx/java/technologies/javase/javase-jdk8-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)
- [jdk 15]()


#### Set environment variables

To set the environment variables, we must open the Zsh environment file by executing the following command in a shell:
```shell
nano ~/.zshenv
```

Inside the Zsh environment file we must set the following environment variables:

    JAVA_HOME: Absolute PATH where JDK was installed.
    MAVEN_HOME: Absolute PATH where MAVEN was installed.

Example:

```shell
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-15.0.2.jdk/Contents/Home
export MAVEN_HOME=/Users/eliana/Documents/apache-maven-3.6.3
```
To update our shell with the new environment variables we must execute the following command:

```shell
source ~/.zshenv
```


To verify that the environment variables were set, we must execute the following commands:

```shell
echo $JAVA_HOME
```
The command should return the absolute path of JDK that we set in the Zsh environment file.

```shell
echo $MAVEN_HOME
```
The command should return the absolute path of Maven that we set in the Zsh environment file.


#### Set up Properties

We must configure the properties in the [config.properties](src/test/resources/config.properties) file with the following values
    
Example:

```properties
urlWebPage="url site web"

```

### Running scripts
Can be run by command line or the .xml files separately from the inteliJ IDEA IDE

To run the tests we can use the following commands as needed
In the following command we will be able to pass the device and the environment where we are going to execute the tests as parameters. the same are

Example:
```sh
mvn clean test -PRegression
```



