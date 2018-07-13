# Introduction

This project aim is to learn how to use the condition jira-core classes in a simple plugin in Jira 7.


# Installation

To build this project you need the Atlassian SDK.

You can build the package using this command:

```
atlas-mvn clean package
```

You can install it manually in the admin panel of Jira or by command line using this command:

```
atlas-install-plugin --context-path /jira --http-port 8080 --username YOUR_USERNAME --password YOUR_PASSWORD
```