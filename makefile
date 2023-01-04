Main.class: Main.java Gnar.class Pet.class HasEmotions.class NeedsFood.class
	javac Main.java
Gnar.class: Gnar.java
	javac Gnar.java
Pet.clas: Pet.java
	javac Pet.java
HasEmotions.class: HasEmotions.java
	javac HasEmotions.java
NeedsFood.class: NeedsFood.java

run: Main.class
	java Main
clean:
	 rm *.class

