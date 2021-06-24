compile:
	javac -cp .:src/com/elsys:Graphics:Graphics/LWJGL-linux/* Main.java

run:
	java -cp .:src/com/elsys:Graphics:Graphics/LWJGL-linux/* Main

clean:
	rm *.class src/com/elsys/*.class Graphics/*.class
