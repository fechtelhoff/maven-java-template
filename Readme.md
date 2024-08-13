# Maven Java Template

Ein eigener Maven Archetype für ein einfaches Grundgerüst einer Java-Applikation.

Anleitung s. [Guide to Creating Archetypes](https://maven.apache.org/guides/mini/guide-creating-archetypes.html).

Dokumentation zum [Archetype Deskriptor](https://maven.apache.org/archetype/archetype-models/archetype-descriptor/archetype-descriptor.html)

Ausführen (installieren) durch:
```
mvn install
```

Nutzen über die IDE oder über:
```
mvn archetype:generate \
  -DarchetypeGroupId=com.example \
  -DarchetypeArtifactId=maven-java-template \
  -DarchetypeVersion=1.0-SNAPSHOT \
  -DgroupId=<my.groupid> \
  -DartifactId=<my-artifactId>
```

Beispiel
```
mvn archetype:generate -DarchetypeGroupId=com.example -DarchetypeArtifactId=maven-java-template -DarchetypeVersion=1.0-SNAPSHOT -DgroupId=my.groupid -DartifactId=test
``````

---
### Weitere Links
- [Creating Your Own Maven Archetype in 5 Simple Steps](https://rieckpil.de/create-your-own-maven-archetype-in-5-simple-steps)

- [Change package property in Maven Archetype (StackOverflow)](https://stackoverflow.com/questions/39080569/change-package-property-in-maven-archetype)
---
