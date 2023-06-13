# 13-06-2023
SS23 - Rekursion


### 📝 Aufgabe:

Implementiert eine Methode die Rekursiv ab einem bestimmten Verzeichnis über eure Festplatte läuft und alle Dateinamen ausgibt. Auch Dateien die verschachtelt in Unterordnern liegen sollen ausgegeben werden.

- Erzeugt dafür eine neue Klasse ```FileUtil```
- Die Methode soll ```printDirectory(File dir)``` heißen. ```File dir``` ist dabei das Startverzeichnis.
- Ihr werdet folgende Methoden aus der ```File``` Klasse brauchen:
  - ```getCanonicalPath()```
  - ```listFiles()``` 
  - ```isDirectory()```


-------------------------

- Ändert die Methode zu einer Such-Methode ab.
- Die Methode soll jetzt eine Datei suchen können und gibt dann das genaue Verzeichnis zurück in dem dieses File liegt
- ```searchDirectory(File dir, String filename)```



### ℹ️ Resourcen:
Hier noch ein paar nützliche 📃Artikel, 🖊️Threads und 🎥Videos

- [🎥 Rekursion einfach erklärt](https://www.youtube.com/watch?v=weTpjhDnLnc)

- [📃 Iteration und Rekursion - Java](https://java-tutorial.org/iteration_und_rekursion.html)

- [🖊️ Stack Overflow - Are recursive methods always better than iterative methods in Java?](https://stackoverflow.com/questions/15346774/are-recursive-methods-always-better-than-iterative-methods-in-java)
- [🖊️ Stack Overflow - Benefits of recursion in Java?](https://stackoverflow.com/questions/8573116/what-is-the-benefit-of-using-or-creating-recursive-functions-in-java)


