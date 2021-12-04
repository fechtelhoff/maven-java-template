# Maven Template

Ein eigener Maven Archetype.

Anleitung s. [Guide to Creating Archetypes](https://maven.apache.org/guides/mini/guide-creating-archetypes.html).

Dokumentation zum [Archetype Deskriptor](https://maven.apache.org/archetype/archetype-models/archetype-descriptor/archetype-descriptor.html)

Ausführen (installieren) durch:
```
mvn install
```

Nutzen über die IDE oder über:
```
mvn archetype:generate \
  -DarchetypeGroupId=de.fechtelhoff \
  -DarchetypeArtifactId=maven-template \
  -DarchetypeVersion=1.0-SNAPSHOT \
  -DgroupId=<my.groupid> \
  -DartifactId=<my-artifactId>
```

Beispiel
```
mvn archetype:generate -DarchetypeGroupId=de.fechtelhoff -DarchetypeArtifactId=maven-template -DarchetypeVersion=1.0-SNAPSHOT -DgroupId=de.test -DartifactId=test
``````

---
### Anmerkungen

Die Datei `.gitignore` wird aktuell noch nicht mit dem führenden Punkt mit kopiert.
Daher wird die Datei erst einmal ohne diesen Punkt, also als `gitignore` in das neue Projekt kopiert
und muss dort manuell umbenannt werden.  

---
### Weitere Links
- [Creating Your Own Maven Archetype in 5 Simple Steps](https://rieckpil.de/create-your-own-maven-archetype-in-5-simple-steps)

---
