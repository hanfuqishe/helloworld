SRC = $(wildcard *.java)
EXE = $(SRC:.java=.class)

all: $(EXE)
	@echo Done.

$(filter %.class, $(EXE)): %.class:%.java
	javac  $<

clean:
	rm -f *.class
